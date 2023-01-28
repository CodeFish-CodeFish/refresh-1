package InterviewQuestions;

import java.util.Arrays;

public class Array_MoveAllZerosToTheEnd {

    /*
    Write a function that can move all zeros in array to the end
    Input: {1,0,34,0,453,0}

    output:
    {1,34,453,0,0,0}
     */

    public static int[] moveAllZerosToTheEnd(int[] arr){
        int[] result=new int[arr.length];//0
        int count=0;

        for(int each:arr){
            if(each!=0){
                result[count++]=each;//count[0]=1,count[1]=34,count[2]=453,
            }
        }
        return result;
    }


    public static void main(String[] args) {
        int[] arr={1,0,34,0,453,0};
        System.out.println(Arrays.toString(moveAllZerosToTheEnd(arr)));
    }
}
