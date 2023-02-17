import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        List<String> str1 = new ArrayList<>(List.of("0", "1", "2", "3", "4","5", "6", "7", "5"));

        List<String> str2 = new ArrayList<>(List.of("2", "4", "5", "6", "8", "7"));


        System.out.println(collectMatches(str1, str2));


    }

    public static List<String> collectMatches(List<String> list1, List<String> list2){
        List<String> res = new ArrayList<>();
        Set<String> temp = new HashSet<>();

        for (int i = 0; i < list1.size(); i++) {
            if(!temp.add(list1.get(i))){
                res.add(list1.get(i));
            }
        }
        for (int i = 0; i < list2.size(); i++) {
            if(!temp.add(list2.get(i))){
                res.add(list2.get(i));
            }
        }
        return res;
    }

    public static List<String> findMatches(List<String> list){
        List<String> res = new ArrayList<>();
        Set<String> temp = new HashSet<>();

        for (int i = 0; i < list.size(); i++) {
            if(!temp.add(list.get(i))){
                res.add(list.get(i));
            }
        }
        return res;
    }


}