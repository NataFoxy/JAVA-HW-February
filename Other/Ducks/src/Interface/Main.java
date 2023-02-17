package Interface;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Duck> prud = new ArrayList<>();
        prud.add(new WhiteTailDuck());
        prud.add(new RedHairDuck());
        prud.add(new GreenHeadDuck());
        prud.add(new BoringGrayDuck());
        prud.add(new RubberDuck());
        prud.add(new WoodDuck());
        prud.add(new StupidDuck());
        prud.add(new SmartDuck());
        prud.add(new NaiveDuck());
        prud.add(new TiredDuck());


        for (Duck d: prud){
            d.display();
            if(d instanceof Quackable q){
                q.quack();
            }
            if(d instanceof Flyable f){
                f.fly();
            }
            System.out.println("-------------------------");
        }

    }
}