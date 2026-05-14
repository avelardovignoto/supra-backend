package com.suprabackend.mappers;

import com.suprabackend.entities.Discipline;
import com.suprabackend.models.DisciplineModel;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Component
public class DisciplineMapper {
    public static Discipline toEntity(DisciplineModel model) {

        Discipline entity = new Discipline();

        entity.setId(UUID.fromString(model.getId()));
        entity.setDiscipline(model.getDiscipline());
        entity.setSubjects(model.getSubjects());
        entity.setQuestions(model.getQuestions());

        return entity;
    }

    public static DisciplineModel toModel(Discipline entity) {

        DisciplineModel model = new DisciplineModel();

        model.setId(entity.getId().toString());
        model.setDiscipline(entity.getDiscipline());
        model.setSubjects(entity.getSubjects());
        model.setQuestions(entity.getQuestions());

        return model;
    }

    public List<Discipline> toEntityList(List<DisciplineModel> models) {
        return models.stream()
                .map(DisciplineMapper::toEntity)
                .toList();
    }

    public List<DisciplineModel> toModelList(List<Discipline> entities) {
        return entities.stream()
                .map(DisciplineMapper::toModel)
                .toList();
    }
}
