package modelo;

import java.util.Date;

/**
 *
 * @author sobarzolicandeo
 * @version 28-11-2021
 */
public class Empleado {
    
    private String numRut;
    private String dvRut;
    private String nombre;
    private String appaterno;
    private String apmaterno;
    private String genero;
    private Date fecNac;
    private String estCivil;
    private int fono;
    private String direccion;
    private Date fecCont;
    private Boolean activo;
    
    public Empleado() {
    }

    public Empleado(String numRut, String dvRut, String nombre, String appaterno, String apmaterno, String genero, Date fecNac, String estCivil, int fono, String direccion, Date fecCont, Boolean activo) {
        this.numRut = numRut;
        this.dvRut = dvRut;
        this.nombre = nombre;
        this.appaterno = appaterno;
        this.apmaterno = apmaterno;
        this.genero = genero;
        this.fecNac = fecNac;
        this.estCivil = estCivil;
        this.fono = fono;
        this.direccion = direccion;
        this.fecCont = fecCont;
        this.activo = activo;
    }

    public String getNumRut() {
        return numRut;
    }

    public void setNumRut(String numRut) {
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

    public Date getFecNac() {
        return fecNac;
    }

    public void setFecNac(Date fecNac) {
        this.fecNac = fecNac;
    }

    public String getEstCivil() {
        return estCivil;
    }

    public void setEstCivil(String estCivil) {
        this.estCivil = estCivil;
    }

    public int getFono() {
        return fono;
    }

    public void setFono(int fono) {
        this.fono = fono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Date getFecCont() {
        return fecCont;
    }

    public void setFecCont(Date fecCont) {
        this.fecCont = fecCont;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }
    
}
