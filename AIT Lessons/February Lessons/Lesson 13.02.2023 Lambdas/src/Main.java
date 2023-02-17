import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Hi!");
        list.add("Hello");
        list.add("Hello world");
        list.add("Good morning");
        list.add("Have a good day!");
        list.add("Have you ever seen a Dinosaur?");
        list.add("See ya!");

        System.out.println(getStringsLength(list));
        System.out.println(getAmountOfVowelLettersInString(list));

        //System.out.println(getAmountOfWordsInString(list));

        List<Student> students = new ArrayList<>();
        students.add(new Student("Ron", 23, 3));
        students.add(new Student("Harry", 24, 2));
        students.add(new Student("Germiona", 22, 0));
        students.add(new Student("Jinny", 21, 1));



        //through Anonymous class

        Comparator<Student> comparatorByAge = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge()-o2.getAge();
            }
        };

        Comparator<Student> comparatorByMissedLessons = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAmountOfMissedLessons()-o2.getAmountOfMissedLessons();
            }
        };

        Comparator<Student> comparatorByName = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        //through Lambda

        Comparator<Student> comparatorByMissedLessons1 = (o1, o2) -> o1.getAmountOfMissedLessons()-o2.getAmountOfMissedLessons();
        Comparator<Student> comparatorByAge1 = (Student o1, Student o2) -> {return o1.getAge()-o2.getAge();} ; //блочная лямбда
        Comparator<Student> comparatorByName1 = (o1,o2) -> o1.getName().compareTo(o2.getName()); //строчная лямбда
        Comparator<Student> selestedComparator =null;


        int choice = 1;
        switch (choice){
            case 1: selestedComparator = comparatorByAge; break;
            case 2: selestedComparator = comparatorByMissedLessons; break;
            case 3: selestedComparator = comparatorByName; break;
            default: selestedComparator = comparatorByAge;
        }

        System.out.println(sortStudents(students, selestedComparator));


    }



    public static List<Student> sortStudents(List<Student> list, Comparator<Student> comparator){
        List<Student> result = new ArrayList<>(list);

        result.sort(comparator);


        return result;
    }

    public static List<Integer> getStringsLength(List<String> list){
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            result.add(list.get(i).length());
        }
        return result;
    }

    public static List<Integer> getAmountOfVowelLettersInString(List<String> list){
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            char[] chars = new char[list.get(i).length()];
            chars=list.get(i).toCharArray();
            int counterForVowel=0;
            for (int j = 0; j < chars.length; j++) {
                if(chars[j]=='a'){
                    counterForVowel++;
                }
                if(chars[j]=='i'){
                    counterForVowel++;
                }
                if(chars[j]=='e'){
                    counterForVowel++;
                }
                if(chars[j]=='o'){
                    counterForVowel++;
                }
                if(chars[j]=='u'){
                    counterForVowel++;
                }
            }
            result.add(counterForVowel);
        }
        return result;
    }

//    public static List<Integer> getAmountOfWordsInString(List<String> list){
//        List<Integer> result = new ArrayList<>();
//        for (int i = 0; i < list.size(); i++) {
//            int counter=0;
//            String temp = list.get(i).trim();
//                if(temp.contains(" ")){
//                    counter++;
//            }
//            result.add(counter+1);
//
//        }
//
//        return result;
//    }




}