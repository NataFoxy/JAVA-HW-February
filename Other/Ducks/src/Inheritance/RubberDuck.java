package Inheritance;

public class RubberDuck extends Duck {
    public RubberDuck() {
        flyBehavior=new CantFly();
        quackBehavior= new Squeak();
    }

    @Override
    public void display() {
        System.out.println("Я резиновая желтая уточка, героиня мемов"
        );
    }




}
