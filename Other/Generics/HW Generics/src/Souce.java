public class Souce extends Food{
    private String title;


    public Souce(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "souce" + "\'" + title + "\'";
    }
}
