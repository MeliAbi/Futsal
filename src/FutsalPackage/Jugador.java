package FutsalPackage;

import java.util.Objects;

public class Jugador {
	
	String nombre = "";
	String apellido= "";
	Double precio=0.0;
	Integer edad=0, dni=0;
	
	public Jugador(String nombre, String apellido,Double precio,Integer edad, Integer dni) {
		this.nombre=nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.precio= precio;
		this.dni=0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dni == null ) ? 0 : dni.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this.dni== ((Jugador)obj).dni) {
			return true;
		} else {
			return false;
		}
	}

	
}
