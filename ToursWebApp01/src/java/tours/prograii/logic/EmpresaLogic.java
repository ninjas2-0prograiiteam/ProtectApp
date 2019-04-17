/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tours.prograii.logic;

import tours.prograii.database.DatabaseX;

/**
 *
 * @author HP
 */
public class EmpresaLogic extends Logic {
    public int insertEmpresaRows(String strNombre,String strEmail, int iTelefono,int iNit,String strUsername,String strPassword,int iNodecuenta )
    {
    
        //INSERT INTO tourdatabase.empresa(id,nombre,email,telefono,nit,username,password,nodecuenta)VALUES(0,'jkair','jajaja',1,1,'asdas','asda',0);

        DatabaseX database = getDatabase();
        String strSql = "INSERT INTO tourdatabase.empresa(id,nombre,email,telefono,nit,username,password,nodecuenta)"
                + "VALUES(0,'"+strNombre+"','"+strEmail+"',"+iTelefono+","+iNit+",'"+strUsername+"','"+strPassword+"',"+iNodecuenta+");";

        System.out.println(strSql);
        
        int iRows =database.executeNonQueryRows(strSql);
        return iRows;
    }

   
    
    
}
