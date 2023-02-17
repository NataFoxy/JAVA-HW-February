//дан нормальный лист из строк
//получить лист из строк, где каждая строка в скобках

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add(0, "one");
        list.add(1, "two");
        list.add(2, "three");
        list.add(3, "four");

        System.out.println(list);
        System.out.println("---------------------------------------------------");
        System.out.println(listHandler(list, new WordTransformerAddRoundBrackets()));
        System.out.println(listHandler(list, new WordTransformerAddSquareBrackets()));
        System.out.println(listHandler(list, new WordTransformerToUpperCase()));


    }

    public static List<String> listHandler(List<String> list, WordTransformer choice){
       List<String> resList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            resList.add(choice.transform(list.get(i)));
        }
        return resList;
    }
}