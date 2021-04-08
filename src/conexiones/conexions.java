
package conexiones;

/**
 *
 * @author bean_
 */

//librerias SQL SERVER
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class conexions {
    
    static Connection contacto = null;
    
    public static Connection getConnexion(){
        String url = "jdbc:sqlserver://LAPTOP-KVAKJTD2\\SQLEXPRESS:1433;databaseName=ONE_PIECE";
        
        //Este es para ver que la liberia de JDBC funciona
          try{
              Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
          }catch (ClassNotFoundException e){
              JOptionPane.showMessageDialog(null, "No se pudo establecer la conexion " + e.getMessage(),
                      "Error de conexion", JOptionPane.ERROR_MESSAGE);
          }
          
          //Este es para validar que se puede conectar a la base de datos
          try{
              contacto = DriverManager.getConnection(url, "bean", "carolina77");
          } catch (SQLException e){
              JOptionPane.showMessageDialog(null, "No se pudo hacer la conexion " + e.getMessage(),
                      "Error de conexion", JOptionPane.ERROR_MESSAGE);
          }
          //Si llega aqui es que no encontro ningun error
          return contacto;
    }
    //Este es para realizar una sentencia de SQL Server
    public static ResultSet Consulta(String consulta){
        Connection con = getConnexion();
        Statement declara;
        try{
            declara = con.createStatement();
            ResultSet respuesta = declara.executeQuery(consulta);
            return respuesta;
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(),
                    "Error de conexion", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }
}