package InterfacesTest;

public class Car implements  Engine,Brake{

    @Override
    public void acc() {
        System.out.println("acc");
        
    }

    @Override
    public void start() {
         System.out.println("start");
        
    }

    @Override
    public void stop() {
         System.out.println("stop");
        
    }

    @Override
    public void brake() {
       
         System.out.println("brake");
    }
    
}
