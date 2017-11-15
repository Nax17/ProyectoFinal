package logical;

public class Planificador extends Trabajadores{

	private int diasFrecuencia;

	public Planificador(String id, String nombre, String direccion, String sexo, int edad, long salario,
			Proyecto proyecto, String evaluacion, int diasFrecuencia) {
		super(id, nombre, direccion, sexo, edad, salario, proyecto, evaluacion);
		this.diasFrecuencia = diasFrecuencia;
	}

	public int getDiasFrecuencia() {
		return diasFrecuencia;
	}

	public void setDiasFrecuencia(int diasFrecuencia) {
		this.diasFrecuencia = diasFrecuencia;
	}
	

}
