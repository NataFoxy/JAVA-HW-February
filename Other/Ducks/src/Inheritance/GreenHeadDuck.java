package Inheritance;

public class GreenHeadDuck extends Duck{
    public GreenHeadDuck() {
        flyBehavior=new FlyWithWings();
        quackBehavior= new Quack();
    }

    @Override
    public void display() {
        System.out.println("Я очень ловкая, я утка с зеленой головкой");
    }
}
