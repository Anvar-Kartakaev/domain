package org.skypro.examinerservice.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.skypro.examinerservice.domain.Question;

import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

class ExaminerServiceImplTest {
    ExaminerServiceImpl examinerService;

    @Test
    void whenGetQuestionsIsNull_ThenExaminerServiceImplReturnsResults() {
        int amount = 0;
        Assertions.assertThrows(IllegalArgumentException.class, () -> examinerService.getQuestions(amount));
    }

    @Test
    void whenAddWitchQuestionAndAnswerIsEmpty_ThenExaminerServiceImplReturnsResults() {
        String question = "";
        String answer = "";
        Assertions.assertThrows(IllegalArgumentException.class, () -> examinerService.add(question, answer));
    }

    @Test
    void whenAddWitchQuestionIsNull_ThenExaminerServiceImplReturnsResults() {
        Question question = null;
        Assertions.assertThrows(IllegalArgumentException.class, () -> examinerService.add(question));
    }

    @Test
    void whenRemoveWitchQuestionIsNull_ThenExaminerServiceImplReturnsResults() {
        Question question = null;
        Assertions.assertThrows(IllegalArgumentException.class, () -> examinerService.remove(question));
    }

    @Test
    void whenGetAllIsNull_ThenExaminerServiceImplReturnsResults() {
        Collection<Question> questions = null;
        Assertions.assertThrows(IllegalArgumentException.class, () -> examinerService.getAll());
    }

    @Test
    void whenGetRandomQuestionIsNull_ThenExaminerServiceImplReturnsResults() {
        // Не реализовал метод, поэтому и не пойму что тестить
    }
}