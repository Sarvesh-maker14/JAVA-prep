package staticKeyWord;
//only inner classes can be static 


public class InnerClasses {

   static class Test {
        String Name;

        public Test(String Name){
            this.Name = Name;
        }
    }
    
    public static void main(String[] args) {
        Test a = new Test("Sarvesh");
        Test b = new Test("harshit");
        Test c = new Test("suppu");

         System.out.println(a.Name);
         System.out.println(b.Name);
         System.out.println(c.Name);
    }    
    
    
}
