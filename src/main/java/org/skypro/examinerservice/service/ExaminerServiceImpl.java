package org.skypro.examinerservice.service;

import org.skypro.examinerservice.domain.Question;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashSet;
import java.util.Random;

@Service
public class ExaminerServiceImpl implements QuestionService {
    private final Random random;
    private final QuestionService questionService;

    public ExaminerServiceImpl(QuestionService questionService) {
        this.questionService = questionService;
        this.random = new Random();
    }

    public Collection<Question> getQuestions(int amount) {
        Collection<Question> result = new HashSet<>();
        return result;
        // Создайте коллекцию и заполните ее случайными вопросами с помощью getRandomQuestion.
        // Не понимаю как реализовать, проблема тянется еще с реализации метода где надо вернуть случайное число
    }

    @Override
    public Question add(String question, String answer) {
        return questionService.add(question, answer);
    }

    @Override
    public Question add(Question question) {
        return questionService.add(question);
    }

    @Override
    public Question remove(Question question) {
        return questionService.remove(question);
    }

    @Override
    public Collection<Question> getAll() {
        return questionService.getAll();
    }

    @Override
    public Question getRandomQuestion() {
        return questionService.getRandomQuestion();
    }


}
