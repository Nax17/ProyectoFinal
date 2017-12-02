package logical;

import java.util.ArrayList;

public class LoginAdmin {
	private String nombre = "admin";
	private String contra = "admin";
	private ArrayList<LoginTrabajadores> trabajadores = new ArrayList<>();
	
	public void addTrabajador(LoginTrabajadores t){
		trabajadores.add(t);
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getContra() {
		return contra;
	}
	public void setContra(String contra) {
		this.contra = contra;
	}
}
