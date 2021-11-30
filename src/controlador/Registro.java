package controlador;

import bd.Conexion;
import java.util.Date;
import modelo.Empleado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author sobarzolicandeo
 * @version 28-11-2021
 */
public class Registro {
    
    
    public boolean agregar(Empleado empleado){
        Date fecnac;
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();
            
            fecnac = empleado.getFecnac();
            
            String query = "INSERT INTO empleado(numrut_emp,dvrut_emp,nombre_emp,appaterno_emp,apmaterno_emp,genero_emp,fecnac_emp) VALUES (?,?,?,?,?,?,?)";
            PreparedStatement stmt = cnx.prepareStatement(query);
            
            stmt.setInt(1, empleado.getNumRut());
            stmt.setString(2, empleado.getDvRut());
            stmt.setString(3, empleado.getNombre());
            stmt.setString(4, empleado.getAppaterno());
            stmt.setString(5, empleado.getApmaterno());
            stmt.setString(6, empleado.getGenero());
            stmt.setDate(7, new java.sql.Date(fecnac.getTime()));
            
            stmt.executeUpdate();
            stmt.close();
            cnx.close();
            
            return true;
            
        } catch (SQLException e) {
            System.out.println("Error SQL al ingresar empleado: " + e.getMessage());
            return false;
        } catch(Exception e){
            System.out.println("Error al ingresar empleado (EXCEPTION): " + e.getMessage());
            return false;
        }
    }
}
