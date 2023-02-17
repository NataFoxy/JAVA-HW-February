package Inheritance;

public class SmartDuck extends Duck{
    public SmartDuck() {
        flyBehavior=new CantFly();
        quackBehavior= new Quack();
    }

    @Override
    public void display() {
        System.out.println("Я умная уточка! 2х2=5!");

    }

}
