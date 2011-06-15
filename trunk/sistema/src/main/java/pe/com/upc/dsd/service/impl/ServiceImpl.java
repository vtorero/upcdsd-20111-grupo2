package pe.com.upc.dsd.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import pe.com.upc.dsd.model.Cliente;
import pe.com.upc.dsd.model.DocumentoPendiente;
import pe.com.upc.dsd.model.Pedido;
import pe.com.upc.dsd.model.Producto;
import pe.com.upc.dsd.service.Service;
import pe.com.upc.dsd.service.ws.ClienteService;
import pe.com.upc.dsd.service.ws.FinanzasService;
import pe.com.upc.dsd.service.ws.PedidoService;
import pe.com.upc.dsd.service.ws.ProductoService;

public class ServiceImpl implements Service 
{
	@Autowired
	private ClienteService clientService;
	@Autowired
	private ProductoService productoService;
	@Autowired
	private PedidoService pedidoService;
	@Autowired
	private FinanzasService finanzasService;
	
	/**
	 * @see pe.com.upc.dsd.service.Service#obtenerCliente(java.lang.String)
	 */
	@Override
	public Cliente obtenerCliente(String codigo) 
	{
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * @see pe.com.upc.dsd.service.Service#obtenerPedido(java.lang.String)
	 */
	@Override
	public Pedido obtenerPedido(String codigo) 
	{
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * @see pe.com.upc.dsd.service.Service#registrarPedido(pe.com.upc.dsd.model.Pedido)
	 */
	@Override
	public String registrarPedido(Pedido pedido) 
	{
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * @see pe.com.upc.dsd.service.Service#obtenerProducto(java.lang.String)
	 */
	@Override
	public Producto obtenerProducto(String codigo) 
	{
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * @see pe.com.upc.dsd.service.Service#obtenerProductosPorCategoria(java.lang.String)
	 */
	@Override
	public List<Producto> obtenerProductosPorCategoria(String codigo) 
	{
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * @see pe.com.upc.dsd.service.Service#obtenerDocumentosPendientes(java.lang.String)
	 */
	@Override
	public List<DocumentoPendiente> obtenerDocumentosPendientes(String codigo) 
	{
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * @see pe.com.upc.dsd.service.Service#obtenerLineaDeCredito(java.lang.String)
	 */
	@Override
	public double obtenerLineaDeCredito(String codigo) 
	{
		// TODO Auto-generated method stub
		return 0;
	}
	
	/**
	 * @see pe.com.upc.dsd.service.Service#obtenerStock(java.lang.String)
	 */
	@Override
	public int obtenerStock(String codigo) 
	{
		// TODO Auto-generated method stub
		return 0;
	}
}