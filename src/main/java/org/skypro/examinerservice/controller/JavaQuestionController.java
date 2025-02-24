package org.skypro.examinerservice.controller;

import org.skypro.examinerservice.domain.Question;
import org.skypro.examinerservice.service.QuestionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/exam/java")
public class JavaQuestionController {
    QuestionService service;

    @GetMapping
    public Collection<Question> getQuestions() {
        return service.getAll();
    }

    @GetMapping("/exam/java/add")
    public Question addQuestion(@RequestParam String question, String answer) {
        return new Question(question, answer);
    }

    @GetMapping("/exam/java/remove")
    public Question removeQuestion(@RequestParam String question, String answer) {
        return (Question) service.getAll().stream()
                .filter(service -> getQuestions().removeIf(q -> q.getQuestion().equalsIgnoreCase(question) && q.getAnswer().equalsIgnoreCase(answer)))
                .collect(Collectors.toSet());
    }

}
