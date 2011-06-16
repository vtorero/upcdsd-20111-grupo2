package pe.edu.upc.dsd.service;

import java.util.List;

import pe.edu.upc.dsd.ws.bean.Cliente;
import pe.edu.upc.dsd.ws.bean.DocumentoPendiente;
import pe.edu.upc.dsd.ws.bean.Pedido;
import pe.edu.upc.dsd.ws.bean.Producto;

public interface Service 
{
	/**
	 * Obtiene el cliente segun su codigo.
	 * 
	 * @param codigo
	 * @return
	 */
	Cliente obtenerCliente(String codigo);
	
	/**
	 * Obtiene el pedido y su detalle segun el codigo enviado.
	 * 
	 * @param codigo
	 * @return
	 */
	Pedido obtenerPedido(String codigo);
	
	/**
	 * Registra un nuevo pedido del cliente.
	 * 
	 * @param pedido
	 * @return
	 */
	String registrarPedido(Pedido pedido);
	
	/**
	 * Obtiene el producto por el codigo solicitado.
	 * 
	 * @param codigo
	 * @return
	 */
	Producto obtenerProducto(String codigo);
	
	/**
	 * Obtiene el listado de productos por la categoria solicitada.
	 * 
	 * @param codigo
	 * @return
	 */
	List<Producto> obtenerProductosPorCategoria(String codigo);
	
	/**
	 * Obtiene los documentos pendientes de pago de un cliente.
	 * 
	 * @param codigo
	 * @return
	 */
	List<DocumentoPendiente> obtenerDocumentosPendientes(String codigo);
	
	/**
	 * Obtiene la linea de credito disponible del cliente.
	 * 
	 * @param codigo
	 * @return
	 */
	double obtenerLineaDeCredito(String codigo);
	
	/**
	 * Obtiene el stock del producto en el almacen.
	 * 
	 * @param codigo
	 * @return
	 */
	int obtenerStock(String codigo);
}