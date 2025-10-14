package Beginner;


import java.util.Arrays;

public class ReverseString {

    public void reverse (){
        String input = "Nobin joseph";
        char [] charArray = input.toCharArray() ;


        StringBuilder result =new StringBuilder();

        for(int i=charArray.length-1; i>=0;i--){

            result.append(charArray[i]  );
        }
        System.out.println(result);

        // using string Builder
        StringBuilder str = new StringBuilder(input);
        System.out.println(str.reverse());


    }

    void reverseWithoutBuilder(){
        String s = "nobin Joseph";

        String result = "";

        String[] stingArray =s.split(" ");
        System.out.println(Arrays.toString(stingArray));

        for(String n : stingArray ){

            char[] charArray = n.toCharArray();

            for(int i =n.length()-1;i>=0;i--){

                result = result + charArray[i];

            }
            result = result + " ";
        }

        System.out.println(result);

    }
}
