//Дан лист из Person (fName, lName, age).
// Необходимо получить лист из строк вида (Иванов И., 45) для всех людей, младше заданного возраста.
//В рамках данной задачи считаем, что исходный list не содержит значения null. Необходимо реализовать тесты.

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List <Person> persons = new ArrayList<>();
        persons.add(0,new Person("Ivanov", "Ivan", 45));
        persons.add(1,new Person("Ivanov", "Petr", 37));
        persons.add(2,new Person("Petrov", "Ivan", 45));
        persons.add(3,new Person("Vasiljev", "Vasilij", 25));

        System.out.println(persons);

        getList(persons);



    }

    //// 7. Написать метод, который принимает массив строк вида “Иван Иванов”, т.е. имя и фамилия,
    //// а в качестве результата возвращает массив строк вида «И.Иванов».
    //// Например: {“Иван Иванов”, “Николай Николаев”, “Петр Петров”} -> {“И.Иванов”, “Н.Николаев”, “П.Петров” "Мария Луиза Хосе Гомес"}
    //
    //    public static String[] shorFirstName(String[] names){
    //        String[] res = new String[names.length];
    //        for (int i = 0; i < res.length; i++) {
    //            res[i] = getShortName(names[i]);
    //        }
    //        return res;
    //    }
    //
    //    private static String getShortName(String name){
    //        String[] words=name.split(" ",1);
    //        String res="";
    //        if(words.length>=2) {
    //            res = String.valueOf(words[0].charAt(0)) + "." + words[1];
    //        } else {
    //            res=name;
    //        }
    //        return res;
    //    }

    public static List<Person> getList (List<Person> persons){
        List<Person> res = new ArrayList<>();
        for (int i = 0; i < persons.size(); i++) {
        }
        return res;
    }

    private static String getShortName (String name){
        String [] words = name.split(" ", 1);
        String res = "";
        if(words.length>=2){
            res=String.valueOf(words[0].charAt(0) + "." + words[1]);
        }
        else{
            res=name;
        }
        return res;
    }
}

