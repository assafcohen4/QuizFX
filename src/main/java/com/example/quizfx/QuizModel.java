package com.example.quizfx;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class QuizModel {

    public Integer currentQuestion = 1;

    public QuizModel() throws IOException {
    }

    public boolean isAnswerCorrect(int questionNumber, String answerLetter){
        return  questionNumber == 1 && answerLetter.equals("B") ||
                questionNumber == 2 && answerLetter.equals("A") ||
                questionNumber == 3 && answerLetter.equals("A") ||
                questionNumber == 4 && answerLetter.equals("C");
    }

    public List<String> getNextQuestion() throws IOException {
        List<String> lines = Files.lines(Path.of("C:\\Users\\assaf\\IdeaProjects\\QuizFX\\src\\main\\resources\\com\\example\\quizfx\\exam.txt"))
                .collect(toList())
                .stream()
                .filter(line -> line.contains(currentQuestion.toString())).collect(toList());

        return lines;
    }
}
