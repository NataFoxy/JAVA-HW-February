package Inheritance;

public class Silenced implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("Я молчалива как бревно");
    }
}
