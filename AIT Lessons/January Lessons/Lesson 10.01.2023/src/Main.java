//* Заполнить лист так, что бы числа шли в не убывающем порядке

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static Random random = new Random(System.nanoTime());
    public static void main(String[] args) {

        System.out.println(generateSortedList(10));


    }

    public static List<Integer> generateSortedList(int size){
        List<Integer> resList=new ArrayList<>();
        for (int i = 0; i < size; i++) {
            insert(resList, getNextValue());
        }
        return resList;
    }

    public static void insert(List<Integer> list, int value){
        if (list.isEmpty() || list.get(list.size()-1)<=value){
            list.add(value);
        }
        else {
            int indexToInsert=getIndexToInsert(list, value);
            list.add(indexToInsert,value);
        }
    }

    public static int getIndexToInsert(List<Integer>list, int value){
        int resIndex = 0;
        while (list.get(resIndex)<value){
            resIndex++;
        }
        return resIndex;
    }
    public static int getNextValue(){
        int min =-1000;
        int max = 1000;
        return random.nextInt(max-min+1)+min;
    }
}