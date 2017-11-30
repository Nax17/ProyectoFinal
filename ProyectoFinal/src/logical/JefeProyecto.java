package logical;

import java.util.ArrayList;

public class JefeProyecto extends Trabajadores{

		private int cantWorker;
		private ArrayList<Proyecto> misProyectos = new ArrayList<>();

		public JefeProyecto(String id, String nombre, String direccion, String sexo, int edad, long salario, String evaluacion, int cantWorker) {
			super(id, nombre, direccion, sexo, edad, salario, evaluacion);
			this.cantWorker = cantWorker;
		}
		public void addProyecto(Proyecto p){
			misProyectos.add(p);
		}
		public void removeProyecto(Proyecto p){
			misProyectos.remove(p);
		}

		public int getCantWorker() {
			return cantWorker;
		}

		public void setCantWorker(int cantWorker) {
			this.cantWorker = cantWorker;
		}


		public ArrayList<Proyecto> getMisProyectos() {
			return misProyectos;
		}


}
