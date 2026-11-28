module com.pomodoro {
    requires transitive javafx.controls;
    requires javafx.fxml;

    opens com.pomodoro to javafx.fxml;
    exports com.pomodoro;
}
