package Beginner;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String input = "nobin joseph";
        String Res="";

        String [] s1= input.split(" ");
        System.out.println(Arrays.toString(s1));

        for(int i=0;i<s1.length;i++ ){

            String s2 = s1[i];

            StringBuilder s3 = new StringBuilder(s2);
             Res = Res +s3.reverse()+" ";
        }

            System.out.println(Res);
        System.out.println(Res);
        System.out.println(Res);
        System.out.println(Res);





    }
}