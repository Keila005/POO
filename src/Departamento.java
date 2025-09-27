import javax.swing.JOptionPane;

public class Departamento {
	private String sector;
	private Empresa empresa;
	private int bonificacion;
	public Departamento(String sector, Empresa empresa, int bonificacion) {
		super();
		this.sector = sector;
		this.empresa = empresa;
		this.bonificacion = bonificacion;
	}
	public Departamento() {
		this.sector="Indefinido";
	}
	public String getSector() {
		return sector;
	}
	public void setSector(String sector) {
		this.sector = sector;
	}
	public Empresa getEmpresa() {
		return empresa;
	}
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	public int getBonificacion() {
		return bonificacion;
	}
	public void setBonificacion(int bonificacion) {
		this.bonificacion = bonificacion;
	}
	@Override
	public String toString() {
		return "Departamento [sector=" + sector + ", empresa=" + empresa + ", bonificacion=" + bonificacion + "]";
	}
	public static String menuDepartamento() {
		String []opciones= {"Marketing","IT","Finanzas","Produccion","RRHH"};
		String seleccion=(String)JOptionPane.showInputDialog(null,"Seleccione la categoria","Categoria",0,null,opciones,opciones[0]);
		return seleccion;
	
	}
	public int bonificacionDepartamento(String departamento) {
		int numero;
		switch (departamento) {
		case "Marketing":
			numero=this.bonificacion=1000;
			break;
		case "IT":
			numero=this.bonificacion=2000;
			break;
		case "Finanzas":
			numero= this.bonificacion=3000;
			break;
		case "Produccion":
			numero=this.bonificacion=3500;
			break;
		 default:
	            numero = this.bonificacion = 0;
	            break;
		}
		return numero;

	}

}
