package FutsalPackage;

public class Gol extends Evento{
	
	Equipo equipoQueHizoGol=null;
	
	public Gol(Integer minuto, Jugador JugadorQueRealizoEvento, Equipo equipoQueHizoGol) {
		super(minuto,JugadorQueRealizoEvento);
		this.equipoQueHizoGol=equipoQueHizoGol;
	}

	public Equipo getEquipoQueHizoGol() {
		return equipoQueHizoGol;
	}

	public void setEquipoQueHizoGol(Equipo equipoQueHizoGol) {
		this.equipoQueHizoGol = equipoQueHizoGol;
	}
	
	public String toString() {
		
		String mensaje="\nEquipo: " + equipoQueHizoGol.getEquipo()
						+"\nJugador: " + jugadorQueRealizoEvento.getNombre() +" "+ jugadorQueRealizoEvento.getApellido()
						+"\nMinuto: " + minuto;
		return mensaje;
	}
	
}
