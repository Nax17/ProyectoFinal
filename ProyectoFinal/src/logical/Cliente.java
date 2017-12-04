package logical;

import java.util.ArrayList;

public class Cliente {
	private String idcli;
	private String cedula;
	private String nombre;
	private String direccion;
	private ArrayList<Proyecto> misProyectos;
	
	public void addProyecto(Proyecto p){
		misProyectos.add(p);
	}
	
	public Cliente(String idcli, String cedula, String nombre, String direccion) {
		super();
		this.idcli = idcli;
		this.cedula = cedula;
		this.nombre = nombre;
		this.direccion = direccion;
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
	public ArrayList<Proyecto> getMisProyectos() {
		return misProyectos;
	}
	public void setMisProyectos(ArrayList<Proyecto> misProyectos) {
		this.misProyectos = misProyectos;
	}

	public String getIdcli() {
		return idcli;
	}

	public void setIdcli(String idcli) {
		this.idcli = idcli;
	}
}
