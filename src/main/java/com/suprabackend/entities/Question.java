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
    private String question;
    private String context;
    @Transient
    private List<Option> options;
}
