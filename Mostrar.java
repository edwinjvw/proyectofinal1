/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancofinal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Edwin
 */
public class Mostrar
{
 private static Connection con;
 private static String driver;
 private static String usuario;
 private static String clave;
 private static String basedatos;
 private static ResultSet rs;
 public static void main(String[] args)
 {
 MOSTRAR();
 }
 public static void MOSTRAR()
 {
 try
 {
 driver = "org.postgresql.Driver";
 usuario = "postgres";
 clave = "+Sonic1992";
 basedatos = "jdbc:postgresql://localhost:5432/clientes";
 Class.forName(driver);
 con = DriverManager.getConnection(basedatos, usuario, clave);
 Statement Constraint = con.createStatement();
 rs = Constraint.executeQuery("SELECT * FROM \"Alumno\"");
 while(rs.next())
 {
 System.out.print(rs.getString(1));
 System.out.println(rs.getString(2));
 }

 }
 catch (Exception e)
 {
 System.out.println("No es posible hacer la conexion!");
 e.printStackTrace();
 }
 }
}