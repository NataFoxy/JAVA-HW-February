//Дан лист объектов (любой, по вашему выбору: Person, Panda, Car и т.д.)
// Необходимо реализовать метод void deleteDuplicate(list), которая удаляет повторяющиеся объекты,
// при этом сохраняя порядок элементов исходного листа. Решить задачу всеми известными вам способами.
//
//Дан лист строк, необходимо получить Map<String,Integer> такой, что ключом является строка из исходного листа,
// значением, сколько раз она встречается в листе.

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> strList = new ArrayList<>();
        strList.add("aaa");
        strList.add("bbb");
        strList.add("ccc");
        strList.add("ccc");
        strList.add("ccc");
        strList.add("ccc");
        strList.add("ddd");
        strList.add("aaa");
        strList.add("bbb");
        strList.add("ddd");
        strList.add("ddd");


//        deleteDuplicate(strList);
//        System.out.println(strList);

        System.out.println("--------------------------------------------");

        System.out.println(getMap(strList));


    }

    public static void deleteDuplicate (List<String> list){
        Set<String> temp = new HashSet<>();
        for (int i = 0; i < list.size(); i++) {
            if(!temp.add(list.get(i))){
                list.remove(i);
                i--;
            }
        }
    }

    public static Map<String, Integer> getMap (List<String> list) {
        Map<String, Integer> res = new HashMap<>();
        int counter=0;
        for (int i = 0; i < list.size()-1; i++) {
            int click =0;
            for (int j = 0; j < list.size(); j++) {
                int temp = list.get(click).hashCode();
                if(list.get(j).hashCode()==temp){
                    counter++;
                    res.put(list.get(j), counter);
                    click++;
            }

            }

        }
        return res;
    }
}