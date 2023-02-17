package Inheritance;

public abstract class Duck {
    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    public void swim(){
        System.out.println("Уточка поплыла");
    }

    public abstract void display();

    public void performQuack(){
        quackBehavior.quack();
    }

    public void performFly(){
        flyBehavior.fly();
    }

    public void setFlyBehavior(FlyBehavior flb){
        this.flyBehavior = flb;
    }

    public void setQuackBehavior (QuackBehavior q){
        this.quackBehavior=q;
    }







}
