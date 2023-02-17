package SecondTusk;

import java.util.*;

//Дан список студентов. У каждого студента есть имя и количество сделанных ДЗ.
//Необходимо получить отсортированный в невозрастающем порядке количества зделанных дз список студентов.
public class Main2 {

    public static void main(String[] args) {

    }

    public static List<Student> homeWorkList(List<Student> list){
      // List<Student> result = new ArrayList<>();
        Set<Student> set = new TreeSet<>(new ComparatorByHomeWork());
        set.addAll(list);
        return new ArrayList<>(set);
    }

}
