//Дано List< List<Integer>> , каждый элемент этого листа - отсортированный лист Integer.
// Необходимо объединить все листы в один отсортированный лист.
//
//Предположим у нас есть класс Task{int num, String title, String priority}.
// Поле priority может принимать следующие значения: “high”  “low”  “the boss said urgently”.
// Вам необходимо объединить задачи в очередь, так и написать метод getTask,
// чтобы  программист забирал задачи в порядке очереди но, в первую очередь,
// задачи  “the boss said urgently”, потом “high”, потом “low”.
// При этом важно, если есть несколько задач  например, “boss said urgently” они решаются в порядке очереди.
//Подсказка: посмотрите код примера PriorityQueue написанный в классе

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        System.out.println("-------------------------Task 1 ----------------------------------------");


        List<Integer> list1 = List.of(1,2,3,4,5);
        List<Integer> list2 = List.of(-10, -2, 0);
        List<Integer> list3 = List.of(9,10,15,18,20);

       List<List<Integer>> listAll = List.of(list1,list2,list3);
        System.out.println(getSizeOfList(listAll));

        System.out.println(getOneList(listAll));


        System.out.println("-------------------------Task 2 ----------------------------------------");

        Task task1 = new Task(1, "Выпить кофе", "Low");
        Task task2 = new Task(2, "Умыться", "High");
        Task task3 = new Task(3, "Почистить зубы", "High");
        Task task4 = new Task(4, "Проснуться", "Urgent!");
        Task task5 = new Task(5, "Позавтракать", "High");
        Task task6 = new Task(6, "Прийти на работу", "High");
        Task task7 = new Task(7, "Сходить в туалет", "Urgent!");


        PriorityQueue<Task> tasks = new PriorityQueue<>();
        tasks.offer(task1);
        tasks.offer(task2);
        tasks.offer(task3);
        tasks.offer(task4);
        tasks.offer(task5);
        tasks.offer(task6);
        tasks.offer(task7);

        System.out.println(tasks);


        System.out.println(getTask(tasks));
        System.out.println(getTask(tasks));
        System.out.println(getTask(tasks));
        System.out.println(getTask(tasks));
        System.out.println(getTask(tasks));
        System.out.println(getTask(tasks));
        System.out.println(getTask(tasks));


    }

    public static Task getTask (Queue<Task> tasks){
        return tasks.poll();
    }



    public static int getSizeOfList(List<List<Integer>> list){
        int size = 0;
        for (int i = 0; i < list.size(); i++) {
            int newSize = list.get(i).size();
            size = size + newSize;
        }
        return size;
    }

    public static List<Integer> getOneList (List<List<Integer>> list){
        int sizeOfResultList = getSizeOfList(list);
        List<Integer> result = new ArrayList<>(sizeOfResultList);

//        int minValue=0;
//        int listNumber;
//        int listWithMinValue;
        int i1=0;
        int i2=0;

        int[] indexes = new int[list.size()];
        int[] value = new int[list.size()];
        for (int i = 0; i <list.size(); i++) {
            value[i]=list.get(i).get(indexes[i]);
        }
        int minValue = value[0];
        for (int i = 0; i < value.length; i++) {
            if(minValue<value[i]){

        }

        for (int i = 0; i < list.size(); i++) {
//            int i3=0;
            result.add(list.get(i).get(i1)< list.get(i+1).get(i2) ? list.get(i).get(i1) : list.get(i+2).get(i2));
            i1++;

        }


        return result;
    }
}