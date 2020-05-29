
package Modelo;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {
    ////////////// cON ESTO  CONECTAMOS LA APLICACION CON NUESTRA BASE DE DATOS
    
    private static final String base = "personas";
    private static final String user = "root";
    private static final String password = "manolo";
    private static final String url = "jdbc:mysql://localhost:3307/" + base+"?autoReconnect=true&useSSL=false";
    private static Connection con = null;
    
    public Connection getConexion()
    {
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(url, user, password);
            
        } catch(SQLException e)
        {
            System.err.println(e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(con);
      return con;  
    }

    public static void main(String args[]){
     try{
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(url, user,   password);
            
        } catch(SQLException e)
        {
            System.err.println(e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
System.out.println(con);
    }

}
