public class Dressing extends Food{
    private String title;


    public Dressing(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "dressing" + "\'" + title + "\'";
    }
}
