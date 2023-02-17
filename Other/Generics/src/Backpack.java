public class Backpack <T extends Book> {

    private String brand;
    T content;

    public Backpack(String brand, T content) {
        this.brand = brand;
        this.content = content;
    }

//    public void print(){
//        System.out.println(content);
//    }


    @Override
    public String toString() {
        return "Backpack{" +
                "brand='" + brand + '\'' +
                ", content=" + content +
                '}';
    }
}
