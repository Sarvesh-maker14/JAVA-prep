package abstractKeyword;

public class Daughter extends Parent{

    public Daughter(int age) {
        super(age);
    }

    @Override
    void career(String name) {
        System.out.println(name + "Daughter" );
    }

    @Override
    void partner(String name, int age) {
        System.out.println(name + " " + age + "Daughter");
        
    }

    
}