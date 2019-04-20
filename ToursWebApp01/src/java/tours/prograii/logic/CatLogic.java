package tours.prograii.logic;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import tours.prograii.database.DatabaseX;
import tours.prograii.objects.CategoriaObj;

public class CatLogic extends Logic{

    public ArrayList<CategoriaObj> getAllDeps() 
    {
        //select * from travelsys.client;
        DatabaseX database = getDatabase();
        String strSql = "select * from tourdatabase.categoria ";
        System.out.println(strSql);
        ResultSet CResult = database.executeQuery(strSql);
        ArrayList<CategoriaObj> CArray = null;
        
        if(CResult!=null)
        {
            int iId;
            String strTipo;
            String strDescripcion;
            
            CategoriaObj CTemp;
            CArray = new ArrayList<>();
            
            try 
            {
                while(CResult.next())
                {
                    iId = CResult.getInt("id");
                    strTipo = CResult.getString("tipo");
                    strDescripcion = CResult.getString("descripcion");
                    
                    
                    CTemp = new CategoriaObj(iId, strTipo,strDescripcion);
                    CArray.add(CTemp);
                }
            } 
            catch (SQLException ex) 
            {
                Logger.getLogger(DepLogic.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return CArray;
        
    }    
}
