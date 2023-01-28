package Day6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaIntro4 {


    public static void main(String[] args) {

        List<String> words = Arrays.asList("hello", "", "java", "coding",
                "bootcamp", " ", "Chicago", "Miami", "snow", "winter", "wind");

        words.stream().filter(word -> word.length() > 5).forEach(f -> System.out.println(f));
        List<String> list = words.stream().filter(word -> word.length() > 5).collect(Collectors.toList());

        String result = words.stream().filter(w -> w.length() < 5 && !w.trim().isEmpty()).collect(Collectors.joining("-"));
        System.out.println(result);


        result = words.stream().filter(w -> w.length() < 5 && !w.trim().isEmpty()).map(m -> m.toUpperCase()).collect(Collectors.joining("-"));
        System.out.println(result);


        result = words.stream()
                .filter(w -> w.length() < 5 && !w.trim().isEmpty()) //filter out words more than 5 char, and empty str
                .map(m -> m.substring(0, 1).toUpperCase() + m.substring(1))//convert first char to Uppercase
                .collect(Collectors.joining("-")); //concatenate to single string
        System.out.println(result);


    }


}
