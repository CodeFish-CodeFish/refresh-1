package Day3;

public class SdetStudent {


    public static void main(String[] args){
        //className variable = new className();

        SDET student1 = new SDET();
        student1.isOncampus = false;
        student1.isOncampus = true;
        student1.weeks = 24;
        student1.javaClass = "in progress";

        SDET student2 = new SDET();
        student2.javaClass = "doing recap";

        System.out.println(student1.javaClass);
        System.out.println(student2.javaClass);



    }



}
