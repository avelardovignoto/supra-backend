package com.suprabackend.services;

import com.suprabackend.repositories.QuestionRepository;
import org.springframework.stereotype.Service;

@Service
public class QuestionService {

    private final QuestionRepository questionRepository;

    public QuestionService(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }
}
