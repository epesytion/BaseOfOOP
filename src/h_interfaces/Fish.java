package h_interfaces;

public class Fish implements Prey, Predator{ //we must define interfaces' methods
    @Override
    public void flee(){
        System.out.println("Fish is swimming away from bigger fish");
    }

    @Override
    public void hunt(){
        System.out.println("Fish is hunting smaller fish");
    }
}

