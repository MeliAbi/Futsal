package FutsalPackage;


public class Jugador {
	
	String nombre = "";
	String apellido= "";
	Double precio=0.0;
	Integer edad=0, dni=0;
	Integer contAmon;
	Boolean estaExpulsado;
	
	public Jugador(String nombre, String apellido,Double precio,Integer edad, Integer dni) {
		this.nombre=nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.precio= precio;
		this.dni=dni;
		this.contAmon=0;
		this.estaExpulsado=false;
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

	
	
	public Integer getContAmon() {
		return contAmon;
	}

	public void setContAmon(Integer contAmon) {
		this.contAmon = contAmon;
	}

	public Boolean getEstaExpulsado() {
		return estaExpulsado;
	}

	public void setEstaExpulsado(Boolean estaExpulsado) {
		this.estaExpulsado = estaExpulsado;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jugador other = (Jugador) obj;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		return true;
	}


	
}
