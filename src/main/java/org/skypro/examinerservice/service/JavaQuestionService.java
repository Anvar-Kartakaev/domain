package org.skypro.examinerservice.service;

import org.skypro.examinerservice.domain.Question;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

@Service
public class JavaQuestionService implements QuestionService {
    private Set<Question> questions;

    public JavaQuestionService() {
        questions = new HashSet<>();
    }

    @Override
    public Question add(String question, String answer) {
        Question result = new Question(question, answer);
        questions.add(result);
        return result;
    }

    @Override
    public Question add(Question question) {
        questions.add(question);
        return question;
    }

    @Override
    public Question remove(Question question) {
        questions.remove(question);
        return question;
    }

    @Override
    public Collection<Question> getAll() {
        return questions;
    }

    public Question getRandomQuestion() {
        Random random = new Random();
        return random.nextInt(Integer.MAX_VALUE);
        // Реализуйте метод getRandomQuestion с помощью класса Random. Он должен возвращать случайное число от нуля до максимального
        // Как возвращать случайно число если надо вернуть Question ?
    }

}
