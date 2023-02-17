//Дан список банковских транзакций (Account debit, Account credit, amount),
// класс Account(IBAN, Person) - банковский счет.
// Необходимо реализовать метод который сортирует транзакции
// по сумме (по возрастанию, по убыванию),
// по номеру счета дебита,
// по номеру счета кредита,
//по имени персона в счете по дебету,
// по имени персона в счете по кредиту

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Deque;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Account a1 = new Account("DE01", new Person("Jason"));
        Account a2 = new Account("DE02", new Person("Olive"));
        Account a3 = new Account("DE03", new Person("Liam"));
        Account a4 = new Account("DE04", new Person("Eve"));

        List<Transaction> transactions = new ArrayList<>();
        transactions.add(new Transaction(a1, a4, 150.0));
        transactions.add(new Transaction(a2, a3, 100.0));
        transactions.add(new Transaction(a4, a3, 200.0));
        transactions.add(new Transaction(a3, a1, 80.0));

        System.out.println(transactions);

        System.out.println(


    }

    public static List<Transaction> sortByAmount (List<Transaction> list, Comparator<Transaction> comparator){
        List<Transaction> result = new ArrayList<>(list);
        result.sort(comparator);
        return result;
    }
}