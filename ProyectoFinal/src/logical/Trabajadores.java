package logical;

public abstract class Trabajadores {

		protected String id;
		protected String cedula;
		protected String nombre;
		protected String direccion;
		protected String sexo;
		protected int edad;
		protected long salario;
		protected String evaluacion;
		protected int cantProyectosIncumplidos = 0;
		
		
		public Trabajadores(String id, String cedula, String nombre, String direccion, String sexo, int edad,
				long salario, String evaluacion) {
			super();
			this.id = id;
			this.cedula = cedula;
			this.nombre = nombre;
			this.direccion = direccion;
			this.sexo = sexo;
			this.edad = edad;
			this.salario = salario;
			this.evaluacion = evaluacion;
		}
		
		public String getCedula() {
			return cedula;
		}
		public void setCedula(String cedula) {
			this.cedula = cedula;
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
		public String getEvaluacion() {
			return evaluacion;
		}
		public void setEvaluacion(String evaluacion) {
			this.evaluacion = evaluacion;
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

}
