package logical;

public abstract class Trabajadores {

		protected String cedula;
		protected String nombre;
		protected String direccion;
		protected String sexo;
		protected int edad;
		protected long  salario;
		protected Proyecto proyecto;
		protected String evaluacion;
		
		public Trabajadores(String id, String nombre, String direccion, String sexo, int edad, long salario,
				Proyecto proyecto, String evaluacion) {
			super();
			this.cedula = id;
			this.nombre = nombre;
			this.direccion = direccion;
			this.sexo = sexo;
			this.edad = edad;
			this.salario = salario;
			this.proyecto = proyecto;
			this.evaluacion = evaluacion;
		}
		
		public String getId() {
			return cedula;
		}
		public void setId(String id) {
			this.cedula = id;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getDireccion() {
			return direccion;
		}
		public void setDireccion(String direccion) {
			this.direccion = direccion;
		}
		public String getSexo() {
			return sexo;
		}
		public void setSexo(String sexo) {
			this.sexo = sexo;
		}
		public int getEdad() {
			return edad;
		}
		public void setEdad(int edad) {
			this.edad = edad;
		}
		public long getSalario() {
			return salario;
		}
		public void setSalario(long salario) {
			this.salario = salario;
		}
		public Proyecto getProyecto() {
			return proyecto;
		}
		public void setProyecto(Proyecto proyecto) {
			this.proyecto = proyecto;
		}
		public String getEvaluacion() {
			return evaluacion;
		}
		public void setEvaluacion(String evaluacion) {
			this.evaluacion = evaluacion;
		}

}
