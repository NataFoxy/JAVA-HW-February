//Написать метод который возвращает n-ное число в последовательности Фибоначчи
//Использовать рекурсивный метод расчета.
//0 1 1 2 3 5 8 13 21 .....
//fib(n)= fib(n-1)+fib(n-2);
//
//Написать рекурсивный метод, который выводит на экран все элементы переданного в параметрах массива.

public class Main {
    public static void main(String[] args) {

        int [] array = new int[]{10, 20, 30, 40, 50, 60};

        printArray(array,0);
        System.out.println(fibonacci(7));


    }

    public static void printArray (int [] arr, int index){
        if (index>arr.length-1){

        }else{
            System.out.println(arr[index]);
            printArray(arr, index+1);
        }
    }

    public static int fibonacci(int n){
        if (n<0) throw new IllegalArgumentException();
        if(n>=0 && n<=1){
            return n;
        }else{
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }


}

