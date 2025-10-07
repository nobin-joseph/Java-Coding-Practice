package Beginner;


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
}
