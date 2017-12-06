package logical;

import java.util.ArrayList;

public class Proyecto {
	private String id;
	private String nombre;
	private String descripcion;
	private ArrayList<Trabajadores> misTrabajadores;
	private String lenguaje;
	private String estado;
	
	public void addTrabajador(Trabajadores t){
		misTrabajadores.add(t);
	}
	
	
	public Proyecto(String id, String nombre, String descripcion, ArrayList<Trabajadores> misTrabajadores,
			String lenguaje, String estado) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.misTrabajadores = misTrabajadores;
		this.lenguaje = lenguaje;
		this.estado = estado;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public ArrayList<Trabajadores> getMisTrabajadores() {
		return misTrabajadores;
	}
	public void setMisTrabajadores(ArrayList<Trabajadores> misTrabajadores) {
		this.misTrabajadores = misTrabajadores;
	}
	public String getLenguaje() {
		return lenguaje;
	}
	public void setLenguaje(String lenguaje) {
		this.lenguaje = lenguaje;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}
}
