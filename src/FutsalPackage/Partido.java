package FutsalPackage;

import java.util.ArrayList;

public class Partido {
	
	private Equipo local;
	private Equipo visitante;
	private ArrayList<Gol> golesPartido;
	
	public Partido (Equipo local, Equipo visitante) {
		this.local=local;
		this.visitante=visitante;
		golesPartido=new ArrayList<Gol>();
	}

	
	public void seHizoGol(Gol nuevoGol) {
		golesPartido.add(nuevoGol);
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


	
}
