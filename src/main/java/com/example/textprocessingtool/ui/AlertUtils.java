package com.example.textprocessingtool.ui;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;

import java.util.Optional;

public class AlertUtils {

    /**
     * Displays an error alert with the given message.
     *
     * @param message the error message to show.
     */
    public static void showError(String message) {
        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    /**
     * Displays an information alert with the given message.
     *
     * @param title   the title of the information dialog.
     * @param message the information message to show.
     */
    public static void showInfo(String title, String message) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    /**
     * Displays a warning alert with the given message.
     *
     * @param message the warning message to show.
     */
    public static void showWarning(String message) {
        Alert alert = new Alert(AlertType.WARNING);
        alert.setTitle("Warning");
        alert.setHeaderText("Warning");
        alert.setContentText(message);
        alert.showAndWait();
    }

    /**
     * Displays a confirmation alert and returns the user's choice.
     *
     * @param message the confirmation message to show.
     * @return true if the user confirms, false otherwise.
     */
    public static boolean showConfirmation(String message) {
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setTitle("Confirmation");
        alert.setHeaderText(null);
        alert.setContentText(message);

        Optional<ButtonType> result = alert.showAndWait();
        return result.isPresent() && result.get() == ButtonType.OK;
    }

    public static void showRegexError(String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Regex Error");
        alert.setContentText(message);
        alert.showAndWait();
    }

}
