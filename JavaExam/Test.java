package JavaExam;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Test {
    public void updatePrice(Product product,double price){
        price = price * 2;
        product.price = product.price + price;

    }
    public static void main(String[] args){
        Product prt = new Product();
        prt.price = 200;
        double newPrice = 100;

        Test t = new Test();
        t.updatePrice(prt,newPrice);
        System.out.println(prt.price+" : "+newPrice);

        // String date = LocalDate.parse("2024-05-04").format(DateTimeFormatter.ISO_DATE_TIME);
         String date = LocalDateTime.parse("2024-05-04T00:00").format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(date);


        Short s1 = 200;
        Integer s2 = 400;
        Long s3 = (long)s1 + s2;
        System.out.println(s3);
        // String s4 = (String)(s3 * s2);

        //Using the private modifier is the main way that an object encapsulates itself and hide data from the outside world.
    }
}
