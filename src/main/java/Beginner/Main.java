package Beginner;

import java.util.*;

class Main {


    public static void main(String[] args) {

        String input = "My name is nobin joseph";

        List<String> word = new ArrayList<>(Arrays.asList(input.split(" ")));

        System.out.println(word.reversed());

        ArrayList<String> wordsList =new ArrayList<>(Arrays.asList(input.split(" ")));

        wordsList.sort(Comparator.naturalOrder());

        System.out.println();



    }
}


