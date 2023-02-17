package Inheritance;

public class NaiveDuck extends Duck{

    public NaiveDuck() {
        flyBehavior=new FlyWithWings();
        quackBehavior= new Squeak();
    }

    @Override
    public void display() {
        System.out.println("Я наивная уточка. А ты правда на мне женишься?");
    }

}
