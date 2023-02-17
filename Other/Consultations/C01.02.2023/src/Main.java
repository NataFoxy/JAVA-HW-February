import java.util.Comparator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {


        TreeSet<Film> films = new TreeSet<>(new Comparator<Film>() {
            @Override
            public int compare(Film o1, Film o2) {
                return Integer.compare(o1.getYear(), o2.getYear());
            }
        }.thenComparing(
                new Comparator<Film>() {
                    @Override
                    public int compare(Film o1, Film o2) {
                        return o1.getTitle().compareTo(o2.getTitle());
                    }
                }
        ));
        films.add(new Comedy("Java house", 2023));
        films.add(new Documentary("Nigerian tigers", 2020));
        films.add(new Comedy("Home alone", 2023));
        films.add(new Documentary("Custo", 2020));
        films.add(new Documentary("Paper", 2019));
        films.add(new Documentary("Old people in 2016", 2016));
        films.add(new Documentary("Old people in 2016", 2016));

        System.out.println(films);

        Set<Film> result = films.subSet(new Comedy("", 2019), false, new Comedy("", 2023), true);
        System.out.println(result);

    }
}