/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TechQuizAPP.pojo;

import java.util.Objects;

/**
 *
 * @author its Kitzz
 */
public class AnswerPojo {

    public AnswerPojo(String examId, String subject, int qno, String chosenAnswer, String correctAnswer) {
        this.examId = examId;
        this.subject = subject;
        this.qno = qno;
        this.chosenAnswer = chosenAnswer;
        this.correctAnswer = correctAnswer;
    }

    public String getExamId() {
        return examId;
    }

    public String getSubject() {
        return subject;
    }

    public int getQno() {
        return qno;
    }

    public String getChosenAnswer() {
        return chosenAnswer;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setExamId(String examId) {
        this.examId = examId;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setQno(int qno) {
        this.qno = qno;
    }

    public void setChosenAnswer(String chosenAnswer) {
        this.chosenAnswer = chosenAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final AnswerPojo other = (AnswerPojo) obj;
        if (this.qno != other.qno) {
            return false;
        }
        if (!Objects.equals(this.examId, other.examId)) {
            return false;
        }
        if (!Objects.equals(this.subject, other.subject)) {
            return false;
        }
        if (!Objects.equals(this.chosenAnswer, other.chosenAnswer)) {
            return false;
        }
        if (!Objects.equals(this.correctAnswer, other.correctAnswer)) {
            return false;
        }
        return true;
    }
     private String examId;
    private String subject;
    private int qno;
    private String chosenAnswer;
    private String correctAnswer;

    @Override
    public String toString() {
        return "AnswerPojo{" + "examId=" + examId + ", subject=" + subject + ", qno=" + qno + ", chosenAnswer=" + chosenAnswer + ", correctAnswer=" + correctAnswer + '}';
    }
   


    
}
