package com.suprabackend.entities;

import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "questions")
public class Question {

    @Id
    @GeneratedValue
    private UUID id;
    private UUID disciplineId;
    private UUID subjectId;
    private String question;
    private String context;

    @Transient
    private List<QuestionOption> options;

    public String getId() {
        return id.toString();
    }

    public String getDisciplineId() {
        return disciplineId.toString();
    }

    public String getSubjectId() {
        if (subjectId == null) return null;
        return subjectId.toString();
    }

    public String getQuestion() {
        return question;
    }

    public String getContext() {
        return context;
    }

    public List<QuestionOption> getOptions() {
        return options;
    }

    public void setOptions(List<QuestionOption> options) {
        this.options = options;
    }

    public void setDisciplineId(String discipline) {
        this.disciplineId = UUID.fromString(discipline);
    }

    public void setSubjectId(String subjectId) {
        if (subjectId != null) {
            this.subjectId = UUID.fromString(subjectId);
        }
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setContext(String context) {
        this.context = context;
    }

}
