package com.example.textprocessingtool.regex;

//Backend logic
//Provides helper methods for handling and validating regex patterns, reusability of common tasks

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexUtils {

    // Method to find positions of matches (SEARCH)
    public static List<Integer> searchForPattern(String regex, String inputText) {
        List<Integer> matchPositions = new ArrayList<>();
        Pattern pattern = Pattern.compile(regex); //compiles the regular expression to Pattern object
        Matcher matcher = pattern.matcher(inputText);

        //Finds the next occurence of the pattern in input text, returns true if match is found
        while (matcher.find()) {
            matchPositions.add(matcher.start() + 1); // Returns the starting index of each match
        }

        return matchPositions; // Return list of all match positions in input
    }

    // Method to check if text fully matches a pattern (MATCH)
    public static boolean matchText(String regex, String inputText) {
        Pattern pattern = Pattern.compile(regex);
        return pattern.matcher(inputText).matches(); // Returns true if the entire text matches
    }

    // Method to replace text based on regex pattern (REPLACE)
    public static String replaceText(String regex, String replacement, String inputText) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(inputText);

        // Replace all occurrences of the regex pattern
        return matcher.replaceAll(replacement);
    }
}
