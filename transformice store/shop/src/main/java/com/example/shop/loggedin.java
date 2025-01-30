package com.example.shop;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class loggedin extends Application {
    private FXMLLoader fxmlLoader;
    @FXML
    private Label button_login;


    @Override
    public void start(Stage stage) throws Exception {
        // Load the login FXML file
        Parent root = FXMLLoader.load(getClass().getResource("logged-in.fxml"));
        // Initialize the fxmlLoader with the location of the home FXML file


        Scene scene = new Scene(root, 800, 800);

        stage.setTitle("FXML Welcome");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}


