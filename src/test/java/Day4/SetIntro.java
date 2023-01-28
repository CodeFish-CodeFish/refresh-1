package Day4;

import java.util.HashSet;
import java.util.Set;

public class SetIntro {

    public static void main(String[] args) {

        Set<String> cars = new HashSet<>();
        cars.add("Toyota");
        cars.add("Tesla");
        cars.add("Tesla");
        cars.add("Toyota");

        System.out.println("Cars in set: " + cars);

        for (String car:cars){
            System.out.println(car);
        }


    }


}
