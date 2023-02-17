public class Car {
    private String model;
    private String number;
    private int yearOfRelease;

    public Car(String model, String number, int yearOfRelease) {
        this.model = model;
        this.number = number;
        this.yearOfRelease = yearOfRelease;
    }

    public String getModel() {
        return model;
    }

    public String getNumber() {
        return number;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car car)) return false;

        if (getYearOfRelease() != car.getYearOfRelease()) return false;
        if (getModel() != null ? !getModel().equals(car.getModel()) : car.getModel() != null) return false;
        return getNumber() != null ? getNumber().equals(car.getNumber()) : car.getNumber() == null;
    }

    @Override
    public int hashCode() {
        int result = getModel() != null ? getModel().hashCode() : 0;
        result = 31 * result + (getNumber() != null ? getNumber().hashCode() : 0);
        result = 31 * result + getYearOfRelease();
        return result;
    }
}
