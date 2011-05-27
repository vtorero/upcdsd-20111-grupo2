package pe.edu.upc.dsd.ws;

import javax.jws.WebService;

@WebService(endpointInterface = "pe.edu.upc.dsd.ws.AlmacenService")
public class AlmacenServiceImpl implements AlmacenService {

	/**
     * @see pe.edu.upc.dsd.ws.FinanzasService#import javax.jws.WebService(java.lang.String)
     */
	@Override
    public int obtenerStock(String codigoProducto)
    {               
    	return 100;
    }
}
