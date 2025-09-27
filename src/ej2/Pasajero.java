package ej2;

import java.time.LocalDate;

import javax.swing.JOptionPane;

public class Pasajero {
	
	private String nombre;
	private String dni;
	private Vuelo vuelo;
	private int asiento;
	

	public Pasajero(String nombre, String dni, Vuelo vuelo, int asiento) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.vuelo = vuelo;
		this.asiento = asiento;
	}
	public Pasajero(String nombre, String dni) {
		super();
		this.nombre = nombre;
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public Vuelo getVuelo() {
		return vuelo;
	}
	public void setVuelo(Vuelo vuelo) {
		this.vuelo = vuelo;
	}
	public int getAsiento() {
		return asiento;
	}
	public void setAsiento(int asiento) {
		this.asiento = asiento;
	}
	@Override
	public String toString() {
		return "Pasajero [nombre=" + nombre + ", dni=" + dni + ", vuelo=" + ((vuelo==null)?"No tiene un vuelo":vuelo+ ", asiento=" + asiento) + "]";
	}
	
	public void ReservarVuelo(Vuelo vuelo) {
		if (vuelo.getFecha().isBefore(LocalDate.now())) {
			JOptionPane.showMessageDialog(null, "Ya pasó");
		}else {
			
		if (vuelo.getDisponibilidad()>0) {
			
			this.vuelo = vuelo;
			vuelo.setDisponibilidad(vuelo.getDisponibilidad()-1);
			this.asiento = (int)(Math.random()*100);
			JOptionPane.showMessageDialog(null, "Pudo sacar el pasaje, su asiento es: " + asiento);
		}else {
			JOptionPane.showMessageDialog(null, "No pudo no hay disponibilidad");
		}

		}
	}
}
