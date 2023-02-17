public class Main_check_also_Lesson_LinkedList {
    public static void main(String[] args) {

        int a=10;
        int b= 3;
        try{
            System.out.println(div(a,b));
        }
        catch (Exception e){
            System.out.println("на ноль делить нельзя!");
            e.printStackTrace();     //выводит содержимое объекта "е" - инфо об ошибке
        }




    }

    public static double div(int a, int b){

        double res;
        res=a/b;                   //не безопасный код
        return res;
        }

}

