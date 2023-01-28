package Day3;

public class CalculatorUser {


    public static void main(String[] args) {
        Calculator calc = new Calculator(34, "dkfj");

        int value1 = 25;
        int value2 = 12;
        int output = calc.add(value1, value2);
        System.out.println("sum of " + value1 + " and " + value2 + " is " + output);


        int divideBy2Result = calc.divideBy2(144);
        System.out.println("Result of divide by 2 method: " + divideBy2Result);

        int[] intArray = {2, 2, 2, 2, 2};
        int getAvgResult = calc.getAverage(intArray);
        System.out.println("int array elements average is " + getAvgResult);

    }


}
