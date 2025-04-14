package School;

public class Students {
    private String name;
    private int rollno;

    public Students(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getStudInfo() {
        return "Name: " + name + ", Roll No: " + rollno;
    }


}
