package FutsalPackage;

import static org.junit.Assert.*;

import java.awt.Event;

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
		Integer dni2=20234002;
		
		EquiposEnum equipo = EquiposEnum.DEPORTIVO_GENSHIN;
		
		Integer valorEsperado=2;
		////////
		Equipo nuevoEquipo = new Equipo(equipo);
		Jugador nuevoJugador = new Jugador(nombre,apellido,precio,edad,dni);
		Jugador nuevoJugador2 = new Jugador(nombre2,apellido2,precio2,edad2,dni2);
		
		
		nuevoEquipo.agregarJugadorAlEquipo(nuevoJugador);
		nuevoEquipo.agregarJugadorAlEquipo(nuevoJugador2);
		
		
		////////
		assertEquals(valorEsperado,nuevoEquipo.getListaEquipos());
	}
	
	@Test
	public void calcularValorEquipo() {
		String nombre = "Pedro", apellido = "Pascal";
		Integer edad = 47;
		Double precio = 9.00;
		Integer dni=20234000;
		
		String nombre2 = "Pedro", apellido2 = "Pascal";
		Integer edad2 = 47;
		Double precio2 = 9.00;
		Integer dni2=20234002;
		
		EquiposEnum equipo = EquiposEnum.DEPORTIVO_GENSHIN;
		
		Double valorEsperado=18.00;
		////////////////////
		
		Equipo nuevoEquipo = new Equipo(equipo);
		Jugador nuevoJugador = new Jugador(nombre,apellido,precio,edad,dni);
		Jugador nuevoJugador2 = new Jugador(nombre2,apellido2,precio2,edad2,dni2);
		
		nuevoEquipo.agregarJugadorAlEquipo(nuevoJugador);
		nuevoEquipo.agregarJugadorAlEquipo(nuevoJugador2);
		
		assertEquals(valorEsperado,nuevoEquipo.calcularValorEquipo(),0.01);
		
	}
	
	@Test
	public void seCreaUnPartido() {
		
		EquiposEnum equipoLocalCLUB = EquiposEnum.DEPORTIVO_GENSHIN;
		EquiposEnum equipoVisitanteCLUB = EquiposEnum.BOCA;
		
		Equipo equipoLocal = new Equipo(equipoLocalCLUB);
		Equipo equipoVisitante = new Equipo(equipoVisitanteCLUB);
		
		EquiposEnum ve=EquiposEnum.DEPORTIVO_GENSHIN;
		
		//////
		
		Partido nuevoPartido=new Partido(equipoLocal, equipoVisitante);
		
		/////
		
		assertEquals(ve,nuevoPartido.getLocal().getEquipo());
		
	}
	
	@Test
		public void seRealizaUnEvento() {
		
		String nombre = "Pedro", apellido = "Pascal";
		Integer edad = 47;
		Double precio = 9.00;
		Integer dni=20234000;
		
		String nombre2 = "Papu", apellido2 = "Pascal";
		Integer edad2 = 23;
		Double precio2 = 12.00;
		Integer dni2=28774885;
		
		EquiposEnum equipoLocalCLUB = EquiposEnum.DEPORTIVO_GENSHIN;
		EquiposEnum equipoVisitanteCLUB = EquiposEnum.BOCA;
		
		Equipo equipoLocal = new Equipo(equipoLocalCLUB);
		Equipo equipoVisitante = new Equipo(equipoVisitanteCLUB);
		
		Jugador jugadorLocal = new Jugador(nombre,apellido,precio,edad,dni);
		Jugador jugadorVisitante = new Jugador(nombre2,apellido2,precio2,edad2,dni2);
		
		equipoLocal.agregarJugadorAlEquipo(jugadorLocal);
		equipoVisitante.agregarJugadorAlEquipo(jugadorVisitante);
		
		Integer minuto=15;
		
		
		String nombreJugadorQueMetioGol="Papu";
		
		//////
		
		Partido nuevoPartido=new Partido(equipoLocal, equipoVisitante);
		
		
		Evento nuevoEvento=new Evento(minuto, jugadorVisitante);
		
		/////
		
		
		
		assertEquals(nombreJugadorQueMetioGol,nuevoEvento.getJugadorQueRealizoEvento().getNombre());
		
	}
	
	@Test
	public void queSeaGol() {
	
	String nombre = "Pedro", apellido = "Pascal";
	Integer edad = 47;
	Double precio = 9.00;
	Integer dni=20234000;
	
	String nombre2 = "Papu", apellido2 = "Pascal";
	Integer edad2 = 23;
	Double precio2 = 12.00;
	Integer dni2=28774885;
	Gol nuevoGol;
	
	EquiposEnum equipoLocalCLUB = EquiposEnum.DEPORTIVO_GENSHIN;
	EquiposEnum equipoVisitanteCLUB = EquiposEnum.BOCA;
	
	Equipo equipoLocal = new Equipo(equipoLocalCLUB);
	Equipo equipoVisitante = new Equipo(equipoVisitanteCLUB);
	
	Jugador jugadorLocal = new Jugador(nombre,apellido,precio,edad,dni);
	Jugador jugadorVisitante = new Jugador(nombre2,apellido2,precio2,edad2,dni2);
	
	equipoLocal.agregarJugadorAlEquipo(jugadorLocal);
	equipoVisitante.agregarJugadorAlEquipo(jugadorVisitante);
	
	Integer minuto=15;
	Jugador jugadorQueRealizoEvento=jugadorVisitante;
	Equipo equipoQueRealizoElGol=equipoVisitante;
	
	//////
	
	Partido nuevoPartido=new Partido(equipoLocal, equipoVisitante);
	
	nuevoGol=new Gol(minuto, jugadorQueRealizoEvento, equipoQueRealizoElGol);
	
	nuevoPartido.seHizoGol(nuevoGol);
	
	/////
	
	assertEquals(1, nuevoPartido.getGolesPartido().size());
	
	}
	
	@Test
	public void queSeaAmonestado() {
	////////// Se inicializan variables de jugadores, partido, etc
	String nombre = "Pedro", apellido = "Pascal";
	Integer edad = 47;
	Double precio = 9.00;
	Integer dni=20234000;
	
	
	String nombre2 = "Papu", apellido2 = "Pascal";
	Integer edad2 = 23;
	Double precio2 = 12.00;
	Integer dni2=28774885;
	Amonestacion nuevaAmonestacion;
	
	EquiposEnum equipoLocalCLUB = EquiposEnum.DEPORTIVO_GENSHIN;
	EquiposEnum equipoVisitanteCLUB = EquiposEnum.BOCA;
	
	////////// Se inicializan equipos y jugadores
	
	Equipo equipoLocal = new Equipo(equipoLocalCLUB);
	Equipo equipoVisitante = new Equipo(equipoVisitanteCLUB);
	
	Jugador jugadorLocal = new Jugador(nombre,apellido,precio,edad,dni);
	Jugador jugadorVisitante = new Jugador(nombre2,apellido2,precio2,edad2,dni2);
	
	equipoLocal.agregarJugadorAlEquipo(jugadorLocal);
	equipoVisitante.agregarJugadorAlEquipo(jugadorVisitante);
	
	/////// Detalles del evento
	
	Integer minutoAmonestacion=40;
	Jugador jugadorQueRealizoEvento=jugadorVisitante;
	Equipo equipoQueRealizoLaAmonestacion=equipoVisitante;
	
	////// Se crea partido y evento
	
	Partido nuevoPartido=new Partido(equipoLocal, equipoVisitante);
	nuevaAmonestacion=new Amonestacion(minutoAmonestacion, jugadorQueRealizoEvento, equipoQueRealizoLaAmonestacion);
	
	///// Validaciones
	
	Integer a=1;
	
	assertTrue(nuevoPartido.seAmonesto(nuevaAmonestacion));
	assertEquals(1, nuevoPartido.getAmonestacionesPartido().size());
	assertEquals(a,nuevaAmonestacion.getJugadorQueRealizoEvento().getContAmon());
	
	}
	
	@Test
	public void queSeaExpulsadoDirectamente() {
	////////// Se inicializan variables de jugadores, partido, etc
	String nombre = "Pedro", apellido = "Pascal";
	Integer edad = 47;
	Double precio = 9.00;
	Integer dni=20234000;
	
	
	String nombre2 = "Papu", apellido2 = "Pascal";
	Integer edad2 = 23;
	Double precio2 = 12.00;
	Integer dni2=28774885;
	Expulsiones nuevaExpulsion, nuevaExpulsion2;
	
	EquiposEnum equipoLocalCLUB = EquiposEnum.DEPORTIVO_GENSHIN;
	EquiposEnum equipoVisitanteCLUB = EquiposEnum.BOCA;
	
	////////// Se inicializan equipos y jugadores
	
	Equipo equipoLocal = new Equipo(equipoLocalCLUB);
	Equipo equipoVisitante = new Equipo(equipoVisitanteCLUB);
	
	Jugador jugadorLocal = new Jugador(nombre,apellido,precio,edad,dni);
	Jugador jugadorVisitante = new Jugador(nombre2,apellido2,precio2,edad2,dni2);
	
	equipoLocal.agregarJugadorAlEquipo(jugadorLocal);
	equipoVisitante.agregarJugadorAlEquipo(jugadorVisitante);
	
	/////// Detalles del evento
	
	Integer minutoExpulsion=40;
	Jugador jugadorQueRealizoEvento=jugadorVisitante;
	Equipo equipoQueTuvoExpulsado=equipoVisitante;
	
	Integer minutoExpulsion2=41;
	Jugador jugadorQueRealizoEvento2=jugadorLocal;
	Equipo equipoQueTuvoExpulsado2=equipoLocal;
	////// Se crea partido y evento
	
	Partido nuevoPartido=new Partido(equipoLocal, equipoVisitante);
	nuevaExpulsion=new Expulsiones (minutoExpulsion, jugadorQueRealizoEvento, equipoQueTuvoExpulsado);
	nuevaExpulsion2=new Expulsiones (minutoExpulsion2, jugadorQueRealizoEvento2, equipoQueTuvoExpulsado2);
	
	nuevoPartido.seExpulso(nuevaExpulsion);
	nuevoPartido.seExpulso(nuevaExpulsion2);
	///// Validaciones
	
	assertEquals(nombre2,nuevaExpulsion.getJugadorQueRealizoEvento().getNombre());
	
	System.out.println(nuevoPartido.toString());
	}
	
}
