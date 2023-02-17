package Inheritance;

public class WoodDuck extends Duck{
    public WoodDuck() {
        flyBehavior=new CantFly();
        quackBehavior= new Silenced();
    }

    @Override
    public void display() {
        System.out.println("В голове моей опилки, не беда, деревянная я утка, да-да-да!");
    }
}
