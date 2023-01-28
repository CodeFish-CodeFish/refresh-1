package Day5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class DeclareException {

    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("/src/");
    }

    public static void findFile() {
        try {
            FileInputStream inputStream = new FileInputStream("/src/file.txt");
        } catch (FileNotFoundException ex) {

        }

        try {
            String str = ";";
            str.charAt(10);
        } catch (RuntimeException ex) {

        }


    }


}
