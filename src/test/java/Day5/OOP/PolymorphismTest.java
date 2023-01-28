package Day5.OOP;

import java.util.*;

public class PolymorphismTest {

    public static void main(String[] args){
        Polymorphism poly = new Polymorphism();
        PolymorphismImpl polyImp = new PolymorphismImpl();
        Polymorphism polymorphism = new PolymorphismImpl();
        polymorphism.eat();
      //Person interface     concrete class
        Person person = new Parent();
        person.work();


        List<String> names = new ArrayList<>();
        Set uniqueClasses = new HashSet();
        Map map = new HashMap();





    }

}
