package com.suprabackend.entities;

import com.suprabackend.models.QuestionOptionModel;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table(name = "question_options")
public class QuestionOption {

    @Id
    @GeneratedValue
    private UUID id;
    private UUID questionId;
    private String option;
    private Boolean isCorrect;

    public String getId() {
        return id.toString();
    }

    public String getQuestionId() {
        return questionId.toString();
    }

    public String getOption() {
        return option;
    }

    public Boolean getIsCorrect() {
        return isCorrect;
    }

    public void setQuestionId(String questionId) {
        this.questionId = UUID.fromString(questionId);
    }

    public void setOption(String option) {
        this.option = option;
    }

    public void setIsCorrect(Boolean isCorrect) {
        this.isCorrect = isCorrect;
    }

}
