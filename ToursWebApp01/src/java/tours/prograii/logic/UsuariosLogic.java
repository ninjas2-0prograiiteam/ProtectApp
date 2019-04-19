package tours.prograii.logic;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import tours.prograii.database.DatabaseX;
import tours.prograii.objects.UsuariosObj;

public class UsuariosLogic extends Logic {

    public boolean RegistrarNuevoUsuario(String p_strNombre,String p_strApellido,int p_iEdad,int p_iDui,
            String p_strEmail,String p_strUsername, String p_strPassword,int p_iIdDepartamento){
        DatabaseX database = getDatabase();
        String strSql = "INSERT INTO tourdatabase.usuarios"
                        + "(id,nombre,apellido,edad,dui,email,username,password,iddepartamento)" +
                        "VALUES(0,'"+p_strNombre+"','"+p_strApellido+"',"+p_iEdad+","+p_iDui+",'"+p_strEmail+"',"
                        + "'"+p_strUsername+"','"+p_strPassword+"',"+p_iIdDepartamento+");";
        boolean bsucces = database.executeNonQueryBool(strSql);
       return bsucces;
    }
    
    public int RegistrarNuevoUsuarioInt(String p_strNombre,String p_strApellido,int p_iEdad,int p_iDui,
            String p_strEmail,String p_strUsername, String p_strPassword,int p_iIdDepartamento){
        DatabaseX database = getDatabase();
        String strSql = "INSERT INTO tourdatabase.usuarios"
                        + "(id,nombre,apellido,edad,dui,email,username,password,iddepartamento)" +
                        "VALUES(0,'"+p_strNombre+"','"+p_strApellido+"',"+p_iEdad+","+p_iDui+",'"+p_strEmail+"',"
                        + "'"+p_strUsername+"','"+p_strPassword+"',"+p_iIdDepartamento+");";
        int iRows = database.executeNonQueryRows(strSql);
        return iRows;
        }
    
        public int BorrarUsuario(int p_iId) 
    {
        DatabaseX database = getDatabase();
        String strSql = "DELETE FROM tourdatabase.usuarios " +
                        "WHERE id="+p_iId+";";
        int iRows = database.executeNonQueryRows(strSql);
        return iRows;
    }
        
        
        public int ActualizarUsuario(int p_iId,String p_strNombre,String p_strApellido,int p_iEdad,int p_iDui,
            String p_strEmail,String p_strUsername, String p_strPassword,int p_iIdDepartamento){
           DatabaseX database = getDatabase(); 
           String strSql = "UPDATE tourdatabase.usuarios " +
                            "SET " +
                            "id = "+p_iId+"," +
                            "nombre = '"+p_strNombre+"', "+
                            "apellido = '"+p_strApellido+"'," +
                            "edad = "+p_iEdad+"," +
                            "dui = "+p_iDui+"," +
                            "email = '"+p_strEmail+"'," +
                            "username = '"+p_strUsername+"'," +
                            "password = '"+p_strPassword+"'," +
                            "iddepartamento = "+p_iIdDepartamento+" " +
                            "WHERE id = "+p_iId+";";
           System.out.println(strSql);
           int iRows = database.executeNonQueryRows(strSql);
           return iRows;
        }

        public UsuariosObj getUsersById(int p_iId) 
    {
        //select * from travelsys.client;
        DatabaseX database = getDatabase();
        String strSql = "select * from tourdatabase.usuarios where id="+p_iId+" ";
        System.out.println(strSql);
        ResultSet CResult = database.executeQuery(strSql);
        UsuariosObj CTemp = null;
        
        if(CResult!=null)
        {
            int iId;
            String strNombre;
            String strApellido;
            int iEdad;
            int iDui;
            String strEmail;
            String strUsername;
            String strPassword;
            int iIdDepartamento;
            
            try 
            {
                while(CResult.next())
                {
                    iId = CResult.getInt("id");
                    strNombre = CResult.getString("nombre");
                    strApellido = CResult.getString("apellido");
                    iEdad = CResult.getInt("edad");
                    iDui = CResult.getInt("dui");
                    strEmail = CResult.getString("email");
                    strUsername = CResult.getString("username");
                    strPassword = CResult.getString("password");
                    iIdDepartamento = CResult.getInt("iddepartamento");
                    
                    CTemp = new UsuariosObj(iId, strNombre, strApellido,iEdad,iDui,strEmail, strUsername, strPassword, iIdDepartamento);
                }
            } 
            catch (SQLException ex) 
            {
                Logger.getLogger(UsuariosLogic.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return CTemp;
        
    }
        
        public ArrayList<UsuariosObj> getAllUsers() 
    {
        //select * from travelsys.client;
        DatabaseX database = getDatabase();
        String strSql = "select * from tourdatabase.usuarios ";
        System.out.println(strSql);
        ResultSet CResult = database.executeQuery(strSql);
        ArrayList<UsuariosObj> CArray = null;
        
        if(CResult!=null)
        {
            int iId;
            String strNombre;
            String strApellido;
            int iEdad;
            int iDui;
            String strEmail;
            String strUsername;
            String strPassword;
            int iIdDepartamento;
            
            UsuariosObj CTemp;
            CArray = new ArrayList<>();
            
            try 
            {
                while(CResult.next())
                {
                    iId = CResult.getInt("id");
                    strNombre = CResult.getString("nombre");
                    strApellido = CResult.getString("apellido");
                    iEdad = CResult.getInt("edad");
                    iDui = CResult.getInt("dui");
                    strEmail = CResult.getString("email");
                    strUsername = CResult.getString("username");
                    strPassword = CResult.getString("password");
                    iIdDepartamento = CResult.getInt("iddepartamento");
                    
                    CTemp = new UsuariosObj(iId, strNombre, strApellido,iEdad,iDui,strEmail, strUsername, strPassword, iIdDepartamento);
                    CArray.add(CTemp);
                }
            } 
            catch (SQLException ex) 
            {
                Logger.getLogger(UsuariosLogic.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return CArray;
        
    }
}