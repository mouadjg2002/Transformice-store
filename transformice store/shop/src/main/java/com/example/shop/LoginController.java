package com.example.shop;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class LoginController {
    // FXMLLoader instance variable
    private FXMLLoader fxmlLoader;

    @FXML

    private void handleLoginButtonAction(ActionEvent event) throws IOException {
        // Load the home FXML file
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);

        // Get the stage from the event source
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        // Set the scene to the stage
        stage.setScene(scene);
    }

    public void initialize() {
        // Initialize the fxmlLoader with the location of the home FXML file
        fxmlLoader = new FXMLLoader(getClass().getResource("logged-in.fxml"));
    }
}




