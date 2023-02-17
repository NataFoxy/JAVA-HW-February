import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        printNumbers(100);
        System.out.println(sumOfNumbers(4));
        // попробуем сделать обычные вещи при помощи рекурсии

        System.out.println("*".repeat(10));
        int[] numbers = {7, 8, 9, 10, 11};
        printArray(numbers, 0);

        System.out.println("*".repeat(10));
        // доставучий почти бесконечный сканер
//        endlessScanner();

        System.out.println("*".repeat(10));
        // распечатать цифры числа
        // 6789 --> 9 8 7 6
        int x = 6;
        // 8 --> 8
        System.out.println(6789%10);
        System.out.println(x/10%10);
        System.out.println("*".repeat(10));
        printDigits(821392);

        System.out.println("*".repeat(10));
        // сумма цифр
        int result = sumOfDigits(128);
        System.out.println(result);
    }

    public static int sumOfDigits(int number) {
        if (number < 10) {
            return number;
        } else {
            return number % 10 + sumOfDigits(number / 10);
        }
    }
    public static void printDigits(int number){
        if (number < 10){
            System.out.println(number);
        } else {
            System.out.println(number%10);
            printDigits(number/10);
        }
    }
    public static void endlessScanner(){
        Scanner scanner = new Scanner(System.in);
        recScan(scanner);
    }

    public static void recScan(Scanner scanner){
        System.out.println("Есть ли еще вопросы про рекурсию?");
        String answer = scanner.nextLine();
        if(answer.equals("нет")){
            System.out.println("Базовый случай");
        } else{
            recScan(scanner);
        }
    }

    public static void printArray(int[] numbers, int n){
        if(n > numbers.length-1){
            // базовый случай
        } else {
            System.out.println(numbers[n]);
            printArray(numbers,n+1);
        }
    }




    // sumOfNumbers(0) --> 0
    // sumOfNumbers(1) --> 1 + sumOfNumber(1-1)
    // sumOfNumbers(2) --> 2 + sumOfNumbers(2-1)
    // sumOfNumbers(3) --> 3 + sumOfNumbers(3-1)
    public static int sumOfNumbers(int start){
        if (start == 0){
            return 0;
        } else {
            return start + sumOfNumbers(start-1);
        }
    }
    public static void printNumbers(int start){
        if(start == 0){
            System.out.println(0);
        } else {
            System.out.println(start);
            printNumbers(start-1);
        }
    }
    public static void recMethod(){
        recMethod();
        System.out.println("Недостижимый код");
    }

}