package org.skypro.examinerservice.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.skypro.examinerservice.domain.Question;

import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

class JavaQuestionServiceTest {
    @Mock
    JavaQuestionService service;

    @Test
    void whenAddWitchQuestionAndAnswerIsEmpty_ThenJavaServiceReturnsResults() {
        String question = "";
        String answer = "";
        Assertions.assertThrows(IllegalArgumentException.class, () -> service.add(question, answer));
    }

    @Test
    void whenAddWitchQuestionIsNull_ThenJavaServiceReturnsResults() {
        Question question = null;
        Assertions.assertThrows(IllegalArgumentException.class, () -> service.add(question));
    }

    @Test
    void whenRemoveWitchQuestionIsNull_ThenJavaServiceReturnsResults() {
        Question question = null;
        Assertions.assertThrows(IllegalArgumentException.class, () -> service.remove(question));
    }

    @Test
    void whenGetAllIsNull_ThenJavaServiceReturnsResults() {
        Collection<Question> questions = null;
        Assertions.assertThrows(IllegalArgumentException.class, () -> service.getAll());
    }

    @Test
    void whenGetRandomQuestionIsNull_ThenJavaServiceReturnsResults() {
        // Не реализовал метод, поэтому и не пойму что тестить
    }
}