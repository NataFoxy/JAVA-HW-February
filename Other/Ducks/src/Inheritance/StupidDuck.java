package Inheritance;

public class StupidDuck extends Duck{
    public StupidDuck() {
        flyBehavior=new FlyWithWings();
        quackBehavior= new Silenced();
    }

    @Override
    public void display() {
        System.out.println("Я глупая уточка. Ы!");
    }
}
