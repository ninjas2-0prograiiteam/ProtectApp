
package Controlador;

import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class ConsultasEmpresa extends Conectar{
    
    public boolean autenticacion(String user, String pass){
        
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        try {
            String consulta = "SELECT * FROM tourdatabase.empresa where username = ? and password = ?";
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
        ConsultasEmpresa co = new ConsultasEmpresa();
        
        System.out.println(co.autenticacion("travelsv", "1234"));
    }
    
}