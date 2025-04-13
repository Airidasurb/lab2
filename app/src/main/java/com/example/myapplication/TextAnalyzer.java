package com.example.myapplication;

public class TextAnalyzer {

    public static int countWords(String input) {
        if (input == null || input.trim().isEmpty()) {
            return 0;
        }
        String[] words = input.trim().split("\\s+");
        return words.length;
    }

    public static int countCharacters(String input) {
        if (input == null) {
            return 0;
        }
        return input.replace(" ", "").length();
    }
}
