package com.example.textprocessingtool.ui;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;

import java.io.IOException;

// Entry point for the Text Processor Tool application
public class MainUI extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {
            // Load the main FXML layout
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/textprocessingtool/MainUI.fxml"));
            Parent root = loader.load();

            // Create the scene and apply optional CSS styling
            Scene scene = new Scene(root);
            scene.getStylesheets().add(getClass().getResource("/com/example/textprocessingtool/styles/main.css").toExternalForm());

            // Configure the primary stage
            primaryStage.setTitle("Text Processor Tool");
            primaryStage.setScene(scene);
            primaryStage.setMinWidth(800); // Set minimum width
            primaryStage.setMinHeight(600); // Set minimum height
            primaryStage.show();
        } catch (IOException e) {
            // Log the error (if a logging mechanism exists)
            e.printStackTrace();
            showCriticalError("Application Error", "Failed to load the application layout. Please contact support.");
        } catch (Exception e) {
            e.printStackTrace();
            showCriticalError("Unexpected Error", "An unexpected error occurred. Please try restarting the application.");
        }
    }

    /**
     * Launch the JavaFX application.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    /**
     * Displays a critical error alert to the user.
     *
     * @param title the title of the alert
     * @param message the message to display in the alert
     */
    private void showCriticalError(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
        System.exit(1); // Exit the application after showing the error
    }
}


