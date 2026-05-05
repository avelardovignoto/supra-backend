package com.suprabackend.entities;

import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "disciplines")
public class Discipline {

    @Id
    @GeneratedValue
    private UUID id;
    private String discipline;

    @Transient
    private List<Subject> subjects;

    @Transient
    private List<Question> questions;

}
