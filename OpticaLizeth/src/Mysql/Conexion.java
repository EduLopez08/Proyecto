/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mysql;
import java.sql.*;

/**
 *
 * @author Rebe-pc
 */
public class Conexion {
  private static String db="Optica";
    private static String user="root";
    private static String pass="";
    private static String host="localhost:3306";
    private static String server="jdbc:mysql://"+host+"/"+db;
    
    public static  Connection getConexion() {
        Connection cn=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            cn=DriverManager.getConnection(server,user,pass);         
        }
        catch(Exception e){
         System.out.println(String.valueOf(e));}
        return cn;
    }
    /*
    <%
Connection conex=null;
Statement sql=null;
try{
    Class.forName("com.mysql.jdbc.Driver");
    conex=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/prueba","root","");
    sql = conex.createStatement();
    out.print("CONEXION EXITOSA");
}catch(Exception e){
    out.print("ERROR EN LA CONEXION" + e);
}
    %>
    */
    
}
