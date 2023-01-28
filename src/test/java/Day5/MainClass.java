package Day5;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

    public static List<String> list = new ArrayList<>();

    public String greeting = "Hello";
    static {
       System.out.println("Hello from static block");
       list.add("table");
       list.add("chair");
       list.add("sofa");
    }

    {
        System.out.println("Hello from instance block");
    }



    public static void main(String[]args){
        MainClass mainClass1 = new MainClass();
        System.out.println("Created object 1");
        MainClass mainClass2 = new MainClass();
        System.out.println("Created object 2");

        System.out.println(list);
    }



}
