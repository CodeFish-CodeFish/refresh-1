package InterviewQuestions;

import java.util.Arrays;

public class Array_FibonacciNumbers {
    /*
    Write a function to print sequence of Fibonacci

    input: 5     10

    output:
    0,1,1,2,3    0,1,1,2,3,5,8,13,21,34
     */

    public static void main(String[] args) {
        int n=10;
        int[] fibonacci=new int[n];
        fibonacci[0]=0;
        fibonacci[1]=1;
        for (int i=2;i<n;i++){
            fibonacci[i]=fibonacci[i-1]+fibonacci[i-2];
        }

        System.out.println(Arrays.toString(fibonacci));
    }
}
