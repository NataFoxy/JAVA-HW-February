package Fight1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {

        List<Character> kingdom = new ArrayList<>();
        kingdom.add(new King());
        kingdom.add(new Queen());
        kingdom.add(new Knight());
        kingdom.add(new Troll());

        for (Character c : kingdom){
            c.fight();
            c.startFight();
            System.out.println("------------------------------------");
        }




    }
}