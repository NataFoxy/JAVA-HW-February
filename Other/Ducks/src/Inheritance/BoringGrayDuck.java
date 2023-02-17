package Inheritance;

public class BoringGrayDuck extends Duck{

    public BoringGrayDuck() {
        flyBehavior=new FlyWithWings();
        quackBehavior= new Quack();
    }
    @Override
    public void display() {
        System.out.println("Я скучная серая утка :'(");
    }


}
