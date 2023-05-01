package FutsalPackage;

public class Expulsiones extends Evento{
	
	Equipo equipoQueTuvoExpulsado = null;

	public Expulsiones(Integer minutoExpulsion, Jugador jugadorQueRealizoEvento, Equipo equipoQueTuvoExpulsado) {
		super(minutoExpulsion,jugadorQueRealizoEvento);
		
		this.equipoQueTuvoExpulsado=equipoQueTuvoExpulsado;
	}

	public Equipo getequipoQueTuvoExpulsado() {
		return equipoQueTuvoExpulsado;
	}

	public void setequipoQueTuvoExpulsado(Equipo equipoQueRealizoLaExpulsion) {
		this.equipoQueTuvoExpulsado = equipoQueRealizoLaExpulsion;
	}
	
public String toString() {
		
		String mensaje="\nEquipo: " + equipoQueTuvoExpulsado.getEquipo()
						+"\nJugador: " + jugadorQueRealizoEvento.getNombre() +" "+ jugadorQueRealizoEvento.getApellido()
						+"\nMinuto: " + minuto;
		return mensaje;
	}
}
