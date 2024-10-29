
package co.edu.uniandes.csw.mueblesdelosalpes.logica.ejb;

import co.edu.uniandes.csw.mueblesdelosalpes.persistencia.mock.ServicioPersistenciaMock;
import co.edu.uniandes.csw.mueblesdelosalpes.dto.Usuario;
import co.edu.uniandes.csw.mueblesdelosalpes.excepciones.OperacionInvalidaException;
import co.edu.uniandes.csw.mueblesdelosalpes.logica.interfaces.IServicioRegistroMockRemote;
import co.edu.uniandes.csw.mueblesdelosalpes.logica.interfaces.IServicioPersistenciaMockLocal;
import co.edu.uniandes.csw.mueblesdelosalpes.logica.interfaces.IServicioRegistroMockLocal;

import java.util.ArrayList;
import java.util.List;


public class ServicioRegistroMock implements IServicioRegistroMockRemote, IServicioRegistroMockLocal
{
    
    private IServicioPersistenciaMockLocal persistencia;

  
     public ServicioRegistroMock()
     {
        persistencia=new ServicioPersistenciaMock();
     }

    @Override
    public void registrar(Usuario u)throws OperacionInvalidaException
    {
        try
        {
            if(u.getDocumento()!=0)
            {

            persistencia.create(u);
            }
            else
            {
                throw new OperacionInvalidaException("El número de documento no es válido");
            }
        }
        catch (OperacionInvalidaException ex)
        {
            throw new OperacionInvalidaException(ex.getMessage());
        }
    }

    @Override
    public void eliminarCliente(String login) throws OperacionInvalidaException
    {
        try
        {
        Usuario u=(Usuario) persistencia.findById(Usuario.class, login);
        persistencia.delete(u);
        }
        catch(OperacionInvalidaException e)
        {
            throw new OperacionInvalidaException("Ocurrió un error al momento de eliminar");
        }
    }

    @Override
    public List<Usuario> darClientes()
    {
        return(ArrayList<Usuario>) persistencia.findAll(Usuario.class);
    }

}
