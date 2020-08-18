/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancofinal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author Edwin
 */

public class Insertar
{
 private static Connection con;
 private static String driver;
 private static String usuario;
 private static String clave;
 private static String basedatos;
 private static String cadena;
 public static void main(String[] args)
 {
 NuevoRegistro();
 }
 public static void NuevoRegistro()
 {
 //cadena="'12398798','Ewi'";
  /* NewJFrame c1= new NewJFrame();
   c1.setVisible (true);
    cadena = c1.getNombre1(); */
 try
 {
 driver = "org.postgresql.Driver";
 usuario = "postgres";
  clave = "+Sonic1992";
 basedatos = "jdbc:postgresql://localhost:5432/clientes";
 Class.forName(driver);
 con = DriverManager.getConnection(basedatos, usuario, clave);
 Statement otro = con.createStatement(); 
 //INSERT INTO public.datos (codPersonas) VALUES (001);
//INSERT INTO "Alumno"("IdAlumno", "NomAlumno") VALUES ('04', 'Pablo');
 
 System.out.println("INSERT INTO \"datos\"(" + "\"codpersonas\",\"nompersonas\"" + ") VALUES(" + cadena + ");");
 otro.executeUpdate("INSERT INTO \"datos\"(" + "\"codpersonas\",\"nompersonas\"" + ") VALUES(" + cadena + ");");
 }
 catch (Exception e)
 {
 System.out.println("No es posible hacer la conexion!");
 e.printStackTrace();
 }
 }
}