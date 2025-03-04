
package co.edu.uniandes.csw.mueblesdelosalpes.dto;

import java.util.List;

public class Pais
{

    private String nombre;

    private List<Ciudad> ciudades;

    public Pais()
    {

    }

    public Pais(String nombre, List<Ciudad> ciudades)
    {
        this.nombre = nombre;
        this.ciudades = ciudades;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public List<Ciudad> getCiudades()
    {
        return ciudades;
    }

    public void setCiudades(List<Ciudad> ciudades)
    {
        this.ciudades = ciudades;
    }

}
