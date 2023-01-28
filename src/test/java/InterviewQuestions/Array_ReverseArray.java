package InterviewQuestions;

import java.util.Arrays;

public class Array_ReverseArray {
    /*
write a function that can reverse an array
 */
///SOLUTION 1
    public static int[] reverse(int[] array){
        int[] result =new int[array.length];
        for (int i=array.length-1,j=0;i>=0;i--,j++){
            result[j]=array[i];//result[0]=array[4]
        }//
        // { , , , , } {1,2,3,4,}-->5
        //  0 1 2 3 4       5    4

        return result;
    }
///SOLUTAION 2
    public static int[] reverseArray(int[] numbers){
        int[] reverse = new int[numbers.length];
        for(int i= numbers.length-1;i>=0;i--){
            reverse[(numbers.length-1)-i]= numbers[i];
        }
        return reverse;
    }


    public static void main(String[] args) {
        int[] array={1,2,3,4,5};
        System.out.println(Arrays.toString(reverseArray(array)));
        System.out.println(Arrays.toString(reverse(array)));
    }
}
