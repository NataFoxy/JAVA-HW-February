import java.util.List;

public class Lesson {
    private int num;
    private String theme;
    private List<Student> studentList;

    public Lesson(int num, String theme, List<Student> studentList) {
        this.num = num;
        this.theme = theme;
        this.studentList = studentList;
    }

    public int getNum() {
        return num;
    }

    public String getTheme() {
        return theme;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    @Override
    public String toString() {
        return  "Lesson: " + num + " Theme: " + theme + " " + studentList;
    }
}
