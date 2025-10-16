package Beginner;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Main {


    public static void main(String[] args) {

        String input = "My name is nobin joseph";

        List<String> word = new ArrayList<>();

        word.addAll(Arrays.asList(input.split(" ")));

        System.out.println(word.reversed());

        ArrayList<String> wordsList =new ArrayList<>();

        wordsList.addAll(Arrays.asList(input.split(" ")));

        Collections.sort(wordsList,Collections.reverseOrder());

        System.out.println();



    }
}


