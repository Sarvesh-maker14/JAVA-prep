package enumClass;

public class Main {
    //Enumerations -->  group of named constants
    //comes from java.lang.Enum class
    // public enum enum_name { constant1, constant2, ..., constant n }


    //enum ka decleration should be outside the method
    //  public enum PizzaSize { SMALL, MEDIUM, LARGE };
    // public enum Test { A, B, C }
    public enum Enums
	{
	    FIRST, SECOND, THIRD;
	}

    // public static void checkTest(Test test) {
    //     switch(test) {
    // case A:
    //  System.out.println(Test.A.equals(Test.B));
    // case B:
    //  System.out.println(Test.B.equals(Test.B)); 
    // case C:
    //  System.out.println(Test.C == Test.C);
    //     }
    // }
    public static void main(String[] args) {
       
       // PizzaSize.values() --> return array of all values inside enum
       // ordinal() --> index of enum constants
        
        // for (PizzaSize psize : PizzaSize.values()) {
		// 	System.out.println(psize+" "+psize.ordinal());
		// }

        // checkTest(Test.A);

        

    }
    

    

}
