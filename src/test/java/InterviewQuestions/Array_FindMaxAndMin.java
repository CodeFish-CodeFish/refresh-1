package InterviewQuestions;

public class Array_FindMaxAndMin {
    /*
    Write a function to print largest and smallest number in array

    input: {234,432,65,87,9}

    Output:
    Max=432
    Min=9
     */

    public static void main(String[] args) {
        int[] arr={234,432,65,87,9};

        int min=arr[0];
        int max=arr[0];

        for (int each:arr){
            if(each<min){
                min=each;
            } else if (each>max) {
                max=each;

            }
        }

        System.out.println(min+" "+max);







    }


}
