package Inheritance;

public class CantFly implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("Я не умею летать :(");
    }
}
