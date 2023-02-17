public class Account {

    private String iban;
    private Person person;

    public Account(String iban, Person person) {
        this.iban = iban;
        this.person = person;
    }

    public String getIban() {
        return iban;
    }

    public Person getPerson() {
        return person;
    }

    @Override
    public String toString() {
        return "IBAN: " + iban + " Account owner: " + person;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Account account)) return false;

        if (getIban() != null ? !getIban().equals(account.getIban()) : account.getIban() != null) return false;
        return getPerson() != null ? getPerson().equals(account.getPerson()) : account.getPerson() == null;
    }

    @Override
    public int hashCode() {
        int result = getIban() != null ? getIban().hashCode() : 0;
        result = 31 * result + (getPerson() != null ? getPerson().hashCode() : 0);
        return result;
    }
}
