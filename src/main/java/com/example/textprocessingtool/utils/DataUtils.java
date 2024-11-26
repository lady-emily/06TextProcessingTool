package com.example.textprocessingtool.utils;

import java.util.ArrayList;
import java.util.List;

public class DataUtils {

    // Collection to hold data (example using ArrayList)
    private static final List<String> dataCollection = new ArrayList<>();

    // Create: Add new entry to the collection
    public static void addEntry(String entry) {
        dataCollection.add(entry);
    }

    // Update: Modify an existing entry
    public static boolean updateEntry(int index, String newEntry) {
        if (index >= 0 && index < dataCollection.size()) {
            dataCollection.set(index, newEntry);
            return true;
        }
        return false; // Return false if index is out of bounds
    }

    // Delete: Remove entry by index
    public static boolean deleteEntry(int index) {
        if (index >= 0 && index < dataCollection.size()) {
            dataCollection.remove(index);
            return true;
        }
        return false; // Return false if index is out of bounds
    }

    //Get all entries
    public static List<String> getAllEntries() {
        return new ArrayList<>(dataCollection);
    }
}
