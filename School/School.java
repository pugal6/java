package School;

import java.util.ArrayList;

public class School {
    private ArrayList<Students> students;
    private ArrayList<Teachers> teachers;
    private ArrayList<SchoolClass> classes;

    public School() {
        this.students = new ArrayList<>();
        this.teachers = new ArrayList<>();
        this.classes = new ArrayList<>();
    }

    public void addStudent(Students student) {
        students.add(student);
    }

    public void removeStudent(Students student) {
        students.remove(student);
    }

    public void addTeacher(Teachers teacher) {
        teachers.add(teacher);
    }

    public void removeTeacher(Teachers teacher) {
        teachers.remove(teacher);
    }

    public void addClass(SchoolClass schoolClass) {
        classes.add(schoolClass);
    }

    public void removeClass(SchoolClass schoolClass) {
        classes.remove(schoolClass);
    }

    public ArrayList<SchoolClass> getClasses() {
        return classes;
    }

    public void getClassInfo(SchoolClass schoolClass) {
        System.out.println("ClassName: " + schoolClass.getClassName());
        System.out.println("Class Teacher: " + schoolClass.getTeacher());
        System.out.println("Class Strength: " + schoolClass.getStudents().size());
    }

    public void getSchoolInfo() {
        System.out.println("Number of Classes: " + classes.size());
        System.out.println("Number of Students: " + students.size());
        System.out.println("Number of Teachers: " + teachers.size());
    }
}
