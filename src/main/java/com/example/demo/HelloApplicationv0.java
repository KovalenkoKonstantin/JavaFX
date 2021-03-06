package com.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class HelloApplicationv0 extends Application {
    @Override
    public void start(Stage stage) throws IOException {
/*        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.
                getResource("scene1.fxml"));*/
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("scene1.fxml")));
        Scene scene = new Scene(root);
        Image icon = new Image("3.png");
        stage.getIcons().add(icon);
        stage.setTitle("Hello!");
        stage.getIcons();
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}