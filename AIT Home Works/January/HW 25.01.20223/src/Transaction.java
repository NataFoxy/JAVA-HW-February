import java.util.*;
import java.util.Set;

public class Transaction {
    private long id;
    private Account debit;
    private Account credit;
    private double amount;

    public Transaction(long id, Account debit, Account credit, double amount) {
        this.id = id;
        this.debit = debit;
        this.credit = credit;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Transaction nr.: " + id + " from: " + debit + " to: " + credit + " amount: " + amount + "\n";

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Account getDebit() {
        return debit;
    }

    public void setDebit(Account debit) {
        this.debit = debit;
    }

    public Account getCredit() {
        return credit;
    }

    public void setCredit(Account credit) {
        this.credit = credit;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public static List<Transaction> returnOverPay(List<Transaction> list) {
        List<Transaction> tempL = new ArrayList<>();
        Set<Transaction> tempS = new HashSet<>();
        for (int i = 0; i < list.size(); i++) {
            if (!tempS.add(list.get(i))) {
                Transaction temp=list.get(i);
                tempL.add(new Transaction(temp.getId(), temp.getCredit(), (temp.getDebit()), temp.getAmount()));
            }
        }
        return tempL;
    }

    public static Transaction swap (Transaction tr){
        Transaction tempT = tr;
        Account temp = tempT.getCredit();
        tempT.setCredit(tempT.getDebit());
        tempT.setDebit(temp);

        return tempT;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Transaction that)) return false;

        if (getId() != that.getId()) return false;
        if (Double.compare(that.getAmount(), getAmount()) != 0) return false;
        if (getDebit() != null ? !getDebit().equals(that.getDebit()) : that.getDebit() != null) return false;
        return getCredit() != null ? getCredit().equals(that.getCredit()) : that.getCredit() == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = (int) (getId() ^ (getId() >>> 32));
        result = 31 * result + (getDebit() != null ? getDebit().hashCode() : 0);
        result = 31 * result + (getCredit() != null ? getCredit().hashCode() : 0);
        temp = Double.doubleToLongBits(getAmount());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}


