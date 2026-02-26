package e_superClasses;

public class Person {
    String first;
    String last;
    Person(String first, String last) {
        this.first = first;
        this.last = last;
    }
    void showName() {
        System.out.println("First: " + this.first);
        System.out.println("Last: " + this.last);
    }
}
