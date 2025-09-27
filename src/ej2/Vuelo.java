package ej2;

import java.time.LocalDate;

import javax.swing.JOptionPane;

public class Vuelo {
	
	private String origen;
	private String destino;
	private LocalDate Fecha;
	private Aerolinea aerolinea;
	private int disponibilidad;
	public Vuelo(String origen, String destino, LocalDate fecha, Aerolinea aerolinea, int disponibilidad) {
		super();
		this.origen = origen;
		this.destino = destino;
		this.Fecha = fecha;
		this.aerolinea = aerolinea;
		this.disponibilidad =disponibilidad;
	}
	public Vuelo() {
	}
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public LocalDate getFecha() {
		return Fecha;
	}
	public void setFecha(LocalDate fecha) {
		Fecha = fecha;
	}
	public Aerolinea getAerolinea() {
		return aerolinea;
	}
	public void setAerolinea(Aerolinea aerolinea) {
		this.aerolinea = aerolinea;
	}
	public int getDisponibilidad() {
		return disponibilidad;
	}
	public void setDisponibilidad(int disponibilidad) {
		this.disponibilidad = disponibilidad;
	}
	@Override
	public String toString() {
		return "Vuelo [origen=" + origen + ", destino=" + destino + ", Fecha=" + Fecha + ", aerolinea=" + aerolinea
				+ ", disponibilidad=" + disponibilidad + "]";
	}
	
	public String menuOrigen() {
		String []origen= {"Bahia Blanca","Mendoza","San Juan","Salta","Neuquen"};
		String seleccion=(String)JOptionPane.showInputDialog(null,"Seleccione el origen","Origen",0,null,origen,origen[0]);
		return this.origen=seleccion;
	}
	
	public String menuDestino() {
		String []destino= {"Bahia Blanca","Mendoza","San Juan","Salta","Neuquen"};
		String seleccion=(String)JOptionPane.showInputDialog(null,"Seleccione el destino","Destino",0,null,destino,destino[0]);
		return this.destino=seleccion;
	}


}
