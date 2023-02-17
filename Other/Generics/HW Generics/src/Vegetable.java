public class Vegetable extends Food{
    private String title;


    public Vegetable(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "vegetable"+ "\'" + title + "\'";
    }
}
