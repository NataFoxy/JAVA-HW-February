package SecondTusk;

public class Student {
    private String name;
    private int hwCount;

    public Student(String name, int hwCount) {
        this.name = name;
        this.hwCount = hwCount;
    }

    @Override
    public String toString() {
        return name  + hwCount;
    }

    public String getName() {
        return name;
    }

    public int getHwCount() {
        return hwCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;

        return getName() != null ? getName().equals(student.getName()) : student.getName() == null;
    }

    @Override
    public int hashCode() {
        return getName() != null ? getName().hashCode() : 0;
    }
}
