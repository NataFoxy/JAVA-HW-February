public class BankAccountWithOwner {
    private String iban;
    private Person owner;

    public BankAccountWithOwner(String iban, Person owner) {
        this.iban = iban;
        this.owner = owner;
    }

    public String getIban() {
        return iban;
    }

    public Person getOwner() {
        return owner;
    }

    @Override
    public String toString() {
        return iban + "" + owner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BankAccountWithOwner that)) return false;

        return getIban().equals(that.getIban());
    }

    @Override
    public int hashCode() {
        return getIban().hashCode();
    }
}
