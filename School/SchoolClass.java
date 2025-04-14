package School;

import java.util.ArrayList;

public class SchoolClass {
    private String className;
    private Teachers teacher;
    private ArrayList<Students> students;

    public SchoolClass(String className, Teachers teacher) {
        this.className = className;
        this.teacher = teacher;
        this.students = new ArrayList<>();

    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getTeacher() {
        return teacher.getName();
    }

    public void setTeacher(Teachers teacher) {
        this.teacher = teacher;
    }

    public ArrayList<Students> getStudents() {
        return students;
    }

    public void addStudent(Students student) {
        students.add(student);
    }

    public void removeStudent(Students student) {
        students.remove(student);
    }


}
