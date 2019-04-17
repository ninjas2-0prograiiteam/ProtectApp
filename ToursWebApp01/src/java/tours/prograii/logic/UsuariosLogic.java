package tours.prograii.logic;

import tours.prograii.database.DatabaseX;

public class UsuariosLogic extends Logic {

    public boolean RegistrarNuevoUsuario(String p_strNombre,String p_strApellido,int p_iEdad,int p_iDui,int p_iNit,
            String p_strEmail,String p_strUsername, String p_strPassword,int p_iIdDepartamento){
        DatabaseX database = getDatabase();
        String strSql = "INSERT INTO tourdatabase.usuarios"
                        + "(id,nombre,apellido,edad,dui,nit,email,username,password,iddepartamento)" +
                        "VALUES(0,'"+p_strNombre+"','"+p_strApellido+"',"+p_iEdad+","+p_iDui+","+p_iNit+",'"+p_strEmail+"',"
                        + "'"+p_strUsername+"','"+p_strPassword+"',"+p_iIdDepartamento+");";
        boolean bsucces = database.executeNonQueryBool(strSql);
       return bsucces;
    }
    
    public int RegistrarNuevoUsuarioInt(String p_strNombre,String p_strApellido,int p_iEdad,int p_iDui,int p_iNit,
            String p_strEmail,String p_strUsername, String p_strPassword,int p_iIdDepartamento){
        DatabaseX database = getDatabase();
        String strSql = "INSERT INTO tourdatabase.usuarios"
                        + "(id,nombre,apellido,edad,dui,nit,email,username,password,iddepartamento)" +
                        "VALUES(0,'"+p_strNombre+"','"+p_strApellido+"',"+p_iEdad+","+p_iDui+","+p_iNit+",'"+p_strEmail+"',"
                        + "'"+p_strUsername+"','"+p_strPassword+"',"+p_iIdDepartamento+");";
        int iRows = database.executeNonQueryRows(strSql);
        return iRows;
        }
    
        public int BorrarUsuario(int p_iId) 
    {
        DatabaseX database = getDatabase();
        String strSql = "DELETE FROM tourdatabase.usuarios" +
                        "WHERE id="+p_iId+";";
        int iRows = database.executeNonQueryRows(strSql);
        return iRows;
    }
        
        public int ActualizarUsuario(int p_iId,String p_strNombre,String p_strApellido,int p_iEdad,int p_iDui,int p_iNit,
            String p_strEmail,String p_strUsername, String p_strPassword,int p_iIdDepartamento){
           DatabaseX database = getDatabase(); 
           String strSql = "UPDATE tourdatabase.usuarios" +
                           "SET" +
                           "id = "+p_iId+"," +
                           "nombre = '"+p_strNombre+"'," +
                           "apellido = '"+p_strApellido+"'," +
                           "edad = "+p_iEdad+"," +
                           "dui = "+p_iDui+"," +
                           "nit = "+p_iNit+"," +
                           "email = '"+p_strEmail+"'," +
                           "username ='"+p_strUsername+"'," +
                           "password = '"+p_strPassword+"'," +
                           "iddepartamento = "+p_iIdDepartamento+"" +
                           "WHERE id = "+p_iId+";";
           int iRows = database.executeNonQueryRows(strSql);
           return iRows;
        }
}