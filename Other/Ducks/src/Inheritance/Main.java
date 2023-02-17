package Inheritance;

import Interface.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Duck> prud = new ArrayList<>();
        prud.add(new BoringGrayDuck());
        prud.add(new GreenHeadDuck());
        prud.add(new NaiveDuck());
        prud.add(new RedHairDuck());
        prud.add(new RubberDuck());
        prud.add(new SmartDuck());
        prud.add(new StupidDuck());
        prud.add(new WhiteTailDuck());
        prud.add(new WoodDuck());
        prud.add(new RoboDuck());

        Duck d1 = new SmartDuck();
        d1.setFlyBehavior(new RocketPower());

        prud.add(d1);


        for (Duck d: prud){
            d.display();
            d.performQuack();
            d.performFly();
            System.out.println("-------------------------");
        }

    }
}