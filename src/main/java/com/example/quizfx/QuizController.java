package com.example.quizfx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;


import static java.lang.System.*;

public class QuizController {

    @FXML
    private Button answerA;

    @FXML
    private Button answerB;

    @FXML
    private Button answerC;

    @FXML
    private Button answerD;

    @FXML
    private Label questionLabel;

    @FXML
    private Label rightOrWrongLabel;

    @FXML
    private Button startQuiz;

    public QuizController() throws IOException {
        List<String> nq = qm.getNextQuestion();

    }

    QuizModel qm = new QuizModel();
    @FXML
    void onClickAnswer(ActionEvent event) {
        if(event.getSource()== answerA) {
            boolean isCorrect = qm.isAnswerCorrect(qm.currentQuestion, "A");
        }
        if(event.getSource()== answerB) qm.isAnswerCorrect(qm.currentQuestion,"B");
        if(event.getSource()== answerC) qm.isAnswerCorrect(qm.currentQuestion,"C");
        if(event.getSource()== answerD) qm.isAnswerCorrect(qm.currentQuestion,"D");
        qm.currentQuestion++;

    }

    @FXML
    void onClickNextQuestion(ActionEvent event){
        out.println("hiy");
    }

}
