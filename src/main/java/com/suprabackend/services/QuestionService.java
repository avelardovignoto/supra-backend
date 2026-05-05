package com.suprabackend.services;

import com.suprabackend.entities.Question;
import com.suprabackend.entities.QuestionOption;
import com.suprabackend.mappers.QuestionMapper;
import com.suprabackend.models.QuestionModel;
import com.suprabackend.repositories.QuestionOptionRepository;
import com.suprabackend.repositories.QuestionRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class QuestionService {

    private final QuestionRepository questionRepository;
    private final QuestionOptionRepository questionOptionRepository;
    private final QuestionMapper questionMapper;

    public QuestionService(QuestionRepository questionRepository,
                           QuestionOptionRepository questionOptionRepository,
                           QuestionMapper questionMapper) {
        this.questionRepository = questionRepository;
        this.questionOptionRepository = questionOptionRepository;
        this.questionMapper = questionMapper;
    }

    @Transactional
    public QuestionModel create(QuestionModel questionModel) {
        Question question = questionMapper.fromModel(questionModel);
        Question persistedQuestion = questionRepository.save(question);

        List<QuestionOption> optionsToSave = questionModel.getOptions()
                .stream()
                .map(option -> {
                    option.setQuestionId(persistedQuestion.getId());
                    return option;
                })
                .map(questionMapper::fromModel)
                .collect(Collectors.toList());

        List<QuestionOption> persistedQuestionOptions = questionOptionRepository.saveAll(optionsToSave);

        persistedQuestion.setOptions(persistedQuestionOptions);

        return questionMapper.fromEntity(persistedQuestion);
    }

}
