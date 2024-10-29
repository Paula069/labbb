

package co.edu.uniandes.csw.mueblesdelosalpes.dto;

import java.util.ArrayList;

public class Usuario
{

    private String login;
    private String contraseña;
    private TipoUsuario tipoUsuario;
    private String nombreCompleto;
    private long documento;
    private TipoDocumento tipoDocumento;
    private long telefonoLocal;
    private long telefonoCelular;
    private Ciudad ciudad;
    private String direccion;
    private Profesion profesion;
    private String correo;
    private boolean seleccion;
    private ArrayList<RegistroVenta>compras;
    
    public Usuario()
    {

    }

    public Usuario(String login, String contraseña, TipoUsuario tipoUsuario)
    {
        this.login = login;
        this.contraseña = contraseña;
        this.tipoUsuario = tipoUsuario;
        this.compras=new ArrayList<RegistroVenta>();
    }

    public String getLogin()
    {
        return login;
    }

    public void setLogin(String nombre)
    {
        this.login = nombre;
    }

    public String getContraseña()
    {
        return contraseña;
    }

    public void setContraseña(String contraseña)
    {
        this.contraseña = contraseña;
    }


    public TipoUsuario getTipoUsuario()
    {
        return tipoUsuario;
    }

    public void setTipoUsuario(TipoUsuario tipoUsuario)
    {
        this.tipoUsuario = tipoUsuario;
    }

    public Ciudad getCiudad()
    {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad)
    {
        this.ciudad = ciudad;
    }

    public String getCorreo()
    {
        return correo;
    }

    public void setCorreo(String correo)
    {
        this.correo = correo;
    }

    public String getDireccion()
    {
        return direccion;
    }

    public void setDireccion(String direccion)
    {
        this.direccion = direccion;
    }

    public long getDocumento()
    {
        return documento;
    }


    public void setDocumento(long documento)
    {
        this.documento = documento;
    }

    public String getNombreCompleto()
    {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto)
    {
        this.nombreCompleto = nombreCompleto;
    }

    public Profesion getProfesion()
    {
        return profesion;
    }

    public void setProfesion(Profesion profesion)
    {
        this.profesion = profesion;
    }
    public long getTelefonoCelular()
    {
        return telefonoCelular;
    }

  
    public void setTelefonoCelular(long telefonoCelular)
    {
        this.telefonoCelular = telefonoCelular;
    }

    public long getTelefonoLocal()
    {
        return telefonoLocal;
    }

    
    public void setTelefonoLocal(long telefonoLocal)
    {
        this.telefonoLocal = telefonoLocal;
    }

    public TipoDocumento getTipoDocumento()
    {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento)
    {
        this.tipoDocumento = tipoDocumento;
    }

    public ArrayList<RegistroVenta> getCompras()
    {
        return compras;
    }

    public void setCompras(ArrayList<RegistroVenta> compras)
    {
        this.compras = compras;
    }

    public void agregarRegistro(RegistroVenta registro)
    {
        compras.add(registro);
    }

    public boolean isSeleccion() {
        return seleccion;
    }

    public void setSeleccion(boolean seleccion)
    {
        this.seleccion = seleccion;
    }

}
