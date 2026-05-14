package com.suprabackend.models;

import com.suprabackend.entities.Question;
import com.suprabackend.entities.Subject;

import java.util.List;

public class DisciplineModel {
    private String id;
    private String discipline;
    private List<Subject> subjects;
    private List<Question> questions;

    public String getId() {
        return id;
    }

    public String getDiscipline() {
        return discipline;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }
}
