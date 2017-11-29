package logical;

import java.util.Date;

public class Contrato {
	private Date fechaInicio;
	private Date fechaFinal;
	private String id;
	private Cliente cliente;
	private Proyecto proyecto;
	private long monto;
	
	public Contrato(Date fechaInicio, Date fechaFinal, String id, Cliente cliente, Proyecto proyecto, long monto) {
		super();
		this.fechaInicio = fechaInicio;
		this.fechaFinal = fechaFinal;
		this.id = id;
		this.cliente = cliente;
		this.proyecto = proyecto;
		this.monto = monto;
	}
	
	public Date getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public Date getFechaFinal() {
		return fechaFinal;
	}
	public void setFechaFinal(Date fechaFinal) {
		this.fechaFinal = fechaFinal;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Proyecto getProyecto() {
		return proyecto;
	}
	public void setProyecto(Proyecto proyecto) {
		this.proyecto = proyecto;
	}
	public long getMonto() {
		return monto;
	}
	public void setMonto(long monto) {
		this.monto = monto;
	}
}
