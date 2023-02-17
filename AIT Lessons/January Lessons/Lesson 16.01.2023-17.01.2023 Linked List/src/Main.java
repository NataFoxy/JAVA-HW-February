import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        System.out.println("Size= "+list.size());
        System.out.println(list);
        list.add("5");
        System.out.println("-----------------------");
        System.out.println(list);;
        System.out.println(Arrays.toString(list.toArray()));

        try {
            System.out.println(list.get(9));
        } catch (IndexNotCorrectException e){
            System.out.println("индекс не корректен");
            e.printStackTrace();
        }
    }

}