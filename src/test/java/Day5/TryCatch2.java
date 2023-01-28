package Day5;

public class TryCatch2 {

    public static void main(String[] args) {

        String name = "Codefish";
        try {
            char ch = name.charAt(100);
        } catch (ArithmeticException ex) {
            System.out.println("No such index in given string");
        } finally {
            System.out.println("Hello from finally block");
        }


    }


}
