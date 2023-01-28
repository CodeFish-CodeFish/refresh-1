package Day1;

public class Datatypes {

    public static void main(String[] args) {
//datatype variableName = variableValue;
        byte b = 12;
        short sh = 189;
        int in = 343234;
        long l = 389483473478L;
        double d = 1.55;
        float f = 15.78f;
        char ch = 'a';
        boolean boo = true;


        // +
        int num1 = 100;
        int num2 = 355;
        System.out.println(num1 + num2); //455

        // -
        System.out.println(num2 - num1); // 255

        // *
        System.out.println(num1 * num2); //35500

        // /
        System.out.println(num1 / num1); //1

        // %
        int num3 = 12;
        int num4 = 10;
        System.out.println(num3 % num4); //2


        //+=
        num3 += num4; // num3 = num3 + num4; => 22
        System.out.println("+= result for num3 is " + num3);


        int num5 = 25;
        int num6 = 5;
        num5 -= num6; // num5 = num5 - num6; => 20
        System.out.println("-= result for num5 is " + num5);

        int num7 = 5;
        int num8 = 2;
        num7 *= num8; // num7 = num7 * num8; => 10
        System.out.println("*= result for num7 is " + num7);


        int num9 = 25;
        int num10 = 5;
        num9 /= num10; // num9 = num9 / num10; => 5
        System.out.println("/= result for num9 is " + num9);


        int i = 100;
        int y = 99;
        boolean result = i == y;
        System.out.println("100 equals to 99 -> " + result);

        boolean result2 = i != y;
        System.out.println("100 is NOT equal to 99 -> " + result2);

        boolean result3 = i > y;
        System.out.println("100 is greater than 99 -> " + result3);

        boolean result4 = i < y;
        System.out.println("100 is less than 99 -> " + result4);

        int number = 60;
        int number2 = 60;
        boolean res = number >= number2;  // => true
        System.out.println("60 is greater than or equal to 60 => " + res);
        boolean res2 = number > number2; // => false
        System.out.println("60 is greater than 60 => " + res2);

        int number3 = 100;
        number3++;  // number3 = number3 + 1;
        System.out.println("++(increment) for 100 is: " + number3);

        int number4 = 1000;
        number4--; // number4 = number4 - 1; => 999
        System.out.println("--(decrement) for 1000 is: " + number4);


        int inc = 100;
        //post-increment
        System.out.println(inc++); // 1. First print out
                                    // 2. Second change the value
        System.out.println(inc); //101

        //pre-increment
        int preInc = 9;
        System.out.println(++preInc); // 10



    }


}
