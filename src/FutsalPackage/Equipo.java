package FutsalPackage;

import java.util.HashSet;


public class Equipo {
	
	private EquiposEnum equipo;
	private HashSet <Jugador> listaEquipo;
	private final Integer MAX_JUGADORES = 5;
	
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
		
		if(listaEquipo.size()<MAX_JUGADORES) { //NO DUPLICADO
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
