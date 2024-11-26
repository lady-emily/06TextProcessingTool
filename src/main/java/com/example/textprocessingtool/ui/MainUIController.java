package com.example.textprocessingtool.ui;

import com.example.textprocessingtool.regex.RegexUtils;
import com.example.textprocessingtool.ui.AlertUtils;
import com.example.textprocessingtool.utils.DataUtils;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class MainUIController {

    @FXML
    private TextArea inputTextArea;

    @FXML
    private TextField regexPatternField;

    @FXML
    private TextField replacementField;

    @FXML
    private Label outputLabel;

    @FXML
    private TextField collectionInputField;

    @FXML
    private ListView<String> collectionListView;

    // Regex Operations
    public void searchForPattern() {
        String inputText = inputTextArea.getText();
        String regex = regexPatternField.getText();

        if (regex.isEmpty() || inputText.isEmpty()) {
            AlertUtils.showError("Both text and regex pattern must be provided.");
            return;
        }

        try {
            List<Integer> matchPositions = RegexUtils.searchForPattern(regex, inputText);
            outputLabel.setText("Match positions: " + matchPositions.toString());
        } catch (Exception e) {
            AlertUtils.showError("Invalid regex pattern.");
        }
    }

    public void replaceText() {
        String inputText = inputTextArea.getText();
        String regex = regexPatternField.getText();
        String replacement = replacementField.getText();

        if (regex.isEmpty() || inputText.isEmpty() || replacement.isEmpty()) {
            AlertUtils.showError("Text, regex pattern, and replacement must all be provided.");
            return;
        }

        try {
            String updatedText = RegexUtils.replaceText(regex, replacement, inputText);
            inputTextArea.setText(updatedText);
            outputLabel.setText("Text replaced successfully.");
        } catch (Exception e) {
            AlertUtils.showError("Invalid regex pattern.");
        }
    }

    public void matchText() {
        String inputText = inputTextArea.getText();
        String regex = regexPatternField.getText();

        if (regex.isEmpty() || inputText.isEmpty()) {
            AlertUtils.showError("Both text and regex pattern must be provided.");
            return;
        }

        boolean isMatch = RegexUtils.matchText(regex, inputText);
        outputLabel.setText("Text matches pattern: " + isMatch);
    }

    // File Operations
    @FXML
    private void handleSave() {
        // Code remains the same
    }

    @FXML
    private void handleOpen() {
        // Code remains the same
    }

    // Collection Manipulation
    public void addCollectionEntry() {
        // Code remains the same, with improved validation
    }

    public void updateCollectionEntry() {
        // Code remains the same
    }

    public void deleteCollectionEntry() {
        // Code remains the same
    }

    private void refreshCollectionList() {
        // Code remains the same, with error handling
    }
}
