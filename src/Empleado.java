import javax.swing.JOptionPane;

public class Empleado {
	private String nombre;
	private int horasTrabajadas;
	private int salarioBase;
	private Departamento departamento;
	
	public Empleado(String nombre, int horasTrabajadas, int salarioBase, Departamento departamento) {
		super();
		this.nombre = nombre;
		this.horasTrabajadas = horasTrabajadas;
		this.salarioBase = salarioBase;
		this.departamento = departamento;
	}
	
	public Empleado() {
		this.nombre = "Indefinido";
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}
	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}
	public int getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(int salarioBase) {
		this.salarioBase = salarioBase;
	}
	public Departamento getDepartamento() {
		return departamento;
	}
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	@Override
	public String toString() {
		return "Empleado [Nombre=" + nombre + "\nHorasTrabajadas=" + horasTrabajadas + "\nSalarioBase=" + salarioBase
				+ "\nDepartamento=" + departamento + "]";
	}
	
	public void calcularSueldo() {
		if (nombre.isEmpty()) {
		JOptionPane.showMessageDialog(null, "No disponible");	
		}else {
			double total=0;
		total = this.salarioBase + this.departamento.getBonificacion() * this.horasTrabajadas;
		JOptionPane.showMessageDialog(null, "El sueldo de "+this.nombre+ "es de "+ total);
		}
		
		
	}
}
