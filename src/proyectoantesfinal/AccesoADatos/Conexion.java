
package proyectoantesfinal.AccesoADatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/* @author Programita  */
public class Conexion {
    private static final String URL="jdbc:mysql://localhost/";
    private static final String DB ="uuniversidadulp";
    private static final String USUARIO="root";
    private static final String PASSWORD ="";
    
    
    private static Connection connection;
    
    //metodo constructor
    
    private Conexion (){}
    /**no nos permitirá crear instancias de la clase Conexion. Esto nos posibilitará como lo van a ver más adelante en el código,
tener un único objeto Connection activo durante la ejecución de nuestra aplicación.*/
    
    public static Connection getConexion(){
        //tiene un único método público encargado de retornar un objeto de tipo
//Connection,
        
        /**ser static para que pueda ser invocado desde afuera de la clase
sin necesitad crear una instancia de la misma, ya que no podríamos por el hecho de que tiene un
único constructor privado.*/
        
        if (connection==null) {
            try{
                //carga de drivers
                Class.forName("org.mariadb.jdbc.Driver");
                //Setup the conection with the DB
                
                //conexion con la base de datos 
                connection = DriverManager
                        .getConnection(URL+DB + "?useLegacyyDatetimeCode=false&serverTimezone=UTC"
                        +"&user=" + USUARIO + "&password=" + PASSWORD);
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null, "Error al conectarse a la BD"+ ex.getMessage());
            }catch (ClassNotFoundException ex){
                JOptionPane.showMessageDialog(null," Error al cargar los drivers " + ex.getMessage());
            }
            
        }
        return connection;
    }
}