//MyListPerson();
//boolean addFirst(Person str);
//Person remove(int index);
//boolean remove(Person value);
public class Main {
    public static void main(String[] args) {

        MyListPerson listPerson = new MyListPerson();
        listPerson.add(new Person("Jack", 20));
        listPerson.add(new Person("John", 28));
        listPerson.add(new Person("Jenny", 19));
        listPerson.add(new Person("Jasper", 31));
        listPerson.print();
        System.out.println("------------------------------------");

        listPerson.addFirst(new Person("Holly", 25));
       listPerson.print();
       System.out.println("------------------------------------");

        listPerson.add(new Person("Jim", 36));
       listPerson.print();
       System.out.println("------------------------------------");

        listPerson.addFirst(new Person("Lilly", 24));
        listPerson.print();
        System.out.println("--------------------------------------");

        listPerson.addFirst(new Person("Jane", 26));
        listPerson.print();
        System.out.println("----------------------------------");

        Node temp = listPerson.find(new Person("Jane", 26));
        listPerson.remove(temp);
        System.out.println(listPerson);

//        listPerson.removePerson(new Person("Jane", 26));
//        System.out.println(listPerson);






    }
}