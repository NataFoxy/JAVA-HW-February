package Inheritance;

public class RedHairDuck extends Duck{

    public RedHairDuck() {
        flyBehavior=new FlyWithWings();
        quackBehavior= new Quack();
    }

    @Override
    public void display() {
        System.out.println("Я не рыжая, а красная! И это мой натуральный цвет!!");
    }
}
