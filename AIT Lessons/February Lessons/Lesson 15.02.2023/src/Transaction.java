public class Transaction implements Comparable{
    private Account debit;
    private Account credit;
    private double amount;

    public Transaction(Account debit, Account credit, double amount) {
        this.debit = debit;
        this.credit = credit;
        this.amount = amount;
    }

    public Account getDebit() {
        return debit;
    }

    public Account getCredit() {
        return credit;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Transaction: " + "from: " + debit + " to: " + credit + " amount: " + amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Transaction that)) return false;

        if (Double.compare(that.getAmount(), getAmount()) != 0) return false;
        if (getDebit() != null ? !getDebit().equals(that.getDebit()) : that.getDebit() != null) return false;
        return getCredit() != null ? getCredit().equals(that.getCredit()) : that.getCredit() == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getDebit() != null ? getDebit().hashCode() : 0;
        result = 31 * result + (getCredit() != null ? getCredit().hashCode() : 0);
        temp = Double.doubleToLongBits(getAmount());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
