public class Employee {
    private String name;
    private String job_title;
    private double salary;

    public String getName() {
        return name;
    }

    public String getJob_title() {
        return job_title;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setJob_title(String job_title) {
        this.job_title = job_title;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(String name, String job_title, double salary) {
        this.name = name;
        this.job_title = job_title;
        this.salary = salary;
    }

    public void raiseSalary(double percentage) {
        salary = salary + salary * percentage / 100;
    }

    public void dispEmpDetails() {
        System.out.println("Employee name: " + name);
        System.out.println("Job Title: " + job_title);
        System.out.println("Salary: " + salary);
    }
}

class ExecuteEmp {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Michael", "Regional Manager", 80000.00);
        Employee emp2 = new Employee("Jim", "Accountant", 50000.00);
        Employee emp3 = new Employee("Dwight", "Asst Regional Manager", 60000.00);

        emp1.dispEmpDetails();
        System.out.println();

        System.out.println(emp2.getName() + "'s" + " salary before update: " + emp2.getSalary());
        emp2.raiseSalary(10.00);
        System.out.println(emp2.getName() + "'s" + " salary after update: " + emp2.getSalary());
        System.out.println();

        System.out.println(emp3.getName() + " job title: " + emp3.getJob_title());
        emp3.setJob_title("Asst To The Regional Manager");
        System.out.println("After update: " + emp3.getJob_title());
    }
}