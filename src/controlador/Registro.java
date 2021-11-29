package controlador;

import bd.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import modelo.Empleado;

/**
 *
 * @author sobarzolicandeo
 * @version 28-11-2021
 */
public class Registro {
    public boolean agregar(Empleado empleado){
        
        Date date;
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();
            
            String query = "INSERT INTO empleado(numrut_emp,dvrut_emp) VALUES (?,?)";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setInt(1, empleado.getNumRut());
            stmt.setString(2, empleado.getDvRut());
            
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
