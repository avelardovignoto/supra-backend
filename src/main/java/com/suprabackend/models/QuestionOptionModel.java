package com.suprabackend.models;

public class QuestionOptionModel {

    private String id;
    private String questionId;
    private String option;
    private Boolean isCorrect;

    public String getQuestionId() {
        return questionId;
    }

    public String getOption() {
        return option;
    }

    public Boolean getIsCorrect() {
        return isCorrect;
    }

    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setOption(String option) {
        this.option = option;
    }

    public void setIsCorrect(Boolean isCorrect) {
        this.isCorrect = isCorrect;
    }

    public String getId() {
        return id;
    }

}
