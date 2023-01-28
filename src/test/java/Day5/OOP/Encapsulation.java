package Day5.OOP;

public class Encapsulation {

    private int age;
    private String name;

    private void printName(){
        System.out.println(name);
    }
    private void printAge(){
        System.out.println(age);
    }

    public void printInformation(){
        printAge();
        printName();
    }

    public int getAge(){
        return age;
    }

    public void setAge(int num){
        age = num;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }






}
