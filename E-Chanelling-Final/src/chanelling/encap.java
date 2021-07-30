/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chanelling;

import static chanelling.Login.txtusername;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Rashmi
 */
public class encap {
    
    Connection conn = connection.connect();
    private String uName;
    private String uPw;
    private String uType;
    private boolean status = false;
    
    public void setData (String uname, String upw, String  utype){
        this.uName = uname;
        this.uPw = upw;
        this.uType = utype;
        
        
    }
    
    
    public boolean getData (){
        try {
            // TODO add your handling code here:
            
                 String sql = "select * from user where username = ? and password = ? and utype =? ";
        
                 PreparedStatement preparedStatement = conn.prepareStatement(sql);
                
  
                    preparedStatement.setString(1,  uName);
                    preparedStatement.setString(2, uPw);
                    preparedStatement.setString(3, uType);



                    ResultSet rs = preparedStatement.executeQuery();
                
                if(rs.next()){
                    
                        status = true;
 
                    }else{
                    
                       status = false;
                    
                }
                    

        } catch (SQLException ex) {
           System.out.println(ex);
        }
        return status;
    }   
    
}
