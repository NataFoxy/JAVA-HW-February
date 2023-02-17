package Inheritance;

public class RoboDuck extends Duck{
    public RoboDuck() {
        flyBehavior=new RocketPower();
        quackBehavior= new Squeak();
    }


    @Override
    public void display() {
        System.out.println("Я робо-цыпа");
    }
}
