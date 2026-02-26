package e_superClasses;

public class Student extends Person {

    double gpa;
    Student(String first, String last, double gpa) {
        super(first, last); //Calling super constructor (constructor of 'Person' class)
        this.gpa = gpa;
    }

    void showGpa() {
        System.out.println(super.first + " " + super.last  + " " + gpa);
    }
}
