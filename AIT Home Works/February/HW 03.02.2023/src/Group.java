import java.util.List;

public class Group {
    private String nameOfGroup;
    private List<Student> studentList;

    public Group(String nameOfGroup, List<Student> studentList) {
        this.nameOfGroup = nameOfGroup;
        this.studentList = studentList;
    }

    public String getNameOfGroup() {
        return nameOfGroup;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    @Override
    public String toString() {
        return nameOfGroup + " " + studentList;
    }
}
