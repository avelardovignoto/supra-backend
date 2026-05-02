package com.suprabackend.controllers;

import com.suprabackend.services.QuestionService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuestionControllers {

    private final QuestionService questionService;

    public QuestionControllers(QuestionService questionService) {
        this.questionService = questionService;
    }
}
