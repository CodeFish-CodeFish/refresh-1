package Day3;

import java.util.Random;

public class ArrayIntro3 {

    public static void main(String[] args){

        String[] cars =
                {"Mazda", "Toyota", "Honda", "BMW", "Volvo", "Tesla"};

        for (String car : cars){
            if (car.equals("Tesla")){
                System.out.println("buy");
            }
        }

        Random random = new Random();
        System.out.println("Today I'm driving: ");
        int index = random.nextInt(6);
        System.out.println(cars[index]);
    }






}
