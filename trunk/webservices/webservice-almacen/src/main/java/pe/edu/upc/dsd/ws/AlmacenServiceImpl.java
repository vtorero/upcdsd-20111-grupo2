package pe.edu.upc.dsd.ws;

import java.util.HashMap;
import java.util.Map;

import javax.jws.WebService;

@WebService(endpointInterface = "pe.edu.upc.dsd.ws.AlmacenService")
public class AlmacenServiceImpl implements AlmacenService 
{
	private Map<String, Integer> stocks;
	
	public AlmacenServiceImpl()
	{
		this.stocks = getStocksPrueba();
	}
	
	/**
     * @see pe.edu.upc.dsd.ws.FinanzasService#import javax.jws.WebService(java.lang.String)
     */
	@Override
    public int obtenerStock(String codigoProducto)
    {               
    	return (int) this.stocks.get(codigoProducto);
    }
	
	private Map<String, Integer> getStocksPrueba()
	{
		Map<String, Integer> stocksPrueba = new HashMap<String, Integer>();
		stocksPrueba.put("01", 100);
		stocksPrueba.put("02", 150);
		stocksPrueba.put("03", 800);
		stocksPrueba.put("04", 250);
		stocksPrueba.put("05", 80);
		
		return stocksPrueba;
	}
}
