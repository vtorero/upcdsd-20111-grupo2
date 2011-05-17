package pe.edu.upc.dsd.ws;

import javax.jws.WebService;

import pe.edu.upc.dsd.ws.bean.Cliente;

@WebService(endpointInterface="pe.edu.upc.dsd.ws.PedidoService")
public class PedidoServiceImpl implements PedidoService{

	
}

public class ClienteServiceImpl implements ClienteService
{
	@Override
	public Cliente obtenerCliente(String codigo) 
	{
		Cliente cliente = new Cliente();
		cliente.setNombre("William");
		cliente.setApellidoPaterno("Beckham");
		cliente.setApellidoMaterno("Jackson");
		cliente.setCodigo(codigo);
		cliente.setDocumentoIdentidad("44091088");
		cliente.setDireccion("Av. Su Casa 123");
		cliente.setTelefono("5752045");
		cliente.setTipoPersona("N");
		
		return cliente;
	}
	
}