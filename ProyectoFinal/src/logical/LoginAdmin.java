package logical;

public class LoginAdmin {
	private static String nombre = "admin";
	private static String contra = "admin";
	
	public static String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		LoginAdmin.nombre = nombre;
	}
	public static String getContra() {
		return contra;
	}
	public void setContra(String contra) {
		LoginAdmin.contra = contra;
	}
}
