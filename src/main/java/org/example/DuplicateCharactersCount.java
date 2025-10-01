package org.example;

import java.util.Locale;

public class DuplicateCharactersCount {

    /**
     * Problem Statement:
     * Write a Java program to find all characters that appear more than once in a given string and print each character along with its count.
     */
    public void counter() {

        String input = "java programming";
        String workingString = input.replaceAll(" ", "");
        System.out.println(workingString);
        workingString = workingString.toLowerCase(Locale.ROOT);

        char[] charArray = workingString.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            int count = 1;
            for (int j = i + 1; j < charArray.length; j++) {

                if (charArray[i] == charArray[j]) {

                    count = count + 1;
                }
            }
            if (count >= 2) {
                System.out.println(charArray[i] + " --- " + count);
            }

        }


    }


}
