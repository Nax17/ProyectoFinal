package logical;

import java.util.ArrayList;

public class Designer extends Trabajadores{
	private ArrayList<Proyecto> misProyectos = new ArrayList<>();

	public Designer(String id, String nombre, String direccion, String sexo, int edad, long salario, String evaluacion) {
		super(id, nombre, direccion, sexo, edad, salario, evaluacion);
	}
	public void addProyecto(Proyecto p){
		misProyectos.add(p);
	}
	public void removeProyecto(Proyecto p){
		misProyectos.remove(p);
	}
	public ArrayList<Proyecto> getMisProyectos() {
		return misProyectos;
	}

}
