import java.util.List;

public class Main {
    public static void main(String[] args)  {

        Programmer p1 = new Programmer("Jack");
        Programmer p2 = new Programmer("John");
        p1.setBusy();
        p2.setNotAvailable();


        TeamLead teamLead = new TeamLead("Anna", List.of(p1,p2));
        teamLead.setNotAvailable();

        try {
            System.out.println(teamLead.doTask("qwertyuio"));
        } catch (AllProgrammersAreBusyNowException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getReasons());
        } catch (TeamLeadUnavailableNowException e){

            System.out.println("Почему TeamLead не на месте!?");
        }


    }

}