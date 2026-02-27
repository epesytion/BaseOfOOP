package j_relationships.composition;

public class Car {
    public String model;
    int year;
    Engine engine;
    //2.
    Car(String model, int year, String engineType) {
        this.model = model;
        this.year = year;
        this.engine = new Engine(engineType); //here we reference to the constructor in Engine class and pass type
    }

    public String getEngine() {
        return engine.type;
    }

    //6
    void startCar(){
        engine.startEngine(); //since we wanna start car, we must start engine
        System.out.println("Car is running");
    }
}
