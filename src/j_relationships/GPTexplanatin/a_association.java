package j_relationships.GPTexplanatin;
public class a_association {
    //General relationship where one class uses or knows about other class.
    // * No strong ownership
    // * Objects exist independently
    public static class Teacher{
        String name;
    }
    public static class Student{
        Teacher teacher;
        //Student has reference to Teacher
    }
}
