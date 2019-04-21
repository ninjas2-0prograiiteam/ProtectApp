package tours.prograii.logic;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import tours.prograii.database.DatabaseX;
import tours.prograii.objects.EventoViewObj;


public class EventoViewLogic extends Logic{
    
    public ArrayList<EventoViewObj> getView() 
    {
        DatabaseX database = getDatabase();
        String strSql = "select * from tourdatabase.eventos ";
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
