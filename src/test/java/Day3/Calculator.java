package Day3;

public class Calculator {

    public Calculator(){

    }
    public Calculator(int i){

    }
    public Calculator(String name){

    }
    public Calculator(String name, int n){

    }
    public Calculator(int n, String name){

    }

    public int add(String name) {
        return name.length();
    }

    public int add(int num1, int num2) {
        int result = num1 + num2;
        add();
        return result;
    }

    public int add(int num1, int num2, int num3) {
        int result = num1 + num2;
        return result;
    }
    public int add(int num, String n) {

        return 0;
    }

    public int add(String n, int num) {

        return 0;
    }

    public int add(int num) {

        return 0;
    }

    public int add() {

        return 0;
    }

    public int divideBy2(int number) {
        int res = number / 2;
        return res;
    }

    public int getAverage(int[] nums) {
        // sum of numbers divided by length
        // 2, 3, 5 = (2 + 3 + 5)/3
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
        }
        int avg = total / nums.length;
        return avg;
    }


}


