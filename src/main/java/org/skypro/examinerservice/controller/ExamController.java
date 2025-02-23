package org.skypro.examinerservice.controller;

import org.skypro.examinerservice.domain.Question;
import org.skypro.examinerservice.service.ExaminerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class ExamController {
    ExaminerService examinerService;

    @GetMapping("/exam/get/{amount}")
    public Collection<Question> getQuestions(@PathVariable("amount")int amount) {
        return examinerService.getQuestions(amount);
    }

}
