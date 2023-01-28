package InterviewQuestions;

import java.util.Scanner;

public class Number_SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n=scanner.nextInt();
        int sumOfDigits=0;
        String str=""+n;
        String[] nstr=str.split("");
        for(String i:nstr){
            sumOfDigits+=Integer.parseInt(i);
        }
        System.out.println(sumOfDigits);
    }
}
