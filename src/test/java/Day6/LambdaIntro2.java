package Day6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaIntro2 {

    public static void main(String[] args) {

        List<Integer> number = new ArrayList<>();
        number.add(0);
        number.add(1);
        number.add(2);
        number.add(3);
        number.add(4);
        number.add(5);
        number.add(100);
        number.add(107);

        number.stream().filter(num -> num % 2 == 0).forEach(el -> System.out.println(el));
        List<Integer> oddNums = number.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());
        System.out.println(oddNums);

        int total = number.stream().mapToInt(num -> num).sum();
        System.out.println("Sum of all elements in list is " + total);

        int maxNum = number.stream().mapToInt(n -> n).max().getAsInt();
        System.out.println("Max value from list: " + maxNum);



    }


}
