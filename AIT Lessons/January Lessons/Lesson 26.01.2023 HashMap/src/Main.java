import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        HashSet<String> set1 = new HashSet<>();
        set1.add("aaa");
        set1.add("bbb");
        set1.add("ccc");
        set1.add("ddd");
        set1.add("ddd");

        System.out.println(set1);


        Set<String> set2 = new HashSet<>();
        set2.add("aaa");
        set2.add("bbb");
        set2.add("ccc");
        set2.add("ddd");
        set2.add("ddd");

        System.out.println(set2);

        List<String> list1 = new ArrayList<>();
        list1.add("aaa");
        list1.add("bbb");
        list1.add("ccc");
        list1.add("ddd");
        list1.add("aaa");

        System.out.println(list1);



    }
}