//Получить List из N случайных целых чисел


import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Main {

    public static Random random = new Random(System.nanoTime());
    public static void main(String[] args) {
        //        int min= Integer.MIN_VALUE;
//        int max= Integer.MAX_VALUE;
//        int intNum = (int)(min + Math.random()* (max+1 - min));
//
//        ArrayList <Integer> randomDigits =new ArrayList<>();

        System.out.println(Integer.MAX_VALUE);    // 2147483647
        System.out.println(Integer.MAX_VALUE+1);  // -2147483648
        System.out.println(Integer.MAX_VALUE+1-Integer.MIN_VALUE); // 0

        List <Integer> list = getRndList(2);
        System.out.println(list);
        System.out.println(addRndList(list, 5));


    }

    public static List<Integer> getRndList(int n){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(getRndNum(random));
        }
        return list;

    }

    public static List<Integer> addRndList(List <Integer> list, int newN){
        int count = newN - list.size();
        for (int i = 0; i < count; i++) {
            list.add(getRndNum(random));
        }
        return list;

    }



    public static int getRndNum(Random random){
        return random.nextInt();
    }
}