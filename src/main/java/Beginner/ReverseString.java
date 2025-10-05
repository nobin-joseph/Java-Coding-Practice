package Beginner;

public class ReverseString {

    public void reverse (){
        String input = "nobin joseph";
        String result ="";
        char [] charArray = input.toCharArray();

        for(int i=charArray.length-1; i>=0;i--){

            result=result+charArray[i];
        }
        System.out.println(result);

        // using string Builder
        StringBuilder str = new StringBuilder(input);
        str.reverse();

        str.reverse();

    }
}
