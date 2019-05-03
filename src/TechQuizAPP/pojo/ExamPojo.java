/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TechQuizAPP.pojo;

/**
 *
 * @author its Kitzz
 */
public class ExamPojo {

    @Override
    public String toString() {
        return "ExamPojo{" + "Examid=" + Examid + ", language=" + language + ", totalQuestion=" + totalQuestion + '}';
    }

    public ExamPojo(String Examid, String language, int totalQuestion) {
        this.Examid = Examid;
        this.language = language;
        this.totalQuestion = totalQuestion;
    }

    public void setExamid(String Examid) {
        this.Examid = Examid;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setTotalQuestion(int totalQuestion) {
        this.totalQuestion = totalQuestion;
    }

    public String getExamid() {
        return Examid;
    }

    public String getLanguage() {
        return language;
    }

    public int getTotalQuestion() {
        return totalQuestion;
    }
    private String Examid;
    private String language;
    private int totalQuestion;
    
    
    
}
