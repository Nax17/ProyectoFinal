package logical;

import java.util.ArrayList;

public class Proyecto {
	private String nombre;
	private String descripcion;
	private ArrayList<Trabajadores> misTrabajadores;
	private String lenguaje;
	
	public void addTrabajador(Trabajadores t){
		misTrabajadores.add(t);
	}
	
	
	public Proyecto(String nombre, String descripcion, String lenguaje) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.lenguaje = lenguaje;
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
}
