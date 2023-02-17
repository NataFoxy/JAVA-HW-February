public class Car {
    private String model;
    private int year;
    private int mileage;
    private double price;

    public Car(String model, int year, int mileage, double price) {
        this.model = model;
        this.year = year;
        this.mileage = mileage;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getMileage() {
        return mileage;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", mileage=" + mileage +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car car)) return false;

        if (getYear() != car.getYear()) return false;
        if (getMileage() != car.getMileage()) return false;
        if (Double.compare(car.getPrice(), getPrice()) != 0) return false;
        return getModel() != null ? getModel().equals(car.getModel()) : car.getModel() == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getModel() != null ? getModel().hashCode() : 0;
        result = 31 * result + getYear();
        result = 31 * result + getMileage();
        temp = Double.doubleToLongBits(getPrice());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
