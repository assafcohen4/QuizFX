module com.example.quizfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.quizfx to javafx.fxml;
    exports com.example.quizfx;
}