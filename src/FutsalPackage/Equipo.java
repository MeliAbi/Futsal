package FutsalPackage;

import java.util.HashSet;


public class Equipo {
	
	private EquiposEnum equipo;
	private HashSet <Jugador> listaEquipo;
	
	
	public Equipo(EquiposEnum equipo) {
		this.equipo=equipo;
		this.listaEquipo = new HashSet <Jugador>();
	}

	public EquiposEnum getEquipo() {
		return equipo;
	}

	public void setEquipo(EquiposEnum equipo) {
		this.equipo = equipo;
	}

	public Boolean agregarJugadorAlEquipo(Jugador nuevoJugador) {
		Boolean resultado = false;
		
		if(listaEquipo.size()<5) { //NO DUPLICADO
			listaEquipo.add(nuevoJugador);
			resultado = true;
		}
		
		return resultado;
		
	}

	public Integer getListaEquipos() {
		return listaEquipo.size();
	}

	public Double calcularValorEquipo() {
		Double precioEquipo=0.0;
		
		for(Jugador jugador:listaEquipo) {
			precioEquipo+=jugador.getPrecio();
		}
		return precioEquipo;
	}

	


	
	
	
	
}
