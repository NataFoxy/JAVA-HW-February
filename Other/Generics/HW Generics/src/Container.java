public class Container <T extends Food & Eatable> {
    private String brand;
    private double volume;
    T content;

    public Container(String brand, double volume, T content) {
        this.brand = brand;
        this.volume = volume;
        this.content = content;
    }

    @Override
    public String toString() {
        return "Container{" +
                "brand: '" + brand + '\'' +
                ", volume: " + volume +
                ", content: " + content +
                '}';
    }
}
