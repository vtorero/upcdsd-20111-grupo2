package pe.edu.upc.dsd.ws.bean;

public class Pedido {
	
	private String codigo; 
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getTipoPago() {
		return tipoPago;
	}

	public void setTipoPago(String tipoPago) {
		this.tipoPago = tipoPago;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public Integer getDescuento() {
		return descuento;
	}

	public void setDescuento(Integer descuento) {
		this.descuento = descuento;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	private String fecha; 
	private String tipoPago; 
	private String cliente; 
	//private Detalle detallePedidopedido; 
	private Integer descuento; 
	private Integer  total;
	
	public void Pedido (String codigo) {
		this.codigo = codigo;
	}

}
