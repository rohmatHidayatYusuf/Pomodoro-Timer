package com.pomodoro;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        Group root = new Group();
        Scene scene = new Scene(root);

        Image icon = new Image(
            getClass().getResourceAsStream("/images/icon_pomodoro_timer.png")
        );
        stage.getIcons().add(icon);

        stage.setTitle("Pomodoro Timer");

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}