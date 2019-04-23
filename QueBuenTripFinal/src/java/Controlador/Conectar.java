/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Usuario
 */
public class Conectar {
    
    private static Connection con;
    private static final String driver = "com.mysql.cj.jdbc.Driver";
    private static final String user = "root";
    private static final String pass = "12345";
    private static final String url = "jdbc:mysql://localhost:3306/tourdatabase"
                + "?autoReconnect=true"
                + "&useUnicode=true"
                + "&useSSL=false"
                + "&useJDBCCompliantTimezoneShift=true"
                + "&useLegacyDatetimeCode=false"
                + "&serverTimezone=UTC";
    
    
    public Conectar (){
        con = null;
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, pass);
            if(con != null){
                System.out.println("Conexión establecida");
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Error al conectar " + e);
        }
    }
    //retornar la conexión
    public Connection getConnection(){
        return con;
    }
    //retornar una desconexión
    public void desconectar(){
        con = null;
        if (con == null){
            System.out.println("La conexión finalizó");
        }
    }
    public static void main(String[] args) {
        Conectar con = new Conectar();
        
        if(con.getConnection() != null){
            System.out.println("Conexión establecida");
        }else {
            System.out.println("Conexión errónea");
        }
        
        
    }
}
