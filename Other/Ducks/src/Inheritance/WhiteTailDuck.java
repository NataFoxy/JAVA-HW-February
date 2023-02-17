package Inheritance;

public class WhiteTailDuck extends Duck {

    public WhiteTailDuck() {
        flyBehavior=new FlyWithWings();
        quackBehavior= new Quack();
    }

    @Override
    public void display() {
        System.out.println("Я уточка с белым хвостиком");
    }
}
