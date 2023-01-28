package Day2;

import javax.sound.midi.SysexMessage;
import java.util.Random;

public class ForLoop {


    public static void main(String[] args) {
        //for(definition; condition; update){}

        for (int i = 0; i < 20; i++) {
            if (i % 2 != 0) {
                System.out.println("Iteration number: " + i);
            }
            //print out odd numbers using if condition
        }

        Random random = new Random(12);
        for (int i = 0; i < 100; i++) {
//            if(random.nextInt() == 15){
//                break;
//            }
            if (i == 15) {
                break; //stop the loop
            } else if(i == 10){
                System.out.println("skipping 10");
                continue; //skip everything after this line,
                // and start new iteration
            }
            System.out.println("Number " + i);
        }






    }


}
