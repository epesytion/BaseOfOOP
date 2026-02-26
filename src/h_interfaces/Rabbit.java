package h_interfaces;
//to inherit interface, we write 'implements' keyword
public class Rabbit implements Prey{ //as with abstract classes, we must declare the method of interface
    @Override
    public void flee() {
        System.out.println("Rabbit is running away");
    }
}
