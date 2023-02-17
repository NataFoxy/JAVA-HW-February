public abstract class Film {
    private String title;
    private int year;

    public Film(String title, int year) {
        this.title = title;
        this.year = year;
    }

//    public int compareTo(Film o){
//        if(this.year == o.year){
//            return title.compareTo(o.title);
//        }
//        return Integer.compare(this.year, o.year);
//    }

    @Override
    public String toString() {
        return "\n Film{" +
                "title='" + title + '\'' +
                ", year=" + year +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }
}
