package Beginner;

/**
 * Java program to count vowels and consonants in a string
 */
public class Vowels {

    public void countVowels (){

        String input = "my Name is Nobin";
        char[] vowels = {'A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'};
        input = input.replaceAll(" ", "");
        char[] charArray = input.toCharArray();

        int vowelsCount = 0;
        int ConsonantsCount = 0;

        for (char a : vowels) {
            boolean flagVowels = false;
            for (char b : charArray) {

                if (a == b) {
                    vowelsCount = vowelsCount + 1;
                    flagVowels = true;
                }
            }
            if(!flagVowels){
                ConsonantsCount=ConsonantsCount+1;
            }
        }

        System.out.println("Consonants Count  =" + ConsonantsCount);
        System.out.println("vowels Count  =" + vowelsCount);

    }
}
