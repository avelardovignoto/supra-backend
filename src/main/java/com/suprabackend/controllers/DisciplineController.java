package com.suprabackend.controllers;

import com.suprabackend.entities.Discipline;
import com.suprabackend.mappers.DisciplineMapper;
import com.suprabackend.models.DisciplineModel;
import com.suprabackend.services.DisciplineService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path= "/api/v1/disciplines")
public class DisciplineController {
    private  final DisciplineMapper disciplineMapper;
    private final DisciplineService disciplineService;

    public DisciplineController(DisciplineMapper disciplineMapper, DisciplineService disciplineService) {
        this.disciplineMapper = disciplineMapper;
        this.disciplineService = disciplineService;
    }

    @GetMapping
    public ResponseEntity<List<DisciplineModel>> fetchDisciplines() {
        List<Discipline> disciplines = disciplineService.fetchDisciplines();
        return ResponseEntity.ok(disciplineMapper.toModelList(disciplines));
    }

}
