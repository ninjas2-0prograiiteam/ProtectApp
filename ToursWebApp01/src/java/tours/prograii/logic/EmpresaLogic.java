package tours.prograii.logic;

import tours.prograii.database.DatabaseX;
import tours.prograii.objects.EmpresaObj;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class EmpresaLogic extends Logic
{

    public ArrayList<EmpresaObj> getAllEmpresas() 
    {
        //select * from travelsys.trip;
        //SELECT * FROM tourdatabase.empresa;
        DatabaseX database = getDatabase();
        String strSql = "select * from tourdatabase.empresa ";
        System.out.println(strSql);
        ResultSet CResult = database.executeQuery(strSql);
        ArrayList<EmpresaObj> CArray = null;
        
        if(CResult!=null)
        {
            int iId;
            String strNombre;
            String strEmail;
            int iTelefono;
            String strNit;
            String strUsername;
            String strPassword;
            int iNodecuenta;
            
            EmpresaObj CTemp;
            CArray = new ArrayList<>();
            
            try 
            {
                while(CResult.next())
                {
                    iId = CResult.getInt("id");
                    strNombre = CResult.getString("nombre");
                    strEmail = CResult.getString("email");
                    iTelefono = CResult.getInt("telefono");
                    strNit = CResult.getString("nit");
                    strUsername = CResult.getString("username");
                    strPassword = CResult.getString("password");
                    iNodecuenta = CResult.getInt("nodecuenta");
                    
                    //String strNombre,String strEmail, int iTelefono,int iNit,String strUsername,String strPassword,int iNodecuenta
                    CTemp = new EmpresaObj(iId, strNombre, strEmail, iTelefono, strNit, strUsername, strPassword, iNodecuenta);
                    CArray.add(CTemp);
                }
            } 
            catch (SQLException ex) 
            {
                Logger.getLogger(EmpresaLogic.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return CArray;
    }

    public int insertEmpresaRows(String p_strNombre, String p_strEmail, int p_iTelefono, String p_strNit,
            String p_strUsername, String p_strPassword, int p_iNodeCuenta) 
    {
        //String strSql = "INSERT INTO tourdatabase.empresa (id,nombre,email,telefono,nit,username,password,nodecuenta)"
        //        + "VALUES(0,'"+strNombre+"','"+strEmail+"',"+iTelefono+","+iNit+",'"+strUsername+"','"+strPassword+"',"+iNodecuenta+");";
        DatabaseX database = getDatabase();
        String strSql = "INSERT INTO tourdatabase.empresa (id,nombre,email,telefono,nit,username,password,nodecuenta)"
                + "VALUES(0,'"+p_strNombre+"','"+p_strEmail+"',"+p_iTelefono+",'"+p_strNit+"','"+p_strUsername+"','"+p_strPassword+"',"+p_iNodeCuenta+");";
        
        System.out.println(strSql);
        int iRows = database.executeNonQueryRows(strSql);
        return iRows;
    }
    
   public int BorrarEmpresa(int p_iId) 
    {
        DatabaseX database = getDatabase();
        String strSql = "DELETE FROM tourdatabase.empresa " +
                        "WHERE id="+p_iId+";";
        int iRows = database.executeNonQueryRows(strSql);
        return iRows;
    }
    
    public int updateEmpresaRows(int p_iId, String p_strNombre, String p_strEmail, int p_iTelefono, String p_strNit,
            String p_strUsername, String p_strPassword, int p_iNodeCuenta) 
    {
        //UPDATE tourdatabase.empresa SET id = 7, nombre = 'ctyyuui', email = 'rdtfgy',
        //telefono = 567, nit = 098, username = 'nm', password = 'oty', nodecuenta = 7 WHERE id = 1;
        DatabaseX database = getDatabase();
        String strSql = "UPDATE tourdatabase.empresa SET nombre = '"+p_strNombre+"',"
                + " email = '"+p_strEmail+"', telefono = "+p_iTelefono+", nit = '"+p_strNit+"', username = '"+p_strUsername+"',"
                + " password = '"+p_strPassword+"', nodecuenta = "+p_iNodeCuenta+" WHERE id = "+p_iId+";";
        System.out.println(strSql);
        int iRows = database.executeNonQueryRows(strSql);
        return iRows;        
    }
    
    public EmpresaObj getEmpresaById(int p_iId) 
    {
        //select * from travelsys.client;
        DatabaseX database = getDatabase();
        String strSql = "select * from tourdatabase.empresa where id="+p_iId+" ";
        System.out.println(strSql);
        ResultSet CResult = database.executeQuery(strSql);
        EmpresaObj CTemp = null;
        
        if(CResult!=null)
        {
            int iId;
            String strNombre;
            String strEmail;
            int iTelefono;
            String strNit;
            String strUsername;
            String strPassword;
            int iNodecuenta;
            
            try 
            {
                while(CResult.next())
                {
                    iId = CResult.getInt("id");
                    strNombre = CResult.getString("nombre");
                    strEmail = CResult.getString("email");
                    iTelefono = CResult.getInt("telefono");
                    strNit = CResult.getString("nit");
                    strUsername = CResult.getString("username");
                    strPassword = CResult.getString("password");
                    iNodecuenta = CResult.getInt("nodecuenta");
                    
                    //String strNombre,String strEmail, int iTelefono,int iNit,String strUsername,String strPassword,int iNodecuenta
                    CTemp = new EmpresaObj(iId, strNombre, strEmail, iTelefono, strNit, strUsername, strPassword, iNodecuenta);
                }
            } 
            catch (SQLException ex) 
            {
                Logger.getLogger(EmpresaLogic.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return CTemp;
        
    }
    
    
    
}
    
