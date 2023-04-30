package FutsalPackage;

public class Evento {
 private Integer minuto=0;
 private Jugador jugadorQueRealizoEvento=null;
 
 public Evento(Integer minuto, Jugador jugadorQueRealizoEvento) {
	 this.minuto=minuto;
	 this.jugadorQueRealizoEvento=jugadorQueRealizoEvento;
 }

public Integer getMinuto() {
	return minuto;
}

public void setMinuto(Integer minuto) {
	this.minuto = minuto;
}

public Jugador getJugadorQueRealizoEvento() {
	return jugadorQueRealizoEvento;
}

public void setJugadorQueRealizoEvento(Jugador jugadorQueRealizoEvento) {
	this.jugadorQueRealizoEvento = jugadorQueRealizoEvento;
}
 
}
