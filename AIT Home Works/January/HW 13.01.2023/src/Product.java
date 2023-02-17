public abstract class Product implements Comparable<Product> {
    private static int counter=0;
    private String name;
    private double price;
    private String vendorCode;
    private int id;

    @Override
    public int compareTo(Product p){
        return p.id-this.id; // сортируем в обратном порядке для наглядности...иначе this.id-p.id
    }


    public Product(String name, double price, String vendorCode) {
        this.name = name;
        this.price = price;
        this.vendorCode = vendorCode;
        this.id=++counter;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getVendorCode() {
        return vendorCode;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return String.format("%n %d %s %.2f %s", id, name, price, vendorCode);
    }
}
