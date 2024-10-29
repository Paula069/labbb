

package co.edu.uniandes.csw.mueblesdelosalpes.dto;

public class ExperienciaVendedor
{

    private long id;

    private String nombreEmpesa;


    private String cargo;

    private String descripcion;

    private int ano;

  
    public ExperienciaVendedor()
    {
        
    }

    public ExperienciaVendedor(long id, String nombreEmpesa, String cargo, String descripcion, int ano)
    {
        this.id = id;
        this.nombreEmpesa = nombreEmpesa;
        this.cargo = cargo;
        this.descripcion = descripcion;
        this.ano = ano;
    }

   
    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public int getAno()
    {
        return ano;
    }

    
    public void setAno(int ano)
    {
        this.ano = ano;
    }

    public String getCargo()
    {
        return cargo;
    }

    public void setCargo(String cargo)
    {
        this.cargo = cargo;
    }

    public String getDescripcion()
    {
        return descripcion;
    }

    public void setDescripcion(String descripcion)
    {
        this.descripcion = descripcion;
    }


    public String getNombreEmpesa()
    {
        return nombreEmpesa;
    }

    public void setNombreEmpesa(String nombreEmpesa)
    {
        this.nombreEmpesa = nombreEmpesa;
    }

}
