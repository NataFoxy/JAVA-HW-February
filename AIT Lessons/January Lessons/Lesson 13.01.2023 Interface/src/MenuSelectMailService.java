import java.util.Scanner;

public class MenuSelectMailService {
    private MailDeliveryService[] services;

    public MenuSelectMailService(MailDeliveryService[] services) {
        this.services = services;
    }

    public MailDeliveryService select(){
        System.out.println("Select service:");
        for (int i = 0; i < services.length; i++) {
            System.out.printf("%d. %s %n", i, services[i].name());
        }
        Scanner sc =new Scanner(System.in);
        int choice = sc.nextInt();
        if(choice<0 || choice>=services.length){
            return null;
        }
        else {
            return services[choice];
        }
    }


}
