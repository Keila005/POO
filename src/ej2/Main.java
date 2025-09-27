package ej2;

import java.time.LocalDate;

import javax.swing.JOptionPane;

public class Main {
public static void main(String[] args) {
	String aerolinea=JOptionPane.showInputDialog("Ingrese el nombre de la aerolinea");
	Aerolinea aero1=new Aerolinea(aerolinea);
	String nombre=JOptionPane.showInputDialog("Ingrese su nombre");
	String dni=JOptionPane.showInputDialog("Ingrese su dni");
	Pasajero  p1=new Pasajero(nombre,dni);
	Vuelo volar=new Vuelo();
	String origen,destino;
	String []opciones = {
			"Ver información Personal",
			"Reservar vuelo",
			"Ver disponibilidad",
			"Salir"	
		};
	int opcion ;
	do {
		opcion= JOptionPane.showOptionDialog(null, "Elija que desea realizar", null, 0, 0, null, opciones, opciones[0]);
		switch (opcion) {
		case 0:
			JOptionPane.showMessageDialog(null, p1);
			break;
		case 1:
			LocalDate hoy=LocalDate.now();
		origen=volar.menuOrigen();
		destino=volar.menuDestino();
		volar=new Vuelo(origen,destino,hoy,aero1,20);
		p1.ReservarVuelo(volar);
			break;
		case 2:
			if (volar.getOrigen().isEmpty()) {
				JOptionPane.showMessageDialog(null,"Elija el origen y destino para ver su disponibilidad");
			}else {
				JOptionPane.showMessageDialog(null, "Se encuentra disponible:"+volar.getDisponibilidad()+" asientos");
			}
			break;
		default:
			break;
		}
	} while (opcion!=3);
}
}
