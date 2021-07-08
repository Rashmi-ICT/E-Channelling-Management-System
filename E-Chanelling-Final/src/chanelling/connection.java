/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chanelling;
import java.sql.Connection;
import java.sql.DriverManager;


import java.sql.SQLException;


/**
 *
 * @author Rashmi
 */
class connection {
    
    public static Connection connect(){
        Connection conn = null;
        
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/e-channeling","root","");
        
        }catch(Exception e){
            
            System.out.printf("  Db error  ", e);
            
        }
        
        return conn;
        
    }
    
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */




