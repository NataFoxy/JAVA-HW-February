//1.      Дан  List<String>. Найти самую длинную строку в этом листе
//2.      Дан List<String>. Используя итератор, получить новый список строк начинающихся на заданную строку.
//3.      Дан список Котков. О каждом котике известна масса. Найти индекс самого не упитанного котика.
//4.      Дан массив Котков. О каждом котике известна масса.  Сформировать List<Сat> котиков из N самых толстых котиках.
//5.      Дан список Котков. Имена котиков повторяются. Найти индекс первого попавшегося котика, чье имя уже было в списке.
//6.      Дан список Котков. У каждого котика своя, уникальная масса. Получить Map<Cat, Double> где ключ, это котик, а значение его масса.
//7.      Дан список Котков. А мы знаем, что имена то у котиков повторяться. Получить Map<String, Cat> где ключ, это имя, сам котик.

import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("----------------------------- 1 -------------------------------");

        List<String> list = new ArrayList<>();
        list.add("Hi!");
        list.add("Hello");
        list.add("Hello world");
        list.add("Good morning");
        list.add("Have a good day!");
        list.add("Have you ever seen a Dinosaur?");
        list.add("See ya!");

        System.out.println(getLongestStringInList(list));

        System.out.println("----------------------------- 2 -------------------------------");

        System.out.println(getListOfStringsStartsFrom(list, "Hello"));

        System.out.println("----------------------------- 3 -------------------------------");

        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat("Barsik", 3.0));
        cats.add(new Cat("Kuzja", 2.5));
        cats.add(new Cat("Barsik", 4.0));
        cats.add(new Cat("Barsik", 2.3));
        cats.add(new Cat("Smoky", 3.5));
        cats.add(new Cat("Molly", 3.4));

        System.out.println(mostLightCat(cats));

        System.out.println("----------------------------- 4 -------------------------------");

        System.out.println(getMostHeavyCats(cats, 3.0));

        System.out.println("----------------------------- 5 -------------------------------");

        System.out.println(getIndexOfRepeatedCatByName(cats));

        System.out.println("----------------------------- 6 -------------------------------");

        System.out.println(getMapOfCats(cats));

        System.out.println("----------------------------- 7 -------------------------------");

        System.out.println(getMapOfCatsByName(cats));


    }



    //1. Дан  List<String>. Найти самую длинную строку в этом листе
    public static String getLongestStringInList (List<String> list) {
        String temp = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() > temp.length()) {
                temp = list.get(i);
            }
        }
        return temp;
    }

    //2. Дан List<String>. Используя итератор, получить новый список строк начинающихся на заданную строку.

    public static List<String> getListOfStringsStartsFrom (List<String> list, String word){
        List<String> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).contains(word)){
                result.add(list.get(i));
            }
        }
        return result;
    }

    //3. Дан список Котиков. О каждом котике известна масса. Найти индекс самого не упитанного котика.

    public static int mostLightCat(List<Cat> list){
        int index = 0;
        for (int i = 0; i < list.size(); i++) {
            double temp = list.get(0).getWeight();
            if(list.get(i).getWeight()<temp){
                index=i;
            }
        }
        return index;
    }

    //4. Дан массив Котиков. О каждом котике известна масса. Сформировать List<Сat> котиков из N самых толстых котиков.

    public static List<Cat> getMostHeavyCats (List<Cat> list, double weight){
        List<Cat> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getWeight()>= weight){
                result.add(list.get(i));
            }
        }
        return result;
    }

    //5. Дан список Котиков. Имена котиков повторяются. Найти индекс первого попавшегося котика,
    // чье имя уже было в списке.

    public static int getIndexOfRepeatedCatByName(List<Cat> list){
        int index = 0;
       // String catName = list.get(0).getName();
        Map<String,Cat> uniqueCats = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            uniqueCats.put(list.get(i).getName(), list.get(i));
            if(!uniqueCats.put(list.get(i).getName(), list.get(i))){
                index = i;
                break;
            }
        }

        return index;
    }

    //6. Дан список Котиков. У каждого котика своя, уникальная масса. Получить Map<Cat, Double> где ключ, это котик,
    // а значение его масса.

    public static Map<Cat,Double> getMapOfCats (List<Cat> list){
        Map<Cat, Double> mapOfCats = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            mapOfCats.put(list.get(i), list.get(i).getWeight());
        }
        return mapOfCats;
    }

    //7. Дан список Котиков. А мы знаем, что имена то у котиков повторяться.
    // Получить Map<String, Cat> где ключ, это имя, а значение сам котик.

    public static Map<String,Cat> getMapOfCatsByName (List<Cat> list){
        Map<String, Cat> mapOfCats = new HashMap<>();
        int counter=1;
        for (int i = 0; i < list.size(); i++) {
            if(mapOfCats.containsKey(list.get(i).getName())){
                list.get(i).setName(list.get(i).getName() + counter);
                counter++;
            }
            mapOfCats.put(list.get(i).getName(), list.get(i));
        }
        return mapOfCats;
    }













}