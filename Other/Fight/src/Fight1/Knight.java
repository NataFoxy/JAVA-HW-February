package Fight1;

public class Knight extends Character{
    public Knight() {
        weapon= new SwordBehavior();
    }

    @Override
    public void fight() {
        System.out.println("Имя мне - Сэр Джейме Ланнистер и я поднимаю свой меч во имя короля");

    }
}
