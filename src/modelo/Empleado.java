package modelo;

/**
 *
 * @author sobarzolicandeo
 * @version 28-11-2021
 */
public class Empleado {
    
    private int numRut;
    private String dvRut;
    
    public Empleado() {
    }

    public Empleado(int numRut, String dvRut) {
        this.numRut = numRut;
        this.dvRut = dvRut;
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
    
    
}
