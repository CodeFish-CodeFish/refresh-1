package Day5;

public class TryCatch {


    public static void main(String[] args) {
//        arithmeticalEx();
//        System.out.println("Next line after exception");

        System.out.println("Calculating your salary");
        try {
            arithmeticalEx();
        } catch (ArithmeticException ex) {
            System.out.println("Caught an Arithmetic exception");
            System.out.println("Sorry, you cannot divide by 0");
            ex.printStackTrace();
            throw new RuntimeException();
        }
        System.out.println("Your salary has been successfully calculated");
    }

    public static void arithmeticalEx() {
        System.out.println(5 / 0);
        System.out.println(3 / 0);
        System.out.println(0 / 0);
    }


}
