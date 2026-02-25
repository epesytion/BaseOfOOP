package a_Constructors;

public class Student {
    String name;
    float age;
    double gpa;
    boolean isEnrolled;

    //1.
    //you can easily pass arguments to class by constructors
    //Constructor's name must be same as class's name

    Student(String name, float age, double gpa, boolean isEnrolled) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.isEnrolled = isEnrolled;
    }
    //go to main class
}
