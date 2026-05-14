package com.suprabackend.services;

import com.suprabackend.entities.Discipline;
import com.suprabackend.entities.Subject;
import com.suprabackend.repositories.DisciplineRepository;
import com.suprabackend.repositories.SubjectRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class DisciplineService {
    private final DisciplineRepository disciplineRepository;
    private final SubjectRepository subjectRepository;

    public DisciplineService(DisciplineRepository disciplineRepository, SubjectRepository subjectRepository) {
        this.disciplineRepository = disciplineRepository;
        this.subjectRepository = subjectRepository;
    }

    public List<Discipline> fetchDisciplines() {
        List<Discipline> disciplines = disciplineRepository.findAll();

        List<UUID> ids = disciplines.stream()
                .map(Discipline::getId)
                .toList();

        List<Subject> subjects = subjectRepository.findByDisciplineIdIn(ids);

        Map<UUID, List<Subject>> subjectsByDiscipline =
                subjects.stream()
                        .collect(Collectors.groupingBy(Subject::getDisciplineId));

        disciplines.forEach(discipline -> {
            List<Subject> disciplineSubjects =
                    subjectsByDiscipline.getOrDefault(
                            discipline.getId(),
                            new ArrayList<>()
                    );

            discipline.setSubjects(disciplineSubjects);
        });

        return disciplines;
    }

}
