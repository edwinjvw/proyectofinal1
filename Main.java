/*
 CONEXION CON LA BDD
 */
package bancofinal;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Edwin
 */

public class Main
{
 private static Connection con; //con es el objeto que me permitirá conectarme con la base de datos
 private static String driver; //especifica el driver para la conexión a base de datos, depende del gestor de base de datos
 private static String usuario; // es el nombre del usuario de la base de datos, ver en el gestor cual es el usuario activo....
 private static String clave; //la clave de acceso al gestor de base de datos
 private static String basedatos; //es el nombre de la base de datos que vamos a utilizar

 public static void main(String[] args)
 {
 CONEXION();
 NewJFrame c1= new NewJFrame();
 c1.setVisible (true);
 Insertar i1= new Insertar(); 
 }
 public static void CONEXION()
 {
 try
 {
 driver = "org.postgresql.Driver";
 usuario = "postgres";
 clave = "+Sonic1992";
 basedatos = "jdbc:postgresql://localhost:5432/clientes";
 Class.forName(driver);
 con = DriverManager.getConnection(basedatos, usuario, clave);
 }
 catch (Exception e)
 {
 System.out.println("No es posible hacer la conexion!");
 e.printStackTrace();
 }
 }
}