//those properties that are not dependent on the objects are called static properties

//static matlab i can use the method whithout creating instnace of the class

//inside a static method we cannot use anything which is not static

package staticKeyWord;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;//

    static void message(){
        System.out.println("hi");
        // System.out.println(this.age);//cannot use non-static stuff
    }

    public Human(int age,String name,int salary, boolean married){
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population = population + 1;
    }

   
    










}
