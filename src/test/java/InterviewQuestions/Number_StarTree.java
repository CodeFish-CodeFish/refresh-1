package InterviewQuestions;

import java.util.Scanner;

public class Number_StarTree {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String star="*";
        int n=scanner.nextInt();
        int a=n;
        String spaces="";
        for(int i=0;i<n;i++){
            spaces+=" ";
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<1;j++){
                System.out.print(spaces.substring(0,a));
                a--;
            }
            System.out.println(star);
            star+="**";
        }
        a=n;
        for (int i=0;i<n/3;i++){
            System.out.print(spaces.substring(0,a-1));
            System.out.println("| |");
        }
    }
    /*
    5
     *
    ***
   *****
  *******
 *********
    | |
     */
}
