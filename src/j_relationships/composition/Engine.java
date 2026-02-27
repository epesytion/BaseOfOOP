package j_relationships.composition;

public class Engine {
    String type; //We define the type of engine (V6, V8, etc.)
    Engine(String type) { //constructor for Engine class.
        this.type = type;
    };

    //5.
    void startEngine(){
        System.out.println(this.type + " engine started");
    }
    //6. and for car
}
