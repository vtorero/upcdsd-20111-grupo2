package pe.edu.upc.dsd.service.impl;

import java.util.List;
import java.util.Random;

import pe.edu.upc.dsd.service.Service;
import pe.edu.upc.dsd.ws.AlmacenService;
import pe.edu.upc.dsd.ws.ClienteService;
import pe.edu.upc.dsd.ws.FinanzasService;
import pe.edu.upc.dsd.ws.PedidoService;
import pe.edu.upc.dsd.ws.ProductoService;
import pe.edu.upc.dsd.ws.bean.Cliente;
import pe.edu.upc.dsd.ws.bean.DocumentoPendiente;
import pe.edu.upc.dsd.ws.bean.Pedido;
import pe.edu.upc.dsd.ws.bean.Producto;
import pe.edu.upc.dsd.ws.bean.Stock;

public class ServiceImpl implements Service 
{
	private ClienteService clienteService;
	private ProductoService productoService;
	private PedidoService pedidoService;
	private FinanzasService finanzasService;
	private AlmacenService almacenService;
	
	/**
	 * @see pe.edu.upc.dsd.service.Service#obtenerCliente(java.lang.String)
	 */
	@Override
	public Cliente obtenerCliente(String codigo) 
	{		
		return clienteService.consultarCliente(codigo);
	}
	
	/**
	 * @see pe.edu.upc.dsd.service.Service#obtenerPedido(java.lang.String)
	 */
	@Override
	public Pedido obtenerPedido(String codigo) 
	{
		return pedidoService.obtenerPedido(codigo);
	}
	
	/**
	 * @see pe.edu.upc.dsd.service.Service#registrarPedido(pe.edu.upc.dsd.ws.bean.Pedido)
	 */
	@Override
	public String registrarPedido(Pedido pedido) 
	{
		return pedidoService.registrarPedido(pedido);
	}
	
	/**
	 * @see pe.edu.upc.dsd.service.Service#obtenerProducto(java.lang.String)
	 */
	@Override
	public Producto obtenerProducto(String codigo) 
	{
		return productoService.obtenerProducto(codigo);
	}
	
	/**
	 * @see pe.edu.upc.dsd.service.Service#obtenerProductosPorCategoria(java.lang.String)
	 */
	@Override
	public List<Producto> obtenerProductosPorCategoria(String codigo) 
	{
		return productoService.obtenerListaProducto(codigo);
	}
	
	/**
	 * @see pe.edu.upc.dsd.service.Service#obtenerDocumentosPendientes(java.lang.String)
	 */
	@Override
	public List<DocumentoPendiente> obtenerDocumentosPendientes(String codigo) 
	{
		return finanzasService.getDocumentosPendientes(codigo);
	}
	
	/**
	 * @see pe.edu.upc.dsd.service.Service#obtenerLineaDeCredito(java.lang.String)
	 */
	@Override
	public double obtenerLineaDeCredito(String codigo) 
	{
		return finanzasService.obtenerLineaCredito(codigo);
	}
	
	/**
	 * @see pe.edu.upc.dsd.service.Service#obtenerStock(java.lang.String)
	 */
	@Override
	public Stock obtenerStock(String codigo) 
	{
		return almacenService.obtenerStock(codigo);
	}

	/**
	 * @see pe.edu.upc.dsd.service.Service#generarNumeroPedido()
	 */
	@Override
	public String generarNumeroPedido() 
	{
		Random rnd = new Random();
		
    	int numero = 0;
    	
    	for (int i = 0; i < 10; i++) 
    	{
        	numero = (int)(rnd.nextDouble() * 10.0);
        }
    	
		return "PED00" + numero;
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