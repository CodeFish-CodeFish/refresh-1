package Day4;

import java.util.ArrayList;
import java.util.List;

public class ListIntro {

    public static void main(String[] args) {
        List<String> cars = new ArrayList<>();
        System.out.println("Elements in Cars bucket: " + cars);
        //store data
        cars.add("Tesla");
        cars.add("BMW");
        cars.add("BMW");
        cars.add("Toyota");
        cars.add("Volvo");
        cars.add("Volvo");
        System.out.println("Elements after add(): " + cars);


        //retrieve data
        String car = cars.get(0);
        System.out.println("Car at index 0: " + car);

        for (int i = 0; i < cars.size(); i++) {
            String tempCar = cars.get(i);
            System.out.println("Car at index " + i + " is " + tempCar);
        }
    }


}
