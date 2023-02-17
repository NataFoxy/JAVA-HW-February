//• Создать интерфейс MailDeliveryService с одним методом void sendMail().
//• Создайте класс DHL, который должен реализовать интерфейс MailDeliveryService.
// Способ отправки почты — напечатать что-то вроде: «Положи письмо в конверт, поставь марку, отправь».
//• Создайте класс Email, который должен реализовать интерфейс MailDeliveryService.
// Его способ отправки почты - напечатать что-то вроде: «Отправить по Интернету».
//• Создайте класс Owl, который должен реализовать интерфейс MailDeliveryService.
// Его способ отправки почты — напечатать что-то вроде: «Привет Гарри Поттер!»
//• Создайте класс Sender с методом send в нем. В качестве аргумента этот метод принимает MailDeliveryService
// и отправляет почту ( вызывает метод sendMail() )  с помощью данной службы.
//• В соответствие с выбором пользователя, создайте нужный объект  MailDeliveryService
// и с помощью  Sender  отправьте почту.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Выберете метод отправки: 1 - DHL / 2 - Email / 3 - Owl");

        if(sc.hasNextInt()) {
            int choice = sc.nextInt();
            Sender ss = new Sender();
            MailDeliveryService service = null;
            switch (choice) {
                case 1:
                    service = new DHL();
                    break;
                case 2:
                   service = new Email();
                    break;
                case 3:
                   service= new Owl();
                    break;
                default:
                    System.out.println("ОШИБКА! Попробуйте другой способ отправки");
                    break;
            }
            ss.send(service);
        }

        }

    }



