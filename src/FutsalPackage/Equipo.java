package FutsalPackage;

import java.util.HashSet;
import java.util.Objects;

public class Equipo {
	
	private EquiposEnum equipo = null;
	private HashSet <Jugador> listaEquipo;
	
	public Equipo(EquiposEnum equipo) {
		this.equipo=equipo;
		this.listaEquipo = new HashSet <>();
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

	public HashSet<Jugador> getListaEquipos() {
		return listaEquipo;
	}

	public void setListaEquipos(HashSet<Jugador> listaEquipos) {
		this.listaEquipo = listaEquipos;
	}


	
	
	
	
}
