package Objects;


import java.math.BigDecimal;
import java.text.NumberFormat;
// import static Math.random;
import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Locale;
import java.util.ResourceBundle;

public class Shop {
   public static void main(String[] args) {
   //  new Product();
   //  Product p1 = new Product();
   //  Product p2 = new Product();
   //  // Product p3 = new Product();
   //  Product p3 = p2;

   //  p1.setName("Tea");
   //  p2.setName("cake");

   //  System.out.println(p1.getName());
   //  System.out.println(p2.getName());
   //  System.out.println(p3.getName());

   //  // p1.name = "Coffee";

   //  BigDecimal percentage = BigDecimal.valueOf(0.2);
   //  final BigDecimal amount = p1.getDiscount(percentage);
   //  System.out.println(amount);

   // Product.setDefaultExpiryPeriod(4);

   // Product p1 = new Product();
   // Product p2 = new Product();
   
   // p1.setDefaultExpiryPeriod(2);
   // p2.getExpiryPeriod();

   // Product p3 = new Product();
   // Product.getExpiryPeriod();

   // p1.getName();

   // System.out.println(p1.getExpiryPeriod());
   // System.out.println(p2.getExpiryPeriod());
   // System.out.println(p3.getExpiryPeriod());
   // System.out.println(Product.getExpiryPeriod());


   // Math.round(1.99);
   // double value = Math.random();
   // BigDecimal.valueOf(1.99);
   // LocalDateTime.now();
   // ZoneId.of("Europe/London");
   // ResourceBundle.getBundle("message", Locale.UK);
   // NumberFormat.getCurrencyInstance(Locale.UK);
   // System.out.println("Hello");

   // Product p1 = new Product();
   // p1.setName("Tea");
   // p1.setPrice(BigDecimal.valueOf(1.99));

   // System.out.println(p1.getId());
   // System.out.println(p1.getPrice());
   // System.out.println(p1.getDiscount());

      // Product p = new Product();
      // Product p2 = new Product("Water");

      
      // p.setPrice(BigDecimal.valueOf(1.99));
      // p.setPrice(BigDecimal.valueOf(1.99),BigDecimal.valueOf(1.99));
      // p.setFiscalDetails(1.99);
      // p.setFiscalDetails(1.99,0.9,0.1);
      // p.setFiscalDetails(1.99,0.9);



      // System.out.println(p.getDiscount());
      // System.out.println(p.getPrice());
      // System.out.println(p2.getName());


      // Product p1 = new Product("Coffee",1.99,Condition.WARM);
      // System.out.println(p1.serve());

      // Product p1 = new Product(101,"Tea",BigDecimal.valueOf(1.99));
      Product p2 = new Drink(101,"Tea",BigDecimal.valueOf(1.99),Rating.FOUR_STAR);
      // Product p3 = new Product(103,"Cake",BigDecimal.valueOf(1.99),Rating.FIVE_STAR);
      // Product p4 = new Product();

      Product p5 = new Food(103,"Cake",BigDecimal.valueOf(1.99),Rating.FIVE_STAR,LocalDate.now().plusDays(2));

      // Product p6 = new Product(103,"Chocolate",BigDecimal.valueOf(1.99),Rating.FIVE_STAR);
      Product p7 = new Food(103,"Chocolate",BigDecimal.valueOf(1.99),Rating.FIVE_STAR,LocalDate.now().plusDays(2));
      // Product p5 = p3.applyRating(Rating.THREE_STAR);
      // System.out.println(p1.getDiscount());
      // System.out.println(p1.getPrice());
      // System.out.println(p1.getName());
      // System.out.println(p1.getRating().getStars());

      // System.out.println(p2.getRating().getStars());

      // System.out.println(p3.getRating().getStars());

      // System.out.println(p5.getRating().getStars());


      // System.out.println(p2.getDiscount());
      // System.out.println(p2.getPrice());
      // System.out.println(p2.getName());
      // System.out.println(p2.getRating().getStars());


      // System.out.println(p5.getDiscount());
      // System.out.println(p5.getPrice());
      // System.out.println(p5.getName());
      // System.out.println(p5.getRating().getStars());

      // System.out.println(p1);
      // System.out.println(p2);
      // System.out.println(p3);
      // System.out.println(p4);
      // System.out.println(p5);
      // System.out.println(p6.equals(p7));

   



   }

}
