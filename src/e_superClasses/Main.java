package e_superClasses;

public class Main {
    static void main(String[] args) {
        //super - Refers to the parent class (subclass <- superclass)
        //      Used in constructors and method overriding
        //      Calls the parent constructor to initialize attributes
        Person person = new Person("Tom", "Riddle");
        person.showName();
        Student student = new Student("Harry", "Potter", 3.25);
        student.showGpa();

        Employee employee = new Employee("Rubeus", "Hagrid", 500000);
        employee.showSalary();
        employee.showName();
    }
}
