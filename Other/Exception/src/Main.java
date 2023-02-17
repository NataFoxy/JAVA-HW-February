//Задание 2 Выгулять собаку
//
//Создайте класс собака с полями: string name, boolean одет-намордник, одет-костюм, покормлена.
//Cоздайте методы надеть ошейник, надеть костюм, покормиться.
//Создайте у собаки метод пойти на прогулку goForAWalk:
//если собака, сыта, одета и в ошейнике
// - метод выводит в консоль "Успешная прогулка".
//Если какое-то из условий не выполняется - бросается (throw) исключение.
//
//В main создайте экземпляр класса Dog, вызовите метод goForAWalk(), оберните в try - catch.
public class Main {
    public static void main(String[] args) {


        Dog d1 = new Dog("Rex");
        System.out.println(d1);
        d1.addCollar();
        d1.addFood();



        try{
            System.out.println(d1.goForAWalk());
        }catch (DogCollarException | DogEatException | DogNotReadyForAWalkException e) {
            System.out.println(e.getMessage());
        }




    }
}