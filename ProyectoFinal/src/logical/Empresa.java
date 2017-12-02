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
		for (Trabajadores tr : misTrabajadores) {
			if(tr.getNombre().equalsIgnoreCase(nombre))
				return tr;
		}
		return null;
	}
	public Cliente findClienteByCed(String ced){
		for(Cliente cli : misClientes){
			if(cli.getCedula().equalsIgnoreCase(ced))
				return cli;
		}
		return null;
	}
}
