package Day2;

import javax.sound.midi.SysexMessage;

public class IfCondition {

    public static void main(String[] args) {
        int number = 1333;
        // even number a number which can be divided by 2 with no remainder
        // odd number a number which cannot be divided by 2 without remainder
        if (number % 2 == 0) {
            System.out.println(number + " is even number");
        }

        if (number % 2 != 0) {
            System.out.println(number + " is odd number");
        }

        if (number > 0) {
            System.out.println(number + " is positive number");
        }


        int num = 16;
        if (num % 2 != 0) {
            System.out.println("This number is odd");
        } else {
            System.out.println("This number is even");
        }


        int num1 = 19;
        if (num1 > 15) {
            System.out.println("Great");
        } else if (num1 > 5) {
            System.out.println("Good");
        } else if (false) {

        } else if (false) {

        } else {
            System.out.println("Average");
        }

        String password = "hello world";
        if (password.length() < 8) {
            System.out.println("Invalid password. Password length must be more than 8 characters");
        } else {
            System.out.println("Password is long enough");
        }


        //check if password contains both lowercase and uppercase characters

        //password=Hello
        //password.toLowerCase() => hello


        password = "HELLO";
        if (password.toLowerCase().equals(password) || password.toUpperCase().equals(password)) {
            System.out.println("Invalid password. Password must contain both lowercase and uppercase letters");
        } else {
            System.out.println("Valid password");
        }


        int y = 99;
        int x = 199;
        //determine max integer

        if (y > x) {
            System.out.println(y + " is larger than " + x);
        } else if (x > y) {
            System.out.println(x + " is larger than " + y);
        } else {
            System.out.println(x + " and " + y + " equal");
        }


    }


}
