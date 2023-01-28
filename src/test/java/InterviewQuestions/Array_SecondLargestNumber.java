package InterviewQuestions;

import java.util.Arrays;

public class Array_SecondLargestNumber {
    /*
    3. Write a function to find second largest number in array
     */

    public static int secondLargestNumber(int[] arr){
        int max1=Integer.MIN_VALUE;//-2,147,483,648
        int max2=Integer.MIN_VALUE;

        for (int num:arr){
            if(num>max1){
                max2=max1;
                max1=num;
            } else if (num>max2) {
                max2=num;
            }


        }
        return max2;
    }




    public static void main(String[] args) {
        int[] numbers={91,1,2,4,56,76,32,89};
        System.out.println(secondLargestNumber(numbers));
    }

}
