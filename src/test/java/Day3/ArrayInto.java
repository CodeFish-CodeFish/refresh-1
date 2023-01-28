package Day3;

import javax.sound.midi.SysexMessage;
import java.util.Arrays;

public class ArrayInto {

    public static void main(String[] args) {
        String[] days = new String[7];
        days[0] = "Sunday";
        days[1] = "Monday";
        days[2] = "Tuesday";
        days[3] = "Wednesday";
        days[4] = "Thursday";
        days[5] = "Friday";
        days[6] = "Saturday";

        System.out.println(days[6]);
        System.out.println(days[2]);
        System.out.println(days[1]);
        System.out.println(Arrays.toString(days));
        System.out.println(days.length);


        for (int i = 0; i < days.length; i++) {
            System.out.println(days[i]);
        }

        System.out.println("Days with odd indexes");
        for (int i = 0; i < days.length; i++) {
            if (i % 2 != 0) {
                System.out.println(days[i]);
            }
        }


        for (int i = 0; i < days.length; i++) {
            String dayOfWeek = days[i];
            System.out.println(dayOfWeek + " is ");
            switch (dayOfWeek) {
                case "Wednesday":
                    System.out.println("Weekday");
                    break;
                case "Thursday":
                    System.out.println("Weekday");
                    break;
                case "Friday":
                    System.out.println("Weekday");
                    break;
                case "Monday":
                    System.out.println("Weekday");
                    break;
                case "Tuesday":
                    System.out.println("Weekday");
                    break;
                case "Saturday":
                    System.out.println("Weekend");
                    break;
                case "Sunday":
                    System.out.println("Weekend");
                    break;
            }


        }


    }


}
