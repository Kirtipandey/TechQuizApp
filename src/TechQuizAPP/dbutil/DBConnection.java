/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TechQuizAPP.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author its Kitzz
 */
public class DBConnection {
   private static Connection conn;
    static{
        try
        {
           Class.forName("oracle.jdbc.OracleDriver");
conn = DriverManager.getConnection("jdbc:oracle:thin:@//LAPTOP-5OGRHAH3:1521/XE","onlineexam","student");   
            JOptionPane.showMessageDialog(null, "Connected Successfully To The Database");
           }
        catch(Exception ex){
        JOptionPane.showMessageDialog(null, "Error Connecting To The Database");
ex.printStackTrace();
                }
    }
  public static Connection getConnection(){
  return conn;   
 }
 public static void closeConnection(){
     try{
         
         conn.close();
         System.out.println("Connection closed");
        }
     catch(Exception e){
         e.printStackTrace();
         System.out.println("cant close the connection");
     }
}  
    
}
