package com.suprabackend.controllers;

import com.suprabackend.models.QuestionModel;
import com.suprabackend.services.QuestionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/questions")
public class QuestionController {

    private final QuestionService questionService;

    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @PostMapping
    public ResponseEntity<QuestionModel> create(@RequestBody QuestionModel questionModel) {
        QuestionModel persistedQuestionModel = questionService.create(questionModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(persistedQuestionModel);
    }

}
