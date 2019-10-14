/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataprotectionapp;

/**
 *
 * @author Tony Clabby x16411702
 */
public class DataProtection {
    //data members
    private String answer1;
    private String answer2;
    private String answer3;
    private String answer4;
    private int score;
    
    //constructor
    public DataProtection(){
        this.answer1="";
        this.answer2="";
        this.answer3="";
        this.answer4="";
        this.score=0;
        
    }
    
    //Overloaded constructor
    public DataProtection(String answer1, String answer2, String answer3, String answer4, int score) {
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answer4 = answer4;
        this.score = score;
    }
    
    
    //Getters and setters
    public String getAnswer1() {
        return answer1;
    }

    public void setAnswer1(String answer1) {
        this.answer1 = answer1;
    }

    public String getAnswer2() {
        return answer2;
    }

    public void setAnswer2(String answer2) {
        this.answer2 = answer2;
    }

    public String getAnswer3() {
        return answer3;
    }

    public void setAnswer3(String answer3) {
        this.answer3 = answer3;
    }

    public String getAnswer4() {
        return answer4;
    }

    public void setAnswer4(String answer4) {
        this.answer4 = answer4;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    
    
    
    
    
}
