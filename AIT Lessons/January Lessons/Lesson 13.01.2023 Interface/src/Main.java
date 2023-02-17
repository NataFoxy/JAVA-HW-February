public class Main {
    public static void main(String[] args) {

        MailDeliveryService [] services = {new DHL(), new Email(), new Owl()};

        MenuSelectMailService menu =new MenuSelectMailService(services);
        MailDeliveryService mailDeliveryService = menu.select();
        if (mailDeliveryService!=null){
            Sender.send(mailDeliveryService);
        }

    }
}