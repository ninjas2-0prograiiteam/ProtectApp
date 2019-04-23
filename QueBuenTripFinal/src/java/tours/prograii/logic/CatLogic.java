package tours.prograii.logic;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import tours.prograii.database.DatabaseX;
import tours.prograii.objects.CategoriaObj;
import tours.prograii.objects.EventoViewObj;

public class CatLogic extends Logic{

    public ArrayList<CategoriaObj> getAllCat() 
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

   
   public ArrayList<EventoViewObj> CategoriaView(String p_strCategoria) 
    {
        DatabaseX database = getDatabase();
        String strSql = "SELECT * from eventos where categoria = '"+p_strCategoria+"'";
        System.out.println(strSql);
        ResultSet CResult = database.executeQuery(strSql);
        ArrayList<EventoViewObj> CArray = null;
        
        if(CResult!=null)
        {
            String strEmpresa;
            String strCategoria;
            String strDepartamento;
            String strHoradeSalida;
            String strFecha;
            String strHoradeRetorno;
            String strPuntodeEncuentro;
            int iPrecio;
            int iCuposRestantes;
            EventoViewObj CTemp;
            CArray = new ArrayList<>();
            
            try 
            {
                while(CResult.next())
                {
                    strEmpresa = CResult.getString("empresa");
                    strCategoria = CResult.getString("categoria");
                   strDepartamento = CResult.getString("departamento");
                    strHoradeSalida = CResult.getString("horadesalida");
                    strFecha = CResult.getString("fecha");
                    strHoradeRetorno = CResult.getString("horaderetorno");
                    strPuntodeEncuentro = CResult.getString("puntodeencuentro");
                    iPrecio = CResult.getInt("precio");
                    iCuposRestantes = CResult.getInt("cuposrestantes");
                    CTemp = new EventoViewObj(strEmpresa, strCategoria, strDepartamento, strHoradeSalida, strFecha, strHoradeRetorno, strPuntodeEncuentro, iPrecio,iCuposRestantes);
                    CArray.add(CTemp);
                }
            } 
            catch (SQLException ex) 
            {
                Logger.getLogger(EventoLogic.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return CArray;
    }
   
}
