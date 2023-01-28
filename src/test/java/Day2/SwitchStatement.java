package Day2;

public class SwitchStatement {

    public static void main(String[] args) {

        //number(1-9) to string: 1 -> one, 2 -> two, 3 -> three

        int number = 1;
        switch (number) {
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;
            case 6:
                System.out.println("six");
                break;
            case 7:
                System.out.println("seven");
                break;
            case 8:
                System.out.println("eight");
                break;
            case 9:
                System.out.println("nine");
                break;
            default:
                System.out.println("invalid number, allowed values are 1 to 9");
        }


        String name = "Codefish";
        switch (name) {
            case "codefish":
                System.out.println(name + " is lowercase");
                break;
            case "CODEFISH":
                System.out.println(name + " is uppercase");
                break;
            case "Codefish":
                System.out.println(name + " is sentence case");
                break;
        }


    }


}
