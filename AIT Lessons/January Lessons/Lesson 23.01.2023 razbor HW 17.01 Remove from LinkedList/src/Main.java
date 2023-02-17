import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();

        MyLinkedList linkedList = new MyLinkedList();
        linkedList.add(new Person("1",20));
        linkedList.add(new Person("2", 35));
        linkedList.add(new Person("3", 28));
        linkedList.add(new Person("4",55));
        System.out.println(linkedList);
        linkedList.add(new Person("5", 36));
        System.out.println("-----------------------");
        System.out.println(linkedList);;
        System.out.println(Arrays.toString(linkedList.toArray()));
        System.out.println(linkedList.get(2));

        System.out.println("------------add first-----------------");
        linkedList.addFirst(new Person("John", 22));
        System.out.println(linkedList);

        System.out.println("-----------add first-----------------");
        MyLinkedList linkedList2 = new MyLinkedList();
        linkedList2.addFirst(new Person("Ann", 23));
        System.out.println(linkedList2);
        linkedList2.addFirst(new Person("Holly", 33));
        System.out.println(linkedList2);

        linkedList2.removePerson(new Person("Holly", 33));
        System.out.println(linkedList2);



//        Node node = linkedList.find(1);
//        linkedList.remove(node);
//        System.out.println(linkedList);
//        System.out.println(linkedList.size());

//        linkedList.removePerson(new Person("4",55));
//        System.out.println(linkedList);















    }

    public static List<String> qwe(List<String> list){

        return list;
    }
}