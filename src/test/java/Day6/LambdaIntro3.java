package Day6;

import java.util.Arrays;
import java.util.List;

public class LambdaIntro3 {


    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello", "", "java", "coding",
                "bootcamp", " ");
        int count = 0;
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).trim().isEmpty()) {
                count++;
            }
        }
        System.out.println("empty string count in arrayList is " + count);


        long result = words.stream().filter(el -> el.trim().isEmpty()).count();
        System.out.println("empty string count from lambda is " + result);

        if (count != result) {
            throw new RuntimeException();
        }
    }


}
