
//Дан список студентов группы.
// Дан список занятий Lesson {int num, String theme, List<Student> students}  т.е. номер занятия, тема и
// список присутствующих студентов.
//Необходимо получить список занятий, где количество прогульщиков было больше заданного числа
// Необходимо получить список “прогульщиков” отсортированный по количеству прогулов
//.

//Дано два списка Student-ов. Необходимо определить, является ли один список циклической перестановкой другого.
// Например
//	list1{s1,s2,s3,s4,s5},  list2{s3,s4,s5,s1,s2} ->true
//list1{s1,s2,s3,s4,s5},  list2{s2,s4,s5,s1,s3} ->false
//Решить задачу всеми известными вам способами.

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {


        Student st1 =  new Student("Alex");
        Student st2 =  new Student("Inna");
        Student st3 =  new Student("Sam");
        Student st4 =  new Student("Olga");
        Student st5 =  new Student("Yenn");
        Student st6 =  new Student("Geralt");



        Group gr = new Group("1A", List.of(st1, st2, st3, st4, st5, st6));
        gr.getStudentList().size();

        Lesson l1= new Lesson(1, "Biology", List.of(st1, st3, st4,st6));
        l1.getStudentList().size();
        Lesson l2 =  new Lesson(2, "Informatik", List.of(st1, st2, st3, st4,st6));
        Lesson l3 = new Lesson(3, "Math", List.of(st1, st3));

        List<Lesson> listOfLessons = List.of(l1, l2, l3);

        System.out.println(getListOfLessonsByNumberOfMissingStudents(listOfLessons, 2, gr));

    }



    public static List<Lesson> getListOfLessonsByNumberOfMissingStudents (List<Lesson> listOfLessons, int missingStudentsMoreThan, Group group){
        List<Lesson> resultList = new ArrayList<>();
        for (int i = 0; i < listOfLessons.size(); i++) {
            if(group.getStudentList().size()-listOfLessons.get(i).getStudentList().size() > missingStudentsMoreThan){
                resultList.add(listOfLessons.get(i));
            }
        }
        return resultList;
    }

    //-----------------------------------------------2-------------------------------------------------------

    public static boolean checkCycling(List<String> list1, List<String> list2) {
        if (list1 == null || list2 == null || list1.size() != list2.size() || list1.isEmpty()) return false;
        String firstStr = list1.get(0);
        if (!list2.contains(firstStr)) return false;
        int startIndex = list2.indexOf(firstStr);
        for (String s : list1) {
            if (!s.equals(list2.get(startIndex))) return false;
            if (startIndex + 1 == list2.size()) {
                startIndex = 0;
            } else {
                startIndex++;
            }
        }
        return true;
    }

    //--------------------------------------2 with Anonymous Type---------------------------------------------

    public static <T> boolean checkCycling1(List<T> list1, List<T> list2) {
        if (list1 == null || list2 == null || list1.size() != list2.size() || list1.isEmpty()) return false;
        Queue<T> deque1= new LinkedList<>(list1);
        Queue<T> deque2= new LinkedList<>(list2);

        for (int i = 0; i < deque1.size() ; i++) {
            if(deque1.equals(deque2)) return true;
            deque2.offer(deque2.poll());
        }
        return false;
    }



}