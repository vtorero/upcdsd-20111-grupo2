package pe.edu.upc.dsd.ws;

import java.util.ArrayList;
import java.util.List;


import javax.jws.WebService;

import pe.edu.upc.dsd.ws.bean.Stock;

@WebService(endpointInterface = "pe.edu.upc.dsd.ws.AlmacenService")
public class AlmacenServiceImpl implements AlmacenService 
{
private List<Stock> stocks;
    
    public AlmacenServiceImpl()
    {
    	this.stocks = getStocksPrueba();
    }
    
    /**
     * @see pe.edu.upc.dsd.ws.ProductoService#obtenerProducto(java.lang.String)
     */
    @Override
    public Stock obtenerStock(String codigo)
    {   
    	for(int i = 0; i < this.stocks.size(); i++)
    	{
    		Stock stock = stocks.get(i);
    		
    		if( stock.getCodigoProducto().equals(codigo) )
    		{
    			return stock;
    		}
    	}
        return null;
    }

    private List<Stock> getStocksPrueba()
    {
    	List<Stock> stock = new ArrayList<Stock>();
    	
    	Stock stock1 = new Stock();
    	stock1.setCodigoProducto("01");
    	stock1.setDescripcion("BIKE XP 800");
    	stock1.setAlmacen("Central");
    	stock1.setStock("100");
    	
    	Stock stock2 = new Stock();
    	stock2.setCodigoProducto("02");
    	stock2.setDescripcion("YARIS BGTH 125");
    	stock2.setAlmacen("Central");
    	stock2.setStock("40");
    	
    	Stock stock3 = new Stock();
    	stock3.setCodigoProducto("03");
    	stock3.setDescripcion("FORD JULINS 300");
    	stock3.setAlmacen("Central");
    	stock3.setStock("40");
    	
    	Stock stock4 = new Stock();
    	stock3.setCodigoProducto("04");
    	stock4.setDescripcion("HONDA GOMS 125");
    	stock4.setAlmacen("Central");
    	stock4.setStock("80");
    	
    	stock.add(stock1);
    	stock.add(stock2);
    	stock.add(stock3);
    	stock.add(stock4);
    	
    	return stock;
    }
}
