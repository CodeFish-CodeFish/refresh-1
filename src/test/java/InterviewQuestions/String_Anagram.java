package InterviewQuestions;

import java.util.Arrays;

public class String_Anagram {
    public static boolean same(String a, String b){//acb cab
        char[] ch1=a.toCharArray();//[a,c,b]
        char[] ch2=b.toCharArray();//[c,a,b]

        Arrays.sort(ch1);//[a,b,c]
        Arrays.sort(ch2);//[a,b,c]
        String a1="",a2="";
        for (char each:ch1){
            a1+=each;//"abc"
        }
        for (char each:ch2){
            a2+=each;//"abc"
        }

        return a1.equals(a2);// "abc" -> "abc"
    }

    public static void main(String[] args) {
        String a="brush",b="shrub";
        System.out.println(same(a,b));
    }

}
