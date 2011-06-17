package pe.edu.upc.dsd.ws.bean;

public class Stock {

	private String codigoProducto;
	private String descripcion;
	private String stock;
	private String almacen;
	
	
	public String getCodigoProducto() {
		return codigoProducto;
	}
	public void setCodigoProducto(String codigoProducto) {
		this.codigoProducto = codigoProducto;
	}
	public String getAlmacen() {
		return almacen;
	}
	public void setAlmacen(String almacen) {
		this.almacen = almacen;
	}

	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getStock() {
		return stock;
	}
	public void setStock(String stock) {
		this.stock = stock;
	}
	
}
