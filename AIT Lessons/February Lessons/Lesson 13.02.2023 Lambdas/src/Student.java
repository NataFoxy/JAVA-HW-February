public class Student {
    private String name;
    private int age;
    private int amountOfMissedLessons;

    public Student(String name, int age, int amountOfMissedLessons) {
        this.name = name;
        this.age = age;
        this.amountOfMissedLessons = amountOfMissedLessons;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getAmountOfMissedLessons() {
        return amountOfMissedLessons;
    }

    @Override
    public String toString() {
        return "Student: " + name + " (" + age + ") " + "missings: " + amountOfMissedLessons;
    }


}
