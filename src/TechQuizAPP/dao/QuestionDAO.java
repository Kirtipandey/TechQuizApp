/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TechQuizAPP.dao;

import TechQuizAPP.dbutil.DBConnection;
import TechQuizAPP.pojo.PerformancePojo;
import TechQuizAPP.pojo.QuestionPojo;
import TechQuizAPP.pojo.QuestionStore;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author its Kitzz
 */
public class QuestionDAO {
    public static void addQuestion(QuestionStore qstore)throws SQLException{
        String qry="insert into questions values (?,?,?,?,?,?,?,?,?)";
        Connection conn= DBConnection.getConnection();
        PreparedStatement ps= conn.prepareStatement(qry);
     ArrayList <QuestionPojo> questionList=qstore.getAllQuestion();
     for(QuestionPojo obj:questionList){//loop will run jitne uss exam k ander questions h
        ps.setString(1,obj.getExamId());
        ps.setInt(2,obj.getQno());
        ps.setString(3,obj.getQuestion());
        ps.setString(4,obj.getAnswer1());
        ps.setString(5,obj.getAnswer2());
        ps.setString(6,obj.getAnswer3());
        ps.setString(7,obj.getAnswer4());
          ps.setString(8,obj.getCorrectAnswer());
            ps.setString(9,obj.getLanguage());
            ps.executeUpdate();
    }}
    public static void addPerformance(PerformancePojo performance)throws SQLException{
  String qry="Insert into performance values(?,?,?,?,?,?,?)";
  Connection conn=DBConnection.getConnection();
  PreparedStatement ps=conn.prepareStatement(qry);
  ps.setString(1, performance.getUserId());
  ps.setString(2, performance.getExamId());
           ps.setInt(3,performance.getRight());
           ps.setInt(4,performance.getWrong());
           ps.setInt(5,performance.getUnattempted());
           ps.setDouble(6,performance.getPer());
           ps.setString(7,performance.getLanguage());
           ps.executeUpdate();
           }

public static ArrayList <QuestionPojo> getQuestionsByExamId(String examId)throws SQLException{
    String qry="select question from questions where examid=?";
    QuestionStore qstore=new QuestionStore();
        Connection conn= DBConnection.getConnection();
        PreparedStatement ps= conn.prepareStatement(qry);
        ArrayList <QuestionPojo> questionList=qstore.getAllQuestion();
     for(QuestionPojo obj:questionList){//loop will run jitne uss exam k ander questions h
        ps.setString(1,obj.getExamId());
        ps.setInt(2,obj.getQno());
        ps.setString(3,obj.getQuestion());
        ps.setString(4,obj.getAnswer1());
        ps.setString(5,obj.getAnswer2());
        ps.setString(6,obj.getAnswer3());
        ps.setString(7,obj.getAnswer4());
          ps.setString(8,obj.getCorrectAnswer());
            ps.setString(9,obj.getLanguage());
            ps.executeUpdate();
    }
 return questionList;   

}}
    
