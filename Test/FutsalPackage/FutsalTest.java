package FutsalPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class FutsalTest {

	@Test
	public void seCreaUnJugador() {
		String nombre = "Pedro", apellido = "Pascal";
		Integer edad = 47;
		Double precio = 300000.00;
		Integer dni=20234000;
		////////
		Jugador nuevoJugador = new Jugador(nombre,apellido,precio,edad,dni);
		///////
		assertEquals(precio,nuevoJugador.getPrecio());
	}
	
	@Test
	public void seCreaUnEquipo() {
		EquiposEnum equipo = EquiposEnum.DEPORTIVO_GENSHIN;
		
		////////
		Equipo nuevoEquipo = new Equipo(equipo);
		////////
		assertEquals(equipo,nuevoEquipo.getEquipo());
	}
	
	@Test
	public void seAgreganJugadores() {
		String nombre = "Pedro", apellido = "Pascal";
		Integer edad = 47;
		Double precio = 300000.00;
		Integer dni=20234000;
		EquiposEnum equipo = EquiposEnum.DEPORTIVO_GENSHIN;
		////////
		Equipo nuevoEquipo = new Equipo(equipo);
		Jugador nuevoJugador = new Jugador(nombre,apellido,precio,edad,dni);
		
		
		////////
		assertTrue(nuevoEquipo.agregarJugadorAlEquipo(nuevoJugador));
	}
	
	@Test
	public void queNoSeRepitanJugadores() {
		String nombre = "Pedro", apellido = "Pascal";
		Integer edad = 47;
		Double precio = 300000.00;
		Integer dni=20234000;
		
		String nombre2 = "Pedro", apellido2 = "Pascal";
		Integer edad2 = 47;
		Double precio2 = 300000.00;
		Integer dni2=20234001;
		EquiposEnum equipo = EquiposEnum.DEPORTIVO_GENSHIN;
		////////
		Equipo nuevoEquipo = new Equipo(equipo);
		Jugador nuevoJugador = new Jugador(nombre,apellido,precio,edad,dni);
		Jugador nuevoJugador2 = new Jugador(nombre2,apellido2,precio2,edad2,dni2);
		
		
		nuevoEquipo.agregarJugadorAlEquipo(nuevoJugador);
		nuevoEquipo.agregarJugadorAlEquipo(nuevoJugador2);
		
		
		////////
		assertEquals(1,nuevoEquipo.getListaEquipos().size());
	}

}
