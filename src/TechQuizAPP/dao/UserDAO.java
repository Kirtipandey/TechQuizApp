/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TechQuizAPP.dao;

import TechQuizAPP.dbutil.DBConnection;
import TechQuizAPP.pojo.UserPojo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author its Kitzz
 */
public class UserDAO {
    public static boolean  validateUser(UserPojo user)throws SQLException{
  Connection conn=DBConnection.getConnection();
      PreparedStatement ps =conn.prepareStatement("select * from users where userid=? and password=? and usertype=? ");
      ps.setString(1, user.getUserId());
      ps.setString(2, user.getPassword());
      ps.setString(3, user.getUserType());
      ResultSet rs=ps.executeQuery();
        System.out.println(user.getUserId());
        System.out.println(user.getPassword());
        System.out.println(user.getUserType());
      return rs.next();//method is called from inside loginframes
 }
    public static boolean addUser(UserPojo user)throws SQLException{  
    
    String qry="Select * from users where userid=?";
    boolean status= true;
    Connection conn=DBConnection.getConnection();
      PreparedStatement ps =conn.prepareStatement(qry);
      ps.setString(1, user.getUserId());
      ResultSet rs=ps.executeQuery();
       if(rs.next())
           status= false;
       else{
            qry="insert into users values(?,?,?)";
            ps=conn.prepareStatement(qry);
            ps.setString(1, user.getUserId());
            ps.setString(2,user.getPassword());
            ps.setString(3, user.getUserType());
            ps.executeUpdate();
               }
      return status;
    }
    public static boolean changePassword(String userid,String password)throws SQLException{
        String qry="Update users set password=? where userid=?";
        boolean status=true;
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement(qry);
        ps.setString(1,password);	
        ps.setString(2,userid);
        int ans=ps.executeUpdate();
        if(ans==0)
               status=false;
     return status;
     } 

}
