package com.suprabackend.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table(name = "options")
public class Option {
    @Id
    @GeneratedValue
    private UUID id;
    private UUID questionId;
    private String option;
    private Boolean isCorrect;
}
