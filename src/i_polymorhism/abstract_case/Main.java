package i_polymorhism.abstract_case;

public class Main {
    static void main(String[] args) {
        // Polymorphism = "poly" - many
        //                "morph" - shape
        //                Objects can identify as other objects.
        //                Objects can be treated as objects of a common superclass
        //A dog identify as a dog, as an animal, as organism, and also as object

        //create abstract superclass "vehicle" and classes-types of vehicle
        Car car = new Car();
        Bike bike = new Bike();
        Boat boat = new Boat();


        car.go();
        bike.go();
        boat.go();

        System.out.println();

        //Let's try to put everything in array of objects.
        //We'll try to use Car datatype

        /*
        Car[] cars = {car, bike, boat};
        //We get the error that bike and car, boat car are incompatible type.
        //Bike and Boat cannot be converted to Car datatype
        //Same as with others.
        */

        //However, we can access to superclass Vehicle that is the common for every child
        Vehicle[] vehicles = {car, bike, boat}; //NICE!!!
        //car identify as Car but also as Vehicle
        //bike identify as Bike but also as Vehicle
        //boat identify as Boat but also as Vehicle

        for(Vehicle v : vehicles){
            v.go();
        }

        //Also polymorphism can be achieved with interfaces


    }
}
