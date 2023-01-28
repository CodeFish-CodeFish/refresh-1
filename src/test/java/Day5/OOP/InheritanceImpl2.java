package Day5.OOP;

public class InheritanceImpl2 extends InheritanceImpl {

    public void inherit() {
        super.sell();
        System.out.println("Another Price: " + price);
        buy();
    }
}
