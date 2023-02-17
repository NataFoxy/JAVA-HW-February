public class User {
    private static int count=0;
    private int number;


    private String fName;
    private String lName;
    private int age;

    public User (String fName, String lName, int age){
        this.fName = fName;
        this.lName = lName;
        this.age = age;
        this.number=++count;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    @Override
    public String toString() {
        return number + ". " + fName + lName + "( " + age + " )";
    }
}

