package Fight1;

public class Troll extends Character{
    public Troll() {
        weapon = new AxeBehavior();
    }

    @Override
    public void fight() {
        System.out.println("Мерзкие людишки!!! Все вы отведаете моего топора");

    }
}
