import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();

        set.add("str 1");
        set.add("str 2");
        set.add("str 3");
        set.add("str 4");
        set.add("str 5");
        set.add("str 6");

        System.out.println(set);

        Person p1 = new Person("Tolik", 20);
        Person p2 = new Person("Oleg", 30);
        Set<Person> personSet = new HashSet<>();
        personSet.add(p1);
        personSet.add(p2);
        personSet.add(new Person("Lena", 23));
        personSet.add(new Person("Tolik", 20));
        personSet.add(p1);

        System.out.println(personSet);

        System.out.println("-----------------------------");

        for (Person p: personSet){
            System.out.println(p);
        }
        System.out.println(personSet.contains(p1));


    }
}