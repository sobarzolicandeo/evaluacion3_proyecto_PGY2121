package modelo;

import java.util.Date;

/**
 *
 * @author sobarzolicandeo
 * @version 28-11-2021
 */
public class Empleado {
    
    private int numRut;
    private String dvRut;
    private String nombre;
    private String appaterno;
    private String apmaterno;
    private String genero;
    private Date fecnac;
   
    
    public Empleado() {
    }

    public Empleado(int numRut, String dvRut, String nombre, String appaterno, String apmaterno, String genero, Date fecnac) {
        this.numRut = numRut;
        this.dvRut = dvRut;
        this.nombre = nombre;
        this.appaterno = appaterno;
        this.apmaterno = apmaterno;
        this.genero = genero;
        this.fecnac = fecnac;
       
    }

    public int getNumRut() {
        return numRut;
    }

    public void setNumRut(int numRut) {
        this.numRut = numRut;
    }

    public String getDvRut() {
        return dvRut;
    }

    public void setDvRut(String dvRut) {
        this.dvRut = dvRut;   
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAppaterno() {
        return appaterno;
    }

    public void setAppaterno(String appaterno) {
        this.appaterno = appaterno;
    }

    public String getApmaterno() {
        return apmaterno;
    }

    public void setApmaterno(String apmaterno) {
        this.apmaterno = apmaterno;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Date getFecnac() {
        return fecnac;
    }

    public void setFecnac(Date fecnac) {
        this.fecnac = fecnac;
    }
    
    
}
