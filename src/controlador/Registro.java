package controlador;

import bd.Conexion;
import java.util.Date;
import modelo.Empleado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author sobarzolicandeo
 * @version 28-11-2021
 */
public class Registro {
    
    
    public boolean agregar(Empleado empleado){
        Date fecnac,feccont;
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();
            
            fecnac = empleado.getFecNac();
            feccont = empleado.getFecCont();
            
            String query = "INSERT INTO empleado(numrut_emp,dvrut_emp,nombre_emp,appaterno_emp,apmaterno_emp,genero_emp,fecnac_emp,estcivil_emp,fono_emp,direccion_emp,feccont_emp,activo_emp) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement stmt = cnx.prepareStatement(query);
            
            stmt.setString(1, empleado.getNumRut());
            stmt.setString(2, empleado.getDvRut());
            stmt.setString(3, empleado.getNombre());
            stmt.setString(4, empleado.getAppaterno());
            stmt.setString(5, empleado.getApmaterno());
            stmt.setString(6, empleado.getGenero());
            stmt.setDate(7, new java.sql.Date(fecnac.getTime()));
            stmt.setString(8, empleado.getEstCivil());
            stmt.setInt(9, empleado.getFono());
            stmt.setString(10, empleado.getDireccion());
            stmt.setDate(11, new java.sql.Date(feccont.getTime()));
            stmt.setBoolean(12, empleado.getActivo());
            
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
    
    public List<Empleado> buscarTodos(){
        
        List<Empleado> lista = new ArrayList<>();
        
        
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();
                        
            String query = "SELECT numrut_emp,dvrut_emp,nombre_emp,appaterno_emp,apmaterno_emp,genero_emp,fecnac_emp,estcivil_emp,fono_emp,direccion_emp,feccont_emp,activo_emp FROM empleado order by numrut_emp";
            PreparedStatement stmt = cnx.prepareStatement(query);
            
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                Empleado empleado = new Empleado();
                empleado.setNumRut(rs.getString("numrut_emp"));
                empleado.setDvRut(rs.getString("dvrut_emp"));
                empleado.setNombre(rs.getString("nombre_emp"));
                empleado.setAppaterno(rs.getString("appaterno_emp"));
                empleado.setApmaterno(rs.getString("apmaterno_emp"));
                empleado.setGenero(rs.getString("genero_emp"));
                empleado.setFecNac(rs.getDate("fecnac_emp"));
                empleado.setEstCivil(rs.getString("estcivil_emp"));
                empleado.setFono(rs.getInt("fono_emp"));
                empleado.setDireccion(rs.getString("direccion_emp"));
                empleado.setFecCont(rs.getDate("feccont_emp"));
                empleado.setActivo(rs.getBoolean("activo_emp"));
                
                lista.add(empleado);
                
            }
            rs.close();
            stmt.close();
            cnx.close();
        } catch (SQLException e) {
            System.out.println("Error SQL al agregar Empleado: " + e.getMessage());
            
        } catch(Exception e){
            System.out.println("Error al agregar empleado (EXCEPTION): " + e.getMessage());
            
        }
        return lista;
        
    }
    
    public boolean buscarEmpleado(List<Empleado> lista,String numRut) {
        for (Empleado empleado : lista) {
            if (empleado.getNumRut().equals(numRut)) {
                return true;
            }
        }
        return false;
    }
    
    public boolean eliminar(String numRut){
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();
                        
            String query = "DELETE FROM empleado WHERE numrut_emp = ?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setString(1, numRut);
            
            stmt.executeUpdate();
            stmt.close();
            cnx.close();
            
            return true;
            
        } catch (SQLException e) {
            System.out.println("Error SQL al eliminar Empleado: " + e.getMessage());
            return false;
        } catch(Exception e){
            System.out.println("Error al eliminar empleado (EXCEPTION): " + e.getMessage());
            return false;
        }
    }
    
    public Empleado buscarPorNumRut(String numRut){
        
        Empleado empleado = new Empleado();
        
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();
                        
            String query = "SELECT numrut_emp,dvrut_emp,nombre_emp,appaterno_emp,apmaterno_emp,fono_emp,fecnac_emp,feccont_emp,activo_emp FROM empleado WHERE numrut_emp = ?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setString(1, numRut);
            
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                empleado.setNumRut(rs.getString("numrut_emp"));
                empleado.setDvRut(rs.getString("dvrut_emp"));
                empleado.setNombre(rs.getString("nombre_emp"));
                empleado.setAppaterno(rs.getString("appaterno_emp"));
                empleado.setApmaterno(rs.getString("apmaterno_emp"));
                empleado.setFono(rs.getInt("fono_emp"));
                empleado.setFecNac(rs.getDate("fecnac_emp"));
                empleado.setFecCont(rs.getDate("feccont_emp"));
                empleado.setActivo(rs.getBoolean("activo_emp"));
            }
            rs.close();
            stmt.close();
            cnx.close();
        } catch (SQLException e) {
            System.out.println("Error SQL al buscar Empleado: " + e.getMessage());
            
        } catch(Exception e){
            System.out.println("Error al buscar empleado (EXCEPTION): " + e.getMessage());
            
        }
        return empleado;
        
    }
}
