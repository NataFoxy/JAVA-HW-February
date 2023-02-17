public class Email implements MailDeliveryService{
    @Override
    public void sendMail() {
        System.out.println("отпрвили E-Mail");
    }

    @Override
    public String name() {
        return "Email";
    }
}
