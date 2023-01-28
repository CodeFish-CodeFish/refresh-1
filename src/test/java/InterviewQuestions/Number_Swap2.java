package InterviewQuestions;

public class Number_Swap2 {
    public static void main(String[] args) {
        int a=9,b=4;
        a=a+b;//9+4=13
        b=a-b;//13-4=9
        a=a-b;//13-9=4

        System.out.println(a+" "+b);

        String str="Techtorial",str2="CodeFish";
        int strLength=str.length();
        str=str.concat(str2);
        str2=str.substring(0,strLength);
        str=str.substring(strLength);

        System.out.println(str+" "+str2);
    }

}
