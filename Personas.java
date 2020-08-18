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
public class Personas {
    private static Connection con; //con es el objeto que me permitirá conectarme con la base de datos
 private static String driver; //especifica el driver para la conexión a base de datos, depende del gestor de base de datos
 private static String usuario; // es el nombre del usuario de la base de datos, ver en el gestor cual es el usuario activo....
 private static String clave; //la clave de acceso al gestor de base de datos
 private static String basedatos; //es el nombre de la base de datos que vamos a utilizar
 private static ResultSet registro; 
 public int Pos=1;
 public String codpersonas;//atributo1
 public String nompersonas;//atributo2
 
 public Personas()
 {
     try{
 driver = "org.postgresql.Driver";
 usuario = "postgres";
 clave = "+Sonic1992";
 basedatos = "jdbc:postgresql://localhost:5432/clientes";
 Class.forName(driver);
         con=DriverManager.getConnection(basedatos,usuario,clave);
     }
     catch(Exception x){
         System.out.println("error");
     }
 }
public int Cantidad()
 {
 try
 {
 Statement instruccion = con.createStatement(ResultSet.CONCUR_READ_ONLY,ResultSet.CONCUR_UPDATABLE);
 registro = instruccion.executeQuery("SELECT count(*) FROM \"Datos\"");
 registro.absolute(1);
 return registro.getInt(1);
 }
 catch(Exception X)
 { return 0; }
 }

 public void Guardar()
 {
 String cadena="'"+codpersonas+"','"+nompersonas+" ' ";
 try
 {

Statement comando = con.createStatement();
 comando.executeUpdate("INSERT INTO \"Datos\"(" + "\"nodpersona\",\"nompersona\"" + ") VALUES(" + cadena + ");");
 }
 catch (Exception e)
 { }
 }

}
