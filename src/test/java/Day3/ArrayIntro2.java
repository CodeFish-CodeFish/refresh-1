package Day3;

import java.util.Random;

public class ArrayIntro2 {

    public static void main(String[] args) {
        int[] numbers = new int[5];

        Random randomGenerator = new Random();
        for (int i = 0; i < numbers.length; i++) {
            int tempNumber = randomGenerator.nextInt(20);
            numbers[i] = tempNumber;
        }

        for (int num : numbers) {
            System.out.println(num);
        }


    }


}
