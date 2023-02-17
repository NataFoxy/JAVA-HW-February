public class Main {
    public static void main(String[] args)  {

        Programmer p = new Programmer("Jack");
        p.setBusy();

        try {
            System.out.println(p.doWork("asdfghjkl"));
        } catch (ProgrammerBusyException e){
            System.out.println("Программер занят!");
        } catch (ProgrammerUnavailableNowException e){
            System.out.println("Программер не доступен");
        }

        //p.doWork("qwertyuio"); // if unchecked exception - ok


    }

}