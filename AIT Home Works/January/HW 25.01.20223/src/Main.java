import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Transaction t1 = new Transaction(1,new Account("DE1"), new Account("DE2"),100);
        Transaction t2 = new Transaction(2, new Account("DE3"), new Account("DE5"),800);
        Transaction t3 = new Transaction(3, new Account("DE6"), new Account("DE7"),250);
        Transaction t4 = new Transaction(4, new Account("DE1"), new Account("DE8"),700);
        Transaction t5 = new Transaction(5, new Account("DE9"), new Account("DE4"),150);
        Transaction t6 = new Transaction(6, new Account("DE4"), new Account("DE8"),900);



        List<Transaction> transactionList = new ArrayList<>();
        transactionList.add(t1);
        transactionList.add(t2);
        transactionList.add(t3);
        transactionList.add(t1);
        transactionList.add(t4);
        transactionList.add(t5);
        transactionList.add(t2);
        transactionList.add(t6);
        transactionList.add(t1);



        System.out.println(transactionList);
        System.out.println(transactionList.get(0).hashCode());
        System.out.println(transactionList.get(3).hashCode());
//        System.out.println(transactionList.get(2));
//        System.out.println(Transaction.swap(transactionList.get(2)));


        System.out.println(Transaction.returnOverPay(transactionList));


//        Set<Transaction> transactionSet = new HashSet<>(transactionList);
//        System.out.println(transactionSet);




    }
}