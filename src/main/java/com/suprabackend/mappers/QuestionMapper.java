package com.suprabackend.mappers;

import com.suprabackend.entities.Question;
import com.suprabackend.entities.QuestionOption;
import com.suprabackend.models.QuestionModel;
import com.suprabackend.models.QuestionOptionModel;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class QuestionMapper {

    public QuestionModel fromEntity(Question question) {
        QuestionModel questionModel = new QuestionModel();
        questionModel.setId(question.getId());
        questionModel.setDisciplineId(question.getDisciplineId());
        questionModel.setSubjectId(question.getSubjectId());
        questionModel.setQuestion(question.getQuestion());
        questionModel.setContext(question.getContext());

        List<QuestionOptionModel> options = question.getOptions()
                .stream()
                .map(this::fromEntity)
                .collect(Collectors.toList());

        questionModel.setOptions(options);

        return questionModel;
    }

    public QuestionOptionModel fromEntity(QuestionOption questionOption) {
        QuestionOptionModel questionOptionModel = new QuestionOptionModel();
        questionOptionModel.setId(questionOption.getId());
        questionOptionModel.setQuestionId(questionOption.getQuestionId());
        questionOptionModel.setOption(questionOption.getOption());
        questionOptionModel.setIsCorrect(questionOption.getIsCorrect());

        return questionOptionModel;
    }

    public Question fromModel(QuestionModel questionModel) {
        Question question = new Question();

        BeanUtils.copyProperties(questionModel, question);

        return question;
    }

    public QuestionOption fromModel(QuestionOptionModel questionOptionModel) {
        QuestionOption questionOption = new QuestionOption();
        questionOption.setQuestionId(questionOptionModel.getQuestionId());
        questionOption.setOption(questionOptionModel.getOption());
        questionOption.setIsCorrect(questionOptionModel.getIsCorrect());

        return questionOption;
    }

}
