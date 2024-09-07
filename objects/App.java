package objects;

public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello World");
        // Student A = new Student();
        // A.id = 1;
        // A.age = 14;
        // A.name = "Steve";
        // System.out.println(A.name);
        // System.out.println(A.age);
        // System.out.println(A.id);

        // A.bunk();
        // A.study();
        // A.sleep();

        //Parametrised constructor
        Student A = new Student(1,12,"Rahul",3);

        //copy constructor
        Student B = new Student(A);
    }
}
