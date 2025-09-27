package ej2;

public class Aerolinea {
	private String nombre;

	public Aerolinea(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Aerolinea [nombre=" + nombre + "]";
	}
}
