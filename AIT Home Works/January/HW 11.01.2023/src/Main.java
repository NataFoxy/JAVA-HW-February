//1. Дан List строк.
//   Написать метод, который возвращает строку, которая есть результат объединения всех строк исходного листа через пробел.
//   Например: {“I”, “do”, “my”, ”homework”} -> “I do my homework”. Написать тесты.

//2. Пусть дан список List объектов типа User{String fName, String lName, int age }.
//   Предположим, при чтение User-ов из базы данных случилась ошибка и у всех пользователей из списка
// поменялись местами fName и lName.
//   Необходимо написать метод, который исправит данную ситуацию. Написать тесты

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("------------ 1 task -----------------");

        List<String> list = new ArrayList<>();
        list.add(0, "I");
        list.add(1, "do");
        list.add(2, "my");
        list.add(3, "homework");

        System.out.println(combine(list));

        System.out.println("------------ 2 task -----------------");

        List<User> users = new ArrayList<>();
        users.add(0, new User("Johny", "Depp", 59));
        users.add(1, new User("Christian", "Bale", 48));
        users.add(2, new User("Meryl", "Streep", 73));
        users.add(3, new User("Cate", "Blanchett",53));

        System.out.println(users);





    }





    public static void rearrangeName (List<User> users, List<User> recievedList){

        for (int i = 0; i < recievedList.size(); i++) {
            if(!recievedList.get(i).getfName().equals(users.get(i).getfName())){
                recievedList.get(i).getfName()
            }


        }
    }

    public static String combine (List<String> list){
        String res = "";
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)!=null && !list.get(i).equals("")){   //после теста добавили проверку на null
                res+= list.get(i) + " ";
            }

        }
        return res.trim();  //после теста добавили .trim, который обрезал не нужные пробелы по краям
    }
}