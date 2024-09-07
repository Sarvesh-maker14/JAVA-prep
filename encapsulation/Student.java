package encapsulation;

public class Student {
     //attributes
     public int id;
     public int age;
     private String name;
 
     public int nos;
     private String gf;

     public String getName(){
        return this.name;
     }

     public int getAge(){
        return this.age;
     }

     public void setAge(int a){
        this.age = a;
     }
 
     //default constructor
     public Student(){
         System.out.println("Student ctor called");
     }
 
     //parameterised ctor
     public Student(int id,int age,String name,int nos,String gf){
         System.out.println("Student Parameterised ctor called");
         this.id = id;
         this.age = age;
         this.name = name;
         this.nos = nos;
         this.gf = gf;
     }
 
     //copy ctor
     public Student(Student srcobj){ //srcobj --> A
         System.out.println("Student copy ctor called");
         this.id = srcobj.id;
         this.age = srcobj.age;
         this.name = srcobj.name;
         this.nos = srcobj.nos;
     }
 
 
     //Methods / Behaviours
     public void study(){
         System.out.println(name + "Studying");
     }
 
     public void sleep(){
         System.out.println(name + "Sleeping");
     }
 
     public void bunk(){
         System.out.println(name + "Bunking");
     }

     private void gfChatting(){
        System.out.println("Private Info");
     }
}
