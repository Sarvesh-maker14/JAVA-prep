package abstractKeyword;

public class Son extends Parent {

    public Son(int age) {
        super(age);
    }

    @Override
    void career(String name) {
        System.out.println(name + "Son");
    }

    @Override
    void partner(String name, int age) {
        System.out.println(name + " " + age + "Son");
    }
    
}
