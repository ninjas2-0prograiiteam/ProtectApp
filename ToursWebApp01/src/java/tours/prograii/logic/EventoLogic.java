package tours.prograii.logic;

import tours.prograii.database.DatabaseX;
import tours.prograii.objects.EventoObj;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import tours.prograii.database.DatabaseX;

public class EventoLogic extends Logic
{

     public ArrayList<EventoObj> getAllEventos() 
    {
        DatabaseX database = getDatabase();
        String strSql = "select * from tourdatabase.evento ";
        System.out.println(strSql);
        ResultSet CResult = database.executeQuery(strSql);
        ArrayList<EventoObj> CArray = null;
        
        if(CResult!=null)
        {
            int iId;
            int iIdEmpresa;
            int iIdCategoria;
            int iIdDepartamento;
            String strHoradeSalida;
            String strFecha;
            String strHoradeRetorno;
            String strPuntodeEncuentro;
            int iPrecio;
            
            EventoObj CTemp;
            CArray = new ArrayList<>();
            
            try 
            {
                while(CResult.next())
                {
                    iId = CResult.getInt("id");
                    iIdEmpresa = CResult.getInt("idempresa");
                    iIdCategoria = CResult.getInt("idcategoria");
                    iIdDepartamento = CResult.getInt("iddepartamento");
                    strHoradeSalida = CResult.getString("horadesalida");
                    strFecha = CResult.getString("fecha");
                    strHoradeRetorno = CResult.getString("horaderetorno");
                    strPuntodeEncuentro = CResult.getString("puntodeencuentro");
                    iPrecio = CResult.getInt("precio");
                    CTemp = new EventoObj(iId, iIdEmpresa, iIdCategoria, iIdDepartamento, strHoradeSalida, strFecha, strHoradeRetorno, strPuntodeEncuentro, iPrecio);
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
    
    public int InsertarNuevoEventoInt(int p_iIdEmpresa ,int p_iIdCategoria, int p_iIdDepartamento, String p_strHoradeSalida,
            String p_strFecha, String p_strHoradeRetorno, String p_strPuntodeEncuentro, int p_iPrecio){
        DatabaseX database = getDatabase();
        String strSql = "INSERT INTO tourdatabase.evento(id,idempresa,idcategoria,iddepartamento,horadesalida,fecha,horaderetorno,puntodeencuentro,precio)\n" +
                        "VALUES(0,"+p_iIdEmpresa+","+p_iIdCategoria+","+p_iIdDepartamento+",'"+p_strHoradeSalida+"','"+p_strFecha+"','"+p_strHoradeRetorno+"','"+p_strPuntodeEncuentro+"',"+p_iPrecio+");";
        int iRows = database.executeNonQueryRows(strSql);
        return iRows;
        }
    
        public int BorrarEvento(int p_iId) 
    {
        DatabaseX database = getDatabase();
        String strSql = "DELETE FROM tourdatabase.evento " +
                        "WHERE id="+p_iId+";";
        int iRows = database.executeNonQueryRows(strSql);
        return iRows;
    }
        public EventoObj getEventoPorId(int p_iId) 
    {
        //select * from travelsys.client;
        DatabaseX database = getDatabase();
        String strSql = "select * from tourdatabase.evento "
                + "where id="+p_iId+" ";
        System.out.println(strSql);
        ResultSet CResult = database.executeQuery(strSql);
        EventoObj CTemp = null;
        
        if(CResult!=null)
        {
            int iId;
            int iIdEmpresa;
            int iIdCategoria;
            int iIdDepartamento;
            String strHoradeSalida;
            String strFecha;
            String strHoradeRetorno;
            String strPuntodeEncuentro;
            int iPrecio;
            
            try 
            {
                while(CResult.next())
                {
                    iId = CResult.getInt("id");
                    iIdEmpresa = CResult.getInt("idempresa");
                    iIdCategoria =CResult.getInt("idcategoria");
                    iIdDepartamento = CResult.getInt("iddepartamento");
                    strHoradeSalida = CResult.getString("horadesalida");
                    strFecha = CResult.getString("fecha");
                    strHoradeRetorno = CResult.getString("horaderetorno");
                    strPuntodeEncuentro = CResult.getString("puntodeencuentro");
                    iPrecio = CResult.getInt("precio");
                    CTemp = new EventoObj(iId, iIdEmpresa, iIdCategoria, iIdDepartamento, strHoradeSalida, strFecha, strHoradeRetorno, strPuntodeEncuentro, iPrecio);
                }
            } 
            catch (SQLException ex) 
            {
                Logger.getLogger(EventoLogic.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return CTemp;
    }
        public int ActualizarEvento(int p_iId,int p_iIdEmpresa ,int p_iIdCategoria, int p_iIdDepartamento, String p_strHoradeSalida,
            String p_strFecha, String p_strHoradeRetorno, String p_strPuntodeEncuentro, int p_iPrecio){
           DatabaseX database = getDatabase(); 
           String strSql = "UPDATE tourdatabase.evento " +
                           "SET " +                    
                           "id = "+p_iId+"," +
                           "idempresa = "+p_iIdEmpresa+"," +
                           "idcategoria = "+p_iIdCategoria+"," +
                           "iddepartamento = "+p_iIdDepartamento+"," +
                           "horadesalida = '"+p_strHoradeSalida+"'," +
                           "fecha = '"+p_strFecha+"'," +
                           "horaderetorno = '"+p_strHoradeRetorno+"'," +
                           "puntodeencuentro ='"+p_strPuntodeEncuentro+"'," +
                           "precio = "+p_iPrecio+" " +                   
                           "WHERE id = "+p_iId+";";
           int iRows = database.executeNonQueryRows(strSql);
           return iRows;
    }
}
