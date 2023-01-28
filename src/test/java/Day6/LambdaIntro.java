package Day6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaIntro {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Sarah");
        names.add("Jerry");
        names.add("Paul");
        names.add("Patty");

//        for (String name : names) {
//            System.out.println(name);
//        }
        names.forEach(name -> System.out.println(name));

        //retrieve first characters and print out
        names.stream().map(element -> element.substring(0, 1)).forEach(name -> System.out.println(name));

        //retrieve first characters and store in List<String>
        List<String> firstChars = names.stream().map(el -> el.substring(0, 1)).collect(Collectors.toList());
        System.out.println("First characters are: " + firstChars);



    }


}
