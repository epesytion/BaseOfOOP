package e_superClasses;

public class Employee extends Person {
    double salary;
    Employee(String name, String surname, double salary) {
        super(name, surname);
        this.salary = salary;
    }

    void showSalary() {
        System.out.println(this.first + "'s salary: " + this.salary);
    }
}
