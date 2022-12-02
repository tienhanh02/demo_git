package com.example.quizzzz;

public class QuestionAndAnswer {
    private String question, option1, option2;
    private  int correstAnsNo;

    public QuestionAndAnswer(String question, String option1, String option2, int correstAnsNo){
        this.question = question;
        this.option1   = option1;
        this.option2 = option2;
        this.correstAnsNo = correstAnsNo;

    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getOption1() {
        return option1;
    }

    public void setOption1(String option1) {
        this.option1 = option1;
    }

    public String getOption2() {
        return option2;
    }

    public void setOption2(String option2) {
        this.option2 = option2;
    }

    public int getCorrestAnsNo() {
        return correstAnsNo;
    }

    public void setCorrestAnsNo(int correstAnsNo) {
        this.correstAnsNo = correstAnsNo;
    }
}
