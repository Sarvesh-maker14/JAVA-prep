package wrapperClass;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

public class wrapperClassExercise {
    public static void main(String[] args) {
        
        // int a  = 42;
        // Integer b = Integer.valueOf(a);
        // int c = b.intValue();
        // b = a; // Integer = int (auto boxing )
        // c = b;
        // System.out.println(c);


        // String d = "12.25";
        // Float e = Float.valueOf(d);
        // System.out.println(e);
        // float f = Float.parseFloat(d);

        // String g = String.valueOf(a);
        // Short.MIN_VALUE;
        // Short.MAX_VALUE;

        ////////BigDecimal Class//////////////////////////////
        //handling decimal numbers that require exact precision//

        // BigDecimal price = BigDecimal.valueOf(12.99);
        // BigDecimal taxRate = BigDecimal.valueOf(0.2);
        // BigDecimal tax = price.multiply(taxRate);
        // System.out.println(tax);

        // price = price.add(tax).setScale(2,RoundingMode.HALF_UP);
        // System.out.println(price);

      
        // System.out.println(price.add(tax));


        //method chaining 
        String s1 = "Hello";
        String s2 = s1.concat("World").substring(3,6);
        System.out.println(s2);

        



    }
}
