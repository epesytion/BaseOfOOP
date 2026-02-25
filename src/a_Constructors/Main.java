package a_Constructors;

public class Main {
    static void main(String[] args) {
        //Start in the 'Student' class


        //2. Now you can create object by passing values to parameters
        Student student1 = new Student("Abish", 18, 4, true);
        Student student2 = new Student("Margulan", (float) 1 /12, 0, false);

        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.gpa);
        System.out.println(student1.isEnrolled);

        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.gpa);
        System.out.println(student2.isEnrolled);
    }

}
