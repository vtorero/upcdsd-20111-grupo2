/**
 * 
 */
package pe.edu.upc.dsd.ws.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import pe.edu.upc.dsd.ws.bean.Producto;
import pe.edu.upc.dsd.ws.dao.ProductoDAO;

/**
 * @author andres
 * 
 */
public class ProductoDAOImpl extends HibernateDaoSupport implements ProductoDAO
{
    public ProductoDAOImpl(SessionFactory sessionFactory)
    {
        setSessionFactory(sessionFactory);
    }
    
    /**
     * @see pe.edu.upc.dsd.ws.dao.ProductoDAO#obtenerListaProducto(java.lang.String)
     */
    @SuppressWarnings("unchecked")
    @Override
    public List<Producto> obtenerListaProducto(String tipo)
    {
        Session session = getSessionFactory().getCurrentSession();
        session.beginTransaction();
        Query query = session.getNamedQuery("obtenerProductosPorCategoria");
        query.setInteger("categoria", new Integer(tipo));
        
        List<Producto> productos = (List<Producto>) query.list();
        session.close();
        
        return productos;
    }

    /**
     * @see pe.edu.upc.dsd.ws.dao.ProductoDAO#obtenerProducto(java.lang.String)
     */
    @Override
    public Producto obtenerProducto(String codigo)
    {
        Session session = getSessionFactory().getCurrentSession();
        session.beginTransaction();
        Query query = session.getNamedQuery("obtenerProductoPorCodigo");
        query.setInteger("codigo", new Integer(codigo));
        Producto producto = (Producto) query.uniqueResult();
        session.close();        
        
        return producto;
    }
}