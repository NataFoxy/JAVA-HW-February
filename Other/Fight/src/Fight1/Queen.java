package Fight1;

public class Queen extends Character{
    public Queen() {
        weapon = new KnifeBehavior();
    }

    @Override
    public void fight() {
        System.out.println("Королева не имеет права на ошибку, потому моё оружие должно быть скрытым и быстрым");

    }
}
