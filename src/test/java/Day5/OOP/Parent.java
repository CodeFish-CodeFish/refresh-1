package Day5.OOP;

public class Parent implements Person {

    @Override
    public void work(){
        System.out.println("person Name: "+ name);
        System.out.println("Works 24h");
    }

}
