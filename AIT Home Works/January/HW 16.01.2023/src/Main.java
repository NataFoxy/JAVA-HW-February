//Реализовать метод, который добавляет в List<Integer>  1000000 целых чисел.
//
//Реализовать метод, который добавляет в List<Integer>  1000000 целых чисел,
// но каждое следующее значение должно добавляться в случайную позицию листа.
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {
    private static final Random RND=new Random();
    public static void main(String[] args) {

     List<Integer> list = new ArrayList<>();

//        addNumber(list,11);
//        System.out.println(list);

        System.out.println("---------------------------");

//        addRandomNumber(list, 10);
//        System.out.println(list);



        addNumberToRndPosition(list,5);
        System.out.println(list);



    }

    public static void addNumber(List<Integer> list, int n){
        if(list!=null && n>0){
            for (int i = 1; i <= n; i++) {
                list.add(i);
            }
        }
    }

    public static void addRandomNumber(List<Integer> list, int n){
        if(list!=null && n>0){
            for (int i = 0; i < n; i++) {
                list.add(getRandomNumber());
            }
        }
    }

    public static int getRandomNumber (){
        Random random = new Random();
        return random.nextInt(1, 100);
    }

    public static int getRandomIndex(List<Integer> list){
        Random random =new Random();
        return random.nextInt(0, list.size());

    }

    public static void addNumberToRndPosition(List<Integer> list, int n){
        list.add(RND.nextInt(0,100));
        if(list!=null && n!=0){
            for (int i = 0; i <=n; i++) {
                list.add(RND.nextInt(list.size()), RND.nextInt(100));
            }
        }
    }






}