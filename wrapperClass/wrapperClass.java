package wrapperClass;

public class wrapperClass {

    public static void main(String[] args) {


    // Integer wrappedInt = new Integer(2);

    // // char --> character --> known as autoboxing  
    // char value = 'a';
    // Character wrappedChar = value;

    // //unboxing -->  character --> char
    // char newVal = wrappedChar;

    // String sum = "123"; 
    // int mySum = Integer.parseInt(sum);// string --> int 

    // Integer phoneNo = 44281234; 
    // Long phoneNo1 = phoneNo.longValue(); // Converts Integer into a Long value

    // Character alphaObj = new Character('A');
    // Character digitObj = new Character('5');

    // boolean result1 = Character.isDigit(digitObj); // Output :- true

    // System.out.println(result1);
		
    // boolean result2 = Character.isUpperCase(alphaObj); // Output :- true

    // System.out.println(result2);
		
    // String val = alphaObj.toString(); // val = "A"
		
    // char beta = alphaObj.charValue(); // beta = 'A'
    // char c = Character.toLowerCase('B'); // c = 'b';

    // int result11 = Character.compare('A', 'b');
    // System.out.println(result11); //-33
	    
    // Character anotherCharacter = new Character('b');
    // int result22 = alphaObj.compareTo(anotherCharacter);
    // System.out.println(result22); //-33
    
    // char ch1 = 'a'; 
    // Character z1 = ch1; 
    // System.out.println(z1); //concept of Boxing

    // Integer ch2=10;
    // int z2=ch2;
    // System.out.println(z2); //concept of UnBoxing
    
    
    // System.out.println("****************************************");
    // // Type casting cannot be used to convert any wrapper type to another
    // // Long phoneNoLong = (Long) new Integer(44281234);	// Will give compilation error
    
    // // We can make use of methods like intValue(), byteValue(), floatValue(), etc.
    // Integer phoneNo = 44281234;
    // Long phoneNoLong = phoneNo.longValue();
    // System.out.println("Integer to Long: " + phoneNoLong);
    
    // System.out.println("****************************************");
    // // Wrappers can be used to convert Integer to numeric String data type by using toString() method
    // Integer my = 100;
    // String myStr = my.toString();
    // System.out.println(myStr.length());
    
    // System.out.println("****************************************");
    // // Wrappers can be used to convert numeric strings to numeric data types
    // double numDouble = Double.parseDouble("123.45");
    // System.out.println("String to double: " + numDouble);
    
    // System.out.println("****************************************");
    // // Wrappers can be used to convert an Integer to Binary String by using toBinaryString() method
    // System.out.println("Integer 5 as binary string: " + Integer.toBinaryString(5));

    // byte number=127;
	// Byte obj=number;
	// int output = obj.compareTo((byte) 127);
	// System.out.println(obj+" "+output);

    // Integer x = 100;
    // Integer y = 100;
    // System.out.println(x == y);//true --> within the cached range (-128 to 127)
    // x = 128;
    // y = 128;
    // System.out.println(x == y);//false --> outside the cached range (-128 to 127)
    // System.out.println(x);
    // System.out.println(y);
    // }
    
    // char test[] = {'a', 'A' , '5'};
    // System.out.println(Character.isDigit(test[2]));
    // System.out.println(Character.isUpperCase(test[1]));

        // int a  = 42;
        // Integer b = Integer.valueOf(a);
        // int c = b.intValue();
        // b = a;
        // c = b;
        // System.out.println(c);

       
    }




}
