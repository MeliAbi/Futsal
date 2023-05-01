package FutsalPackage;

import java.util.ArrayList;

public class Partido {
	
	private Equipo local;
	private Equipo visitante;
	private ArrayList<Gol> golesPartido;
	private ArrayList<Amonestacion> amonestacionesPartido;
	private ArrayList<Expulsiones> expulsionesPartido;
	
	public Partido (Equipo local, Equipo visitante) {
		this.local=local;
		this.visitante=visitante;
		golesPartido=new ArrayList<Gol>();
		amonestacionesPartido=new ArrayList <Amonestacion>();
		expulsionesPartido =new ArrayList <Expulsiones>();
	}

	
	public void seHizoGol(Gol nuevoGol) {
		if(!nuevoGol.getJugadorQueRealizoEvento().getEstaExpulsado()) {
			golesPartido.add(nuevoGol);
		}
	}
	
	public Equipo getLocal() {
		return local;
	}

	public void setLocal(Equipo local) {
		this.local = local;
	}

	public Equipo getVisitante() {
		return visitante;
	}

	public void setVisitante(Equipo visitante) {
		this.visitante = visitante;
	}


	public ArrayList<Gol> getGolesPartido() {
		return golesPartido;
	}

	

	public ArrayList<Amonestacion> getAmonestacionesPartido() {
		return amonestacionesPartido;
	}


	public void setAmonestacionesPartido(ArrayList<Amonestacion> amonestacionesPartido) {
		this.amonestacionesPartido = amonestacionesPartido;
	}


	public void setGolesPartido(ArrayList<Gol> golesPartido) {
		this.golesPartido = golesPartido;
	}


	public Boolean seAmonesto(Amonestacion nuevaAmonestacion) {
		
		Integer amonActual = nuevaAmonestacion.getJugadorQueRealizoEvento().getContAmon();
		Boolean seAmonesto = false;
		Expulsiones nuevaExpulsion = null;
		
		if(amonActual<2 && nuevaAmonestacion.getJugadorQueRealizoEvento().estaExpulsado == false ) {
			seAmonesto=true;
			amonActual++;
			nuevaAmonestacion.getJugadorQueRealizoEvento().setContAmon(amonActual);
			amonestacionesPartido.add(nuevaAmonestacion);
		};
		if (seAmonesto== true && amonActual==2 && nuevaAmonestacion.getJugadorQueRealizoEvento().estaExpulsado == false){
			
			nuevaExpulsion.setMinuto(nuevaAmonestacion.getMinuto());
			nuevaExpulsion.setJugadorQueRealizoEvento(nuevaAmonestacion.getJugadorQueRealizoEvento());
			nuevaExpulsion.setequipoQueTuvoExpulsado(nuevaAmonestacion.getEquipoQueRealizoLaAmonestacion());
			
			nuevaAmonestacion.getJugadorQueRealizoEvento().setEstaExpulsado(true); 
			expulsionesPartido.add(nuevaExpulsion);
			
			amonActual=0;
			nuevaAmonestacion.getJugadorQueRealizoEvento().setContAmon(amonActual);
		}
			return seAmonesto;
	}


	public void seExpulso(Expulsiones nuevaExpulsion) {

		expulsionesPartido.add(nuevaExpulsion);
		
		Integer amonActual=0;
		nuevaExpulsion.getJugadorQueRealizoEvento().setEstaExpulsado(true);
		nuevaExpulsion.getJugadorQueRealizoEvento().setContAmon(amonActual);
		
	}

	public String toString() {
		String mensaje="";
		
		mensaje="********** RESULTADOS DEL PARTIDO **********"
				+ "\n"
				+ "\n" + "********** GOLES **********"
				+ "\n" +  golesPartido.toString()
				+ "\n********** AMONESTACIONES **********" 
				+ "\n" +  amonestacionesPartido.toString()
				+ "\n********** EXPULSADOS **********" 
				+ "\n" +  expulsionesPartido.toString();
				
		return mensaje;
	}
	
}
