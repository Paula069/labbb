

package co.edu.uniandes.csw.mueblesdelosalpes.logica.ejb;

import co.edu.uniandes.csw.mueblesdelosalpes.dto.Vendedor;
import co.edu.uniandes.csw.mueblesdelosalpes.excepciones.OperacionInvalidaException;
import co.edu.uniandes.csw.mueblesdelosalpes.logica.interfaces.IServicioVendedoresMockRemote;
import co.edu.uniandes.csw.mueblesdelosalpes.logica.interfaces.IServicioVendedoresMockLocal;
import co.edu.uniandes.csw.mueblesdelosalpes.logica.interfaces.IServicioPersistenciaMockLocal;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateful;

@Stateful
public class ServicioVendedoresMock implements IServicioVendedoresMockRemote, IServicioVendedoresMockLocal {

 
    @EJB
    private IServicioPersistenciaMockLocal persistencia;

    public ServicioVendedoresMock()
    {
    }

    @Override
    public void agregarVendedor(Vendedor vendedor) throws OperacionInvalidaException
    {
        try
        {
            persistencia.create(vendedor);
        }
        catch (OperacionInvalidaException ex)
        {
            throw new OperacionInvalidaException(ex.getMessage());
        }
    }


    @Override
    public void eliminarVendedor(long id) throws OperacionInvalidaException
    {
        Vendedor v=(Vendedor) persistencia.findById(Vendedor.class, id);
        try
        {
            persistencia.delete(v);
        } catch (OperacionInvalidaException ex)
        {
            throw new OperacionInvalidaException(ex.getMessage());
        }
    }

 
    @Override
    public List<Vendedor> getVendedores()
    {
        return persistencia.findAll(Vendedor.class);
    }

}
