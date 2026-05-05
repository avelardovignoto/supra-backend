package com.suprabackend.models;

import com.suprabackend.entities.Question;

import java.util.List;
import java.util.UUID;

public class QuestionModel {

    private String id;
    private String disciplineId;
    private String subjectId;
    private String question;
    private String context;
    private List<QuestionOptionModel> options;

    public String getDisciplineId() {
        return disciplineId;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public String getQuestion() {
        return question;
    }

    public String getContext() {
        return context;
    }

    public List<QuestionOptionModel> getOptions() {
        return options;
    }

    public void setOptions(List<QuestionOptionModel> options) {
        this.options = options;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDisciplineId(String disciplineId) {
        this.disciplineId = disciplineId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setContext(String context) {
        this.context = context;
    }

}
