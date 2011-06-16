package pe.com.upc.dsd.service.impl;

import java.util.List;

import pe.com.upc.dsd.service.Service;
import pe.com.upc.dsd.ws.AlmacenService;
import pe.com.upc.dsd.ws.ClienteService;
import pe.com.upc.dsd.ws.FinanzasService;
import pe.com.upc.dsd.ws.PedidoService;
import pe.com.upc.dsd.ws.ProductoService;
import pe.com.upc.dsd.ws.bean.Cliente;
import pe.com.upc.dsd.ws.bean.DocumentoPendiente;
import pe.com.upc.dsd.ws.bean.Pedido;
import pe.com.upc.dsd.ws.bean.Producto;

public class ServiceImpl implements Service 
{
	private ClienteService clienteService;
	private ProductoService productoService;
	private PedidoService pedidoService;
	private FinanzasService finanzasService;
	private AlmacenService almacenService;
	
	/**
	 * @see pe.com.upc.dsd.service.Service#obtenerCliente(java.lang.String)
	 */
	@Override
	public Cliente obtenerCliente(String codigo) 
	{		
		return clienteService.consultarCliente(codigo);
	}
	
	/**
	 * @see pe.com.upc.dsd.service.Service#obtenerPedido(java.lang.String)
	 */
	@Override
	public Pedido obtenerPedido(String codigo) 
	{
		return pedidoService.obtenerPedido(codigo);
	}
	
	/**
	 * @see pe.com.upc.dsd.service.Service#registrarPedido(pe.com.upc.dsd.ws.bean.Pedido)
	 */
	@Override
	public String registrarPedido(Pedido pedido) 
	{
		return pedidoService.registrarPedido(pedido);
	}
	
	/**
	 * @see pe.com.upc.dsd.service.Service#obtenerProducto(java.lang.String)
	 */
	@Override
	public Producto obtenerProducto(String codigo) 
	{
		return productoService.obtenerProducto(codigo);
	}
	
	/**
	 * @see pe.com.upc.dsd.service.Service#obtenerProductosPorCategoria(java.lang.String)
	 */
	@Override
	public List<Producto> obtenerProductosPorCategoria(String codigo) 
	{
		return productoService.obtenerListaProducto(codigo);
	}
	
	/**
	 * @see pe.com.upc.dsd.service.Service#obtenerDocumentosPendientes(java.lang.String)
	 */
	@Override
	public List<DocumentoPendiente> obtenerDocumentosPendientes(String codigo) 
	{
		return finanzasService.getDocumentosPendientes(codigo);
	}
	
	/**
	 * @see pe.com.upc.dsd.service.Service#obtenerLineaDeCredito(java.lang.String)
	 */
	@Override
	public double obtenerLineaDeCredito(String codigo) 
	{
		return finanzasService.obtenerLineaCredito(codigo);
	}
	
	/**
	 * @see pe.com.upc.dsd.service.Service#obtenerStock(java.lang.String)
	 */
	@Override
	public int obtenerStock(String codigo) 
	{
		return almacenService.obtenerStock(codigo);
	}

	/**
	 * @param clientService the clientService to set
	 */
	public void setClienteService(ClienteService clienteService) 
	{
		this.clienteService = clienteService;
	}

	/**
	 * @param productoService the productoService to set
	 */
	public void setProductoService(ProductoService productoService) 
	{
		this.productoService = productoService;
	}

	/**
	 * @param pedidoService the pedidoService to set
	 */
	public void setPedidoService(PedidoService pedidoService) 
	{
		this.pedidoService = pedidoService;
	}

	/**
	 * @param finanzasService the finanzasService to set
	 */
	public void setFinanzasService(FinanzasService finanzasService) 
	{
		this.finanzasService = finanzasService;
	}

	/**
	 * @param almacenService the almacenService to set
	 */
	public void setAlmacenService(AlmacenService almacenService) 
	{
		this.almacenService = almacenService;
	}
}