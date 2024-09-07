package staticKeyWord;

public class Student {
    String name;  
     
    //static variable
    static String department;  
    static int rollCount=0;  
    
    //static block is used to initialize static variable
    static{
        System.out.println("Inside Static Block");
        department="CS";
    }
    
    //static method to change the value of static variable  
    static void change(){
        rollCount++;
    }
         
    //constructor to initialize the variable  
    Student(String studentName){  
        change();
        name = studentName;  
    }  

    //method to display values  
    void display(){
        System.out.println(rollCount+" "+name+" "+department);
    }
    	
    public static void main(String args[]){  
    	   
        Student student1 = new Student("Tom");  
        student1.display();
        Student student2 = new Student("Chris");  
        student2.display();  
        Student student3 = new Student("Morris");  
        student3.display(); 
        
         
               
        //We can change the value of static variable department as shown below
        //Display student4 object with ECE department 
        //Uncomment the code given below to perform the task
        /*StudentDetails student4 = new StudentDetails("Cherry");  
          StudentDetails.department="ECE";
          student4.display();*/
}  
}
