package com.suprabackend.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table(name = "subjects")
public class Subject {

    @Id
    @GeneratedValue
    private UUID id;
    private String subject;
    private UUID disciplineId;

    public UUID getDisciplineId() {
        return disciplineId;
    }

    public UUID getId() {
        return id;
    }

    public String getSubject() {
        return subject;
    }

}
