package staticKeyWord;

public class Main {
    public static void main(String[] args) {
        Human alpha = new Human(25,"alex",4500000,false);
         Human beta = new Human(25,"steve",4500000,false);


         System.out.println(alpha.population);
         System.err.println(beta.population);
    }

    static void fun(){
    //  greeting();//cannot access non -static without refrencing their instance
    
        Main obj = new Main();
        obj.greeting();
    }

    void greeting(){
        System.out.println("hi");
    }
}
