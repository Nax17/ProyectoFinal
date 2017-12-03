package logical;

import java.util.ArrayList;

public class Planificador extends Trabajadores{

	private int diasFrecuencia;
	private ArrayList<Proyecto> misProyectos = new ArrayList<>();


	
	public Planificador(String id, String cedula, String nombre, String direccion, String sexo, int edad, long salario,
			String evaluacion, int diasFrecuencia, ArrayList<Proyecto> misProyectos) {
		super(id, cedula, nombre, direccion, sexo, edad, salario, evaluacion);
		this.diasFrecuencia = diasFrecuencia;
		this.misProyectos = misProyectos;
	}
	public void addProyecto(Proyecto p){
		misProyectos.add(p);
	}
	public void removeProyecto(Proyecto p){
		misProyectos.remove(p);
	}

	public int getDiasFrecuencia() {
		return diasFrecuencia;
	}

	public void setDiasFrecuencia(int diasFrecuencia) {
		this.diasFrecuencia = diasFrecuencia;
	}
	public ArrayList<Proyecto> getMisProyectos() {
		return misProyectos;
	}
	

}
