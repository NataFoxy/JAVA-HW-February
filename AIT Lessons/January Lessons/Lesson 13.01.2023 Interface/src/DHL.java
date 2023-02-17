public class DHL implements MailDeliveryService{
    @Override
    public void sendMail() {
        System.out.println("Отправили по почте через DHL");
    }

    @Override
    public String name() {
        return "DHL";
    }
}
