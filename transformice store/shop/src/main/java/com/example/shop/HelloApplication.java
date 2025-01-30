package com.example.shop;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    private FXMLLoader fxmlLoader;
    @FXML
    private Label button_login;


    @Override
    public void start(Stage stage) throws Exception {
        // Load the login FXML file
        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
        // Initialize the fxmlLoader with the location of the home FXML file
        fxmlLoader = new FXMLLoader(getClass().getResource("logged-in.fxml"));

        Scene scene = new Scene(root, 600, 400);

        stage.setTitle("FXML Welcome");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}


