package com.suprabackend.entities;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "subjects")
public class Subject {

    @Id
    @GeneratedValue
    private UUID id;
    private String subject;
    private UUID disciplineId;

}
