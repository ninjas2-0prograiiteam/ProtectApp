/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Usuario
 */
public class Consultas extends Conectar{
    
    public boolean autenticacion(String user, String pass){
        
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        try {
            String consulta = "SELECT * FROM tourdatabase.usuarios where username = ? and password = ?";
            pst = getConnection().prepareStatement(consulta);
            pst.setString(1, user);
            pst.setString(2, pass);
            
            rs=pst.executeQuery();
            
            if(rs.absolute(1)){
                return true;
            }
            
        } catch (Exception e) {
            System.err.println("Error " + e);
        }finally{
            try {
                if(getConnection() != null) getConnection().close();
                if(pst != null) pst.close();
                if (rs != null) rs.close();
            } catch (Exception e) {
                System.err.println("Error" + e);
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        Consultas co = new Consultas();
        
        System.out.println(co.autenticacion("atoldeelote", "12345"));
    }
    
}
