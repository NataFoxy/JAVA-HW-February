//В программе задан список Person{ String fName, String lName, String email, String
//phone, Address address}. Address{String postcode, String city, String street, String
//house}
//Реализовать следующие функции:
//-получить список всех ФИО
//-получить список всех e-mail
//-получить список всех телефонов
//-получить список всех адресов в виде строки адреса
//
//Естественно, все вышеперечисленные функции может и должен реализовать
//один метод, в который в качестве параметра должен приходить список Person и
//реализация необходимого способа обработки.

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Ivan", "Ivanov", "IvIv@.mail.com", "+49123456",
                    new Address("10238", "Berlin", "Sonnenallee", "4")));
        persons.add(new Person("Petr", "Petrov", "PP@.mail.com", "+49654321",
                new Address("10145", "Dresden", "Karl-Marx-Str.", "132")));
        persons.add(new Person("Billy", "Jane", "Billy@.mail.com", "+49654789",
                new Address("11308", "Bautzen", "Fridrich-str", "17")));


        System.out.println(persons);

        System.out.println("---------------------Name and Surname--------------------------");

        System.out.println(namesList(persons));

        System.out.println("---------------------E-Mails--------------------------");
        System.out.println(emailsList(persons));

        System.out.println("---------------------Phones--------------------------");
        System.out.println(phonesList(persons));

        System.out.println("---------------------Addresses--------------------------");
        System.out.println(addressesList(persons));

        GetInfoFromListFunction nameList = (p) -> {
            List<String> result = new ArrayList<>();
            return String.valueOf(result.add(p.getfName() + " " + p.getlName()));};





    }


    public static List<String> namesList (List<Person> list){
        List<String> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
           result.add(list.get(i).getfName() + " " + list.get(i).getlName());
        }
        return result;
    }

    public static List<String> emailsList (List<Person> list){
        List<String> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            result.add(list.get(i).getEmail());
        }
        return result;
    }

    public static List<String> phonesList (List<Person> list){
        List<String> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            result.add(list.get(i).getPhone());
        }
        return result;
    }

    public static List<String> addressesList (List<Person> list){
        List<String> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            result.add(
                    list.get(i).getAddress().getCity() + ", "
                            + list.get(i).getAddress().getStreet() + " "
                            + list.get(i).getAddress().getHouse() + ", "
                            + list.get(i).getAddress().getPostcode() + ";");
        }
        return result;
    }


}