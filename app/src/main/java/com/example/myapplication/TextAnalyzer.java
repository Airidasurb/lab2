package com.example.myapplication;

public class TextAnalyzer {

    public int countWords(String input) {
        if (input == null || input.trim().isEmpty()) {
            return 0;
        }
        String[] words = input.trim().split("\\s+");
        return words.length;
    }

    public int countCharacters(String input) {
        if (input == null) {
            return 0;
        }
        // Pašalinam tik tarpus, viską kitką skaičiuojam
        return input.replace(" ", "").length();
    }
}
