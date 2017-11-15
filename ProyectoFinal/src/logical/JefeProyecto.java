package logical;

public class JefeProyecto extends Trabajadores{

		private int cantWorker;

		public JefeProyecto(String id, String nombre, String direccion, String sexo, int edad, long salario,
				Proyecto proyecto, String evaluacion, int cantWorker) {
			super(id, nombre, direccion, sexo, edad, salario, proyecto, evaluacion);
			this.cantWorker = cantWorker;
		}

		public int getCantWorker() {
			return cantWorker;
		}

		public void setCantWorker(int cantWorker) {
			this.cantWorker = cantWorker;
		}


}
