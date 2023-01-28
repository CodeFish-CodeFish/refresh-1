package Day5.OOP;

public class InheritanceImpl extends Inheritance {

    public void action() {
        System.out.println("Price is " + price);
        System.out.println("Product is " + product);
        System.out.println("Is for sale: " + forSale);
        sell();
        buy();
    }

    @Override
    public void buy() {
        System.out.println("not buying");
    }

    public static void main(String[] args) {
        InheritanceImpl inheritance = new InheritanceImpl();
        inheritance.action();
    }
}
