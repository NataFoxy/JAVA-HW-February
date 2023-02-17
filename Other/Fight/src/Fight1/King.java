package Fight1;

public class King extends Character{

    public King() {
        weapon = new BowAndArrowBehavior();
    }

    @Override
    public void fight() {
        System.out.println("Я король. Подайте мне мой лук и мои стрелы");
    }
}
