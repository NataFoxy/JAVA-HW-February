//Создать интерфейс Eatable.
//Создать абстрактный класс Food, который имплиментирует этот интерфейс.
//Создать несколько классов еды на ваше усмотрение.
//Создайте класс судочек :банка:  Container с полями:
//а) типа String brand,
//б) типа double volume,
//с) поле content параметризированного типа, наследующего интерфейс Eatable.
//После чего создайте в main судочки с разной едой.

public class Main {
    public static void main(String[] args) {

        Container<Food> c1= new Container<>("Compact", 325, new Vegetable("Tomato"));
        System.out.println(c1);

        Container<Food> c2= new Container<>("Eco", 500, new Souce("Hollandais"));
        System.out.println(c2);


    }

}