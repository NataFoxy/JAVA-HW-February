import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Main {
    private static final int LIMIT = 100_000;
    private static final Random RND=new Random();
    private static long start;
    private static long finish;


    public static void main(String[] args) {
        List<Integer> list = new LinkedList<Integer>();
        startTimer();
        addNumbers(list);
        stopTimer();
        System.out.println("Done. List.size() ="+list.size());
        System.out.println(getTimer());

        System.out.println("------------------------");

        List<Integer> list1 = new LinkedList<>();
        startTimer();
        addNumberToRndPosition(list1);
        stopTimer();
        System.out.println("Done. List.size() ="+list.size());
        System.out.println(getTimer());

        System.out.println("------------------------");

        List<Integer> list2 = new LinkedList<>();
        startTimer();
        addNumberToRndPosition(list2);
        stopTimer();
        System.out.println("Done. List.size() ="+list.size());
        System.out.println(getTimer());





    }


    public static void startTimer(){
        start= System.nanoTime();
    }

    public static void stopTimer(){
        finish= System.nanoTime();
    }
    public static long getTimer(){
        long time = finish-start;
        return TimeUnit.MILLISECONDS.convert(time,TimeUnit.NANOSECONDS);
    }


    public static void addNumbers(List<Integer> list){
        for (int i = 0; i < LIMIT; i++) {
            list.add(i);
        }
    }

    public static void addNumberToRndPosition(List<Integer> list){
        list.add(RND.nextInt(0,100));
        if(list!=null){
            for (int i = 0; i < LIMIT; i++) {
                list.add(RND.nextInt(list.size()), RND.nextInt(100));
            }
        }
    }

    public static void addNumberToRndPosition1(List<Integer> list){
        List<Integer> arr = new ArrayList<>(LIMIT);
        for (int i = 0; i < LIMIT; i++) {
            arr.add(i);
            list.add(-1);
        }
            for (int i = 0; i < LIMIT; i++) {
                int rndIdx = RND.nextInt(LIMIT - i);
                int rndFromList = arr.remove(rndIdx);
                list.set(rndFromList, RND.nextInt());
            }
        }
    }
