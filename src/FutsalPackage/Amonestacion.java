package FutsalPackage;

public class Amonestacion extends Evento{

	Equipo equipoQueRealizoLaAmonestacion = null;
	
	public Amonestacion(Integer minutoAmonestacion, Jugador jugadorQueRealizoEvento,
			Equipo equipoQueRealizoLaAmonestacion) {
		
		super(minutoAmonestacion,jugadorQueRealizoEvento);
		this.equipoQueRealizoLaAmonestacion=equipoQueRealizoLaAmonestacion;
	}

	public Equipo getEquipoQueRealizoLaAmonestacion() {
		return equipoQueRealizoLaAmonestacion;
	}

	public void setEquipoQueRealizoLaAmonestacion(Equipo equipoQueRealizoLaAmonestacion) {
		this.equipoQueRealizoLaAmonestacion = equipoQueRealizoLaAmonestacion;
	}
	
public String toString() {
		
		String mensaje="\nEquipo: " + equipoQueRealizoLaAmonestacion.getEquipo()
						+"\nJugador: " + jugadorQueRealizoEvento.getNombre() +" "+ jugadorQueRealizoEvento.getApellido()
						+"\nMinuto: " + minuto;
		return mensaje;
	}
}
