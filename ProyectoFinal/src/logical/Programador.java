package logical;

public class Programador extends Trabajadores{
	private String lenguajes;

	public Programador(String id, String nombre, String direccion, String sexo, int edad, long salario,
			Proyecto proyecto, String evaluacion, String lenguajes) {
		super(id, nombre, direccion, sexo, edad, salario, proyecto, evaluacion);
		this.lenguajes = lenguajes;
	}

	public String getLenguajes() {
		return lenguajes;
	}

	public void setLenguajes(String lenguajes) {
		this.lenguajes = lenguajes;
	}
	

}
