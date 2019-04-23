package tours.prograii.logic;

import tours.prograii.database.DatabaseX;
import tours.prograii.objects.CarritoDeComprasObj;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import tours.prograii.objects.CarritoView;



public class CarritoDeComprasLogic extends Logic
{

    public ArrayList<CarritoDeComprasObj> getAllCarritos() 
    {
        
        //SELECT * FROM tourdatabase.carritodecompras;
        DatabaseX database = getDatabase();
        String strSql = "select * from tourdatabase.carritodecompras ";
        System.out.println(strSql);
        ResultSet CResult = database.executeQuery(strSql);
        ArrayList<CarritoDeComprasObj> CArray = null;
        
        if(CResult!=null)
        {
            int iId;
            int iIdEvento;
            int iIdUsuario;
            int iTotal;
            
            CarritoDeComprasObj CTemp;
            CArray = new ArrayList<>();
            
            try 
            {
                while(CResult.next())
                {
                    iId = CResult.getInt("id");
                    iIdEvento = CResult.getInt("idevento");
                    iIdUsuario = CResult.getInt("idusuario");
                    iTotal = CResult.getInt("total");
                    
                    
                    CTemp = new CarritoDeComprasObj(iId, iIdEvento, iIdUsuario, iTotal);
                    CArray.add(CTemp);
                }
            } 
            catch (SQLException ex) 
            {
                Logger.getLogger(CarritoDeComprasLogic.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return CArray;
    }
    //int p_iId, int p_iIdUsuario, int p_iIdEvento, int p_iTotal
    public int insertCarritoRows(int p_iIdUsuario, int p_iIdEvento, int p_iTotal) 
    {
        //INSERT INTO tourdatabase.carritodecompras (id,idusuario,idevento,total) VALUES (0,2,6,876);
        //VALUES(,,,,,,,);
        DatabaseX database = getDatabase();
        String strSql = "INSERT INTO tourdatabase.carritodecompras (id,idusuario,idevento,total)"
                + "VALUES(0,"+p_iIdUsuario+","+p_iIdEvento+","+p_iTotal+");";
        
        System.out.println(strSql);
        int iRows = database.executeNonQueryRows(strSql);
        return iRows;
    }
    
   public int BorrarCarrito(int p_iId) 
    {
        DatabaseX database = getDatabase();
        String strSql = "DELETE FROM tourdatabase.carritodecompras " +
                        "WHERE id="+p_iId+";";
        int iRows = database.executeNonQueryRows(strSql);
        return iRows;
    }
    
    public int updateCarritoRows(int p_iId, int p_iIdUsuario, int p_iIdEvento, int p_iTotal) 
    {
        //UPDATE tourdatabase.carritodecompras SET id = 2, idusuario = 8, idevento = 7, total = 8767 WHERE id = 1;
        DatabaseX database = getDatabase();
        String strSql = "UPDATE tourdatabase.carritodecompras SET idusuario = "+p_iIdUsuario+", idevento = "+p_iIdEvento+", total ="+p_iTotal+""
                + " WHERE id = "+p_iId+";";
        System.out.println(strSql);
        int iRows = database.executeNonQueryRows(strSql);
        return iRows;        
    }
    
    public CarritoDeComprasObj getCarritoById(int p_iId) 
    {
        //select * from travelsys.client;
        DatabaseX database = getDatabase();
        String strSql = "select * from tourdatabase.carritodecompras where id="+p_iId+" ";
        System.out.println(strSql);
        ResultSet CResult = database.executeQuery(strSql);
        CarritoDeComprasObj CTemp = null;
        
        if(CResult!=null)
        {
            int iId;
            int iIdEvento;
            int iIdUsuario;
            int iTotal;
            
            
            try 
            {
                while(CResult.next())
                {
                    iId = CResult.getInt("id");
                    iIdEvento = CResult.getInt("idevento");
                    iIdUsuario = CResult.getInt("idusuario");
                    iTotal = CResult.getInt("total");
                    
                    //String strNombre,String strEmail, int iTelefono,int iNit,String strUsername,String strPassword,int iNodecuenta
                    CTemp = new CarritoDeComprasObj(iId, iIdEvento, iIdUsuario, iTotal);
                }
            } 
            catch (SQLException ex) 
            {
                Logger.getLogger(CarritoDeComprasLogic.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return CTemp;
        
    }
    
        
       public ArrayList<CarritoView> getAllCarritoView(String p_strUsername) 
    {
        
        //SELECT * FROM tourdatabase.carritodecompras;
        DatabaseX database = getDatabase();
        String strSql = "SELECT * FROM tourdatabase.carritousuarios where username='"+p_strUsername+"' ";
        System.out.println(strSql);
        ResultSet CResult = database.executeQuery(strSql);
        ArrayList<CarritoView> CArray = null;
        
        if(CResult!=null)
        {
            String strUsername;
            int iIdEvento;
            int iTotal;
            
            CarritoView CTemp;
            CArray = new ArrayList<>();
            
            try 
            {
                while(CResult.next())
                {
                    strUsername = CResult.getString("username");
                    iIdEvento = CResult.getInt("idevento");
                    iTotal = CResult.getInt("total");
                    
                    
                    CTemp = new CarritoView(strUsername, iIdEvento, iTotal);
                    CArray.add(CTemp);
                }
            } 
            catch (SQLException ex) 
            {
                Logger.getLogger(CarritoDeComprasLogic.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return CArray;
    }
    
}