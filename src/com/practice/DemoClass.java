package com.practice;

import java.util.Locale;

public class DemoClass {

    public static String convertToTitleCase2(String input) {
        StringBuilder builder = new StringBuilder();

        for (String word : input.split("\\s")) {
            if (word.length() < 4) {
                builder.append(word.toLowerCase());
            } else {
                builder.append(word.substring(0, 1).toUpperCase());
                builder.append(word.substring(1).toLowerCase());
            }
            builder.append(" ");
        }
        return builder.toString();
    }
}
