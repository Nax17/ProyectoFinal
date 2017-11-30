package logical;

public class Programador extends Trabajadores{
	private String lenguajes;
	private Proyecto proyecto;

	public Programador(String id, String nombre, String direccion, String sexo, int edad, long salario, String evaluacion, String lenguajes, Proyecto proyecto) {
		super(id, nombre, direccion, sexo, edad, salario, evaluacion);
		this.lenguajes = lenguajes;
		this.proyecto = proyecto;
	}

	public String getLenguajes() {
		return lenguajes;
	}

	public void setLenguajes(String lenguajes) {
		this.lenguajes = lenguajes;
	}

	public Proyecto getProyecto() {
		return proyecto;
	}

	public void setProyecto(Proyecto proyecto) {
		this.proyecto = proyecto;
	}
	

}
