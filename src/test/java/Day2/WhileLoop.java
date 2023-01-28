package Day2;

import javax.sound.midi.SysexMessage;

public class WhileLoop {


    public static void main(String[] args) {
        int number = 1;
        while (number < 10) {
            if (number % 2 != 0) {
                System.out.println("number: " + number);
            }
            number++;
        }

        String word = "Participation";
        int index = 0;
        // 0 < 13
        while (index < word.length()) {
//            System.out.println(word.charAt(index));
            index++;
        }


        int charIndex = 0;
        while (charIndex < word.length()){
            char ch = word.toLowerCase().charAt(charIndex);
            if (ch == 'a' || ch == 'e' || ch == 'o' || ch=='u'
            || ch == 'i') {
                System.out.println(ch);
            }
            charIndex++;

            //alternative solution
            String vowels = "aeiou";

        }




    }


}
