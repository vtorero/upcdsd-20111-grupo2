package pe.edu.upc.dsd.ws.bean;

/**
 * @author andres
 * 
 */
public class Producto
{

    private String codigo;

    private String descripcion;

    private double precio;

    private String tipo;
    
    private int cantidad;

    /**
     * @return the codigo
     */
    public String getCodigo()
    {
        return codigo;
    }

    /**
     * @param codigo
     *            the codigo to set
     */
    public void setCodigo(String codigo)
    {
        this.codigo = codigo;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion()
    {
        return descripcion;
    }

    /**
     * @param descripcion
     *            the descripcion to set
     */
    public void setDescripcion(String descripcion)
    {
        this.descripcion = descripcion;
    }

    /**
     * @return the precio
     */
    public double getPrecio()
    {
        return precio;
    }

    /**
     * @param precio
     *            the precio to set
     */
    public void setPrecio(double precio)
    {
        this.precio = precio;
    }

    /**
     * @return the tipo
     */
    public String getTipo()
    {
        return tipo;
    }

    /**
     * @param tipo
     *            the tipo to set
     */
    public void setTipo(String tipo)
    {
        this.tipo = tipo;
    }

	/**
	 * @return the cantidad
	 */
	public int getCantidad()
	{
		return cantidad;
	}

	/**
	 * @param cantidad the cantidad to set
	 */
	public void setCantidad(int cantidad) 
	{
		this.cantidad = cantidad;
	}
}