package f_methodOverriding.ff_toStringMethod;
public class Main {
    public static void main(String[] args) {
        //toString() = Method inherited from the Object class (cosmic class).
        //Used to return a string representation of an object
        //by default, it returns a hash code as a unique identifier.
        //We will override it to return meaningful data
        Car car1 = new Car("Nissan", "Almera", 2007, "Silver");
        Car car2 = new Car("Mercedes", "Benz", 2011, "Brown");
        System.out.println(car1.toString());
        System.out.println(car2.toString());


    }
 }
