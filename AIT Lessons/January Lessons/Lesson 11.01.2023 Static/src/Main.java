public class Main {
    public static void main(String[] args) {

        //STATIC
        StaticDemo.staticMethod();
        StaticDemo.staticField=10;

        //NON STATIC
        StaticDemo obj1 = new StaticDemo();
        obj1.nonStaticMethod();
        obj1.nonStaticField=20;

        System.out.println("Obj1: " + obj1);

        StaticDemo obj2 = new StaticDemo();
        obj2.nonStaticField=30;

        System.out.println("Obj2: " + obj2);


        Person[] people ={
                new Person("Jack"),
                new Person("John"),
                new Person("Ann"),
                new Person("Lena"),
                new Person("Aex"),
        };

        for(int i=0;i<people.length;i++){
            System.out.println(people[i]);
        }
    }
}