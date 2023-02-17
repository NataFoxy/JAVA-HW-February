import java.util.Comparator;

public class Cat implements Comparable<Cat> {
    private double weight;
    private String name;

    public Cat(String name, double weight) {
        this.name = name;
        this.weight = weight;

    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Cat: " + name + "(" +weight + ")";

    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cat cat)) return false;

        if (Double.compare(cat.getWeight(), getWeight()) != 0) return false;
        return getName() != null ? getName().equals(cat.getName()) : cat.getName() == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(getWeight());
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        return result;
    }

    @Override
    public int compareTo(Cat o) {
        return 0;
    }
}
