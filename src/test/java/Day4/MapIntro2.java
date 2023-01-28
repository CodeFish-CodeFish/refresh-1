package Day4;

import java.util.HashMap;
import java.util.Map;

public class MapIntro2 {

    public static int sum = 10;
    public int price = 100;

    public static void main(String[] args){
        MapIntro2 mapIntro = new MapIntro2();
        mapIntro.countLetterAppearance("Hello");
        print();

        MapIntro2 mapIntro2 = new MapIntro2();

        mapIntro.price = 95;

        System.out.println("First object price value: " + mapIntro.price);
        System.out.println("Second object price value: " + mapIntro2.price);


    }

    public static void print(){
        System.out.println("From print method");
    }
    //Hello
    public void countLetterAppearance(String sentence){
        // a - 2, b - 3, d - 1, z - 6
        Map<Character, Integer> map = new HashMap<>();
                            //[h, e, l, l, o]
        for (Character ch : sentence.toCharArray()){
            if(!map.containsKey(ch)){
                map.put(ch, 1);
                // h, 1
                // e, 1
                // l, 1
                // 0, 1
            } else {
                Integer count = map.get(ch); //1
                map.put(ch, ++count);
                // h, 1
                // e, 1
                // l, 2
                // o, 1
            }

        }

        System.out.println(map);
    }




}
