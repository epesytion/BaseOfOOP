package i_polymorhism.Interface_case;

public class Main {
    static void main(String[] args) {
        Car car = new Car();
        Bike bike = new Bike();
        Boat boat = new Boat();

        Vehicle_interface[] vehicles = {car, bike, boat};
        for(Vehicle_interface vehicle : vehicles){
            vehicle.go();
        }
    }
}
