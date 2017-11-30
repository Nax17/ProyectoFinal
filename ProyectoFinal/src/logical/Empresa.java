package logical;

import java.util.ArrayList;

public class Empresa {
	private static Empresa main = null;
	private ArrayList<Trabajadores> misTrabajadores = new ArrayList<>();
	private ArrayList<Cliente> misClientes = new ArrayList<>();
	private ArrayList<Contrato> misContratos = new ArrayList<>();
	
	public static Empresa getInstance(){
		if(main == null){
			main = new Empresa();
		}
		return main;
	}
	
	public ArrayList<Trabajadores> getMisTrabajadores() {
		return misTrabajadores;
	}
	public ArrayList<Cliente> getMisClientes() {
		return misClientes;
	}
	public ArrayList<Contrato> getMisContratos() {
		return misContratos;
	}
	
	public Trabajadores findTrabajadorByNombre(String nombre){
		Trabajadores t = null;
		for (Trabajadores tr : misTrabajadores) {
			if(tr.getNombre().equalsIgnoreCase(nombre))
				t = tr;
		}
		return t;
	}
}
