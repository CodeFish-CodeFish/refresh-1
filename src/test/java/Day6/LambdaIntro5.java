package Day6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaIntro5 {

    public static void main(String[] args){
        int[] numbers = {1, 2, 3, 2, 5, 5, 4, 4, 7, 1, 2};
        List<Integer> list = Arrays.asList(1, 2, 3, 2, 5, 5, 4, 4, 7, 1, 2);
        Set<Integer> uniqueInts = new HashSet<>();
        for (int num : numbers){
            uniqueInts.add(num);
        }
        System.out.println(uniqueInts);

        List<Integer> result =  list.stream().distinct().collect(Collectors.toList());
        System.out.println(result);

    }



}
