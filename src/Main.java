import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {

		String empresa=JOptionPane.showInputDialog("Ingrese el nombre de la empresa");
		Empresa emp1=new Empresa(empresa);
		Empleado p1=new Empleado();
		String nombre;
		int horas,salario;
		Departamento depar=new Departamento();
		String elegido;
		 String[] opciones = {"Ver empresa","Ingresar datos", "Ver sueldo", "Ver info", "Salir"};
	       int opcion;
	       do {
	           opcion = JOptionPane.showOptionDialog(null, "Elija alguna opción",
	                   "Empresa", 0,0, null, opciones, opciones[0]);
	          switch (opcion) {
			case 0:
				JOptionPane.showMessageDialog(null, emp1);
				break;
			case 1:	
				elegido=Departamento.menuDepartamento();
				int numero= depar.bonificacionDepartamento(elegido);
				 nombre=JOptionPane.showInputDialog("Ingrese su nombre");
				 horas=Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas trabajadas"));
				 salario=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el salario base"));;
				 depar=new Departamento(elegido,emp1,numero);
				p1=new Empleado(nombre,horas,salario,depar);
				break;
			case 2:
				p1.calcularSueldo();
             break;
			case 3:
				JOptionPane.showMessageDialog(null, p1);
		break;
			default:
				break;
			}
	       } while (opcion != 4);

	
		
	}
}
