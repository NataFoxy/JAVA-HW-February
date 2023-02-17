package SecondTusk;

import java.util.Comparator;

public class ComparatorByHomeWork implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        int hw = o2.getHwCount()-o1.getHwCount();
        return hw==0 ? o1.getName().compareTo(o2.getName()) : hw;
    }
}
