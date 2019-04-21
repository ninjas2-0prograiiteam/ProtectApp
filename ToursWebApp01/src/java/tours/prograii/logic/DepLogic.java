package tours.prograii.logic;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import tours.prograii.database.DatabaseX;
import tours.prograii.objects.DepartamentosObj;

public class DepLogic extends Logic {
    public ArrayList<DepartamentosObj> getAllDeps() 
    {
        //select * from travelsys.client;
        DatabaseX database = getDatabase();
        String strSql = "select * from tourdatabase.departamentos ";
        System.out.println(strSql);
        ResultSet CResult = database.executeQuery(strSql);
        ArrayList<DepartamentosObj> CArray = null;
        
        if(CResult!=null)
        {
            int iId;
            String strNombre;
            int iIdDepartamento;
            
            DepartamentosObj CTemp;
            CArray = new ArrayList<>();
            
            try 
            {
                while(CResult.next())
                {
                    iId = CResult.getInt("id");
                    strNombre = CResult.getString("nombre");
                    
                    
                    CTemp = new DepartamentosObj(iId, strNombre);
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
