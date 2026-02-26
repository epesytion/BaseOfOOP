package h_interfaces;
//to inherit interface, we write 'implements' keyword
public class Hawk implements Predator{
    @Override
    public void hunt(){
        System.out.println("Hawk is hunting");
    }
}
