package FutsalPackage;

public class Gol extends Evento{
	
	Equipo equipoQueHizoGol=null;
	
	public Gol(Integer minuto, Jugador JugadorQueRealizoEvento, Equipo equipoQueHizoGol) {
		super(minuto,JugadorQueRealizoEvento);
		this.equipoQueHizoGol=equipoQueHizoGol;
	}
	
	
}
