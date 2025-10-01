package org.example;

import java.util.Arrays;

/**
 * Problem Statement:
 * Given a sentence, rearrange its words in ascending order of their length.
 * If two words have the same length, maintain their original order.
 */
public class RearrangeWordsByLength {

    public void arrangeWords() {
        String input = "Java is super cool";
        String[] split = input.split(" ");
        System.out.println(Arrays.toString(split));
        String temp;
        for (int i = 0; i < split.length; i++) {
            for (int j = i + 1; j < split.length; j++) {

                if (split[i].length() > split[j].length()) {
                    temp = split[i];
                    split[i] = split[j];
                    split[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(split));
        String result="";
        for (String n :split){
            result = result + " " +n;
        }
        System.out.println(result);
    }
}
