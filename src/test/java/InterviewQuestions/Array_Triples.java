package InterviewQuestions;

import java.util.Arrays;

public class Array_Triples {
    /*
Given an array of ints, we'll say that a triple is a value appearing 3 times in a row in the array. Return true if the array does not contain any triples.
     {2,3,1,1,1,5}
     */

    public static boolean noTriples(int[] numbers){
        for (int i=0;i<numbers.length;i++){
            if(numbers[i]==numbers[i+1] && numbers[i]==numbers[i+2]){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        int [] arr={2,3,1,1,1};
        System.out.println(noTriples(arr));
    }
}
