public class Person {
    private String fName;
    private String lName;
    private int age;

    public Person (String lName, String fName, int age){
        this.lName=lName;
        this.fName=fName;
        this.age=age;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return fName + ' ' + lName + ' ' + "( " + age + " )";
    }
}
