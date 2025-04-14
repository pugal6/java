package School;

public class ExecuteSchool {
    public static void main(String[] args) {

        School school = new School();

        Students stud1 = new Students("Arjun",1);
        Students stud2 = new Students("Bargav",2);
        Students stud3 = new Students("Christopher",3);
        Students stud4 = new Students("David",4);

        Teachers t1 = new Teachers("Nir", "Maths");
        Teachers t2 = new Teachers("Anbu", "Zoology");
        Teachers t3 = new Teachers("Britto", "Physics");
        Teachers t4 = new Teachers("Sub", "English");


        school.addTeacher(t1);
        school.addTeacher(t2);
        school.addTeacher(t3);
        school.addTeacher(t4);

        school.addStudent(stud1);
        school.addStudent(stud2);
        school.addStudent(stud3);
        school.addStudent(stud4);

        SchoolClass class1 = new SchoolClass("B1", t1);
        SchoolClass class2 = new SchoolClass("B2", t2);
        SchoolClass class3 = new SchoolClass("B3", t3);

        school.addClass(class1);
        school.addClass(class2);
        school.addClass(class3);

        class1.addStudent(stud1);
        class1.addStudent(stud2);
        class1.addStudent(stud3);
        class1.addStudent(stud4);

        System.out.println("Before Update:");
        System.out.println("Class Information: ");
        System.out.println();
        school.getClassInfo(class1);
        System.out.println();
        System.out.println("School Information: ");
        school.getSchoolInfo();

        class1.removeStudent(stud4);
        Teachers t5 = new Teachers("RV", "Sports");
        school.addTeacher(t5);
        class1.setTeacher(t5);
        System.out.println();

        System.out.println("After Update:");
        System.out.println("Class Information: ");
        school.getClassInfo(class1);
        System.out.println();
        System.out.println("School Information: ");
        school.getSchoolInfo();
        System.out.println();

        System.out.println("Student Info: " + stud1.getStudInfo());
    }
}
