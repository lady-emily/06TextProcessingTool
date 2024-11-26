package com.example.textprocessingtool.ui;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

//Entry point for UI, extends javafx.application.Application and set up primary stage
//Load main FXML files, initialise and display stage
//Handle global application configurations or settings

public class MainUI extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {
            // Load the FXML layout
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/textprocessingtool/MainUI.fxml"));
            Parent root = loader.load();

            // Set up the scene
            Scene scene = new Scene(root);

            // Configure the primary stage
            primaryStage.setTitle("Text Processor Tool");
            primaryStage.setScene(scene);
            primaryStage.setMinWidth(800); // Optional: set minimum width
            primaryStage.setMinHeight(600); // Optional: set minimum height
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
            AlertUtils.showError("Failed to load the application. Please try again.");
        }
    }

    public static void main(String[] args) {
        launch(args); // Launch the JavaFX application
    }
}

