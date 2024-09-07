package Objects;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;
import java.math.RoundingMode;


public sealed abstract class Product permits Food,Drink {

    // public enum Condition(){
    //     HOT,WARM,COLD;
    // }
    

    private final int id;
    private final String name;
    private final BigDecimal price;
    private final String name1 = "Tea";
    private final BigDecimal price1 = BigDecimal.TEN;
    private BigDecimal discount = BigDecimal.ZERO;
    private BigDecimal tax;
    private Condition condition;
    private final Rating  rating;
    // private static Period defaultExpiryPeriod = Period.ofDays(3);

    // public Product(){

    // }

    public static int maxId = 0;

    {id = ++maxId;}

    // public Product(String name,double price,Condition condition){
    //     this(name);
    //     // this.price = BigDecimal.ZERO;
    //     this.condition = condition;
    // }


     public Product(int id, String name, BigDecimal price, Rating rating) {
        // this.id = id;
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    // public Product(){
    //     this(0,"no name",BigDecimal.ZERO);
    // }

    

    // @Override
    // public String toString() {
    //     return "Product [id=" + id + ", name=" + name + ", price=" + price + ", rating=" + rating  + "]";
    // }


    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
     
        if(obj instanceof Product product){
            return id == product.id && Objects.equals(name,product.name);
        }
        return false;
    }


    public Product(int id, String name, BigDecimal price) {
        this(id,name,price,Rating.NOT_RATED);
    }



    public Product(String name){
        this.name = name;
        this.price = BigDecimal.ZERO;
        this.rating = null;
    }

    private static Period defaultExpiryPeriod;

    static{
        defaultExpiryPeriod  = Period.ofDays(3);
    }

    public int getId(){
        return id;
    }


    private LocalDate bestBefore;

    public static void setDefaultExpiryPeriod(int days){
        defaultExpiryPeriod = Period.ofDays(days);
        // String name = this.name;
    }

    public static Period getExpiryPeriod(){
        return defaultExpiryPeriod;
    }


    public BigDecimal getDiscount(final BigDecimal discount){
        return price1.multiply(discount);
    }

    public static final BigDecimal DISCOUNT_RATE  = BigDecimal.valueOf(0.1);

    private void calculateTax(){
        tax = price.multiply(DISCOUNT_RATE);
    }




    // public void setName(String newName){
    //     this.name = newName;
    // }

    public String getName(){
        return name;
    }

    public BigDecimal getPrice(){
        return price;
    }


    // public void setPrice(double value){
    //     price  = BigDecimal.valueOf(value);
    // }

    // public void setPrice(final BigDecimal price){
    //     //price = BigDecimal.ONE;// to avoid this make the parameter as final
    //     this.price = price;
    //     calculateTax();
    // }

    // public void setPrice(Double price){
    //     this.price = BigDecimal.valueOf(price);
    // }


    // //overloading
    // public void setPrice(BigDecimal price,BigDecimal discount){
    //     this.price = price;
    //     this.discount = discount;
    // }


    // public void setFiscalDetails(double... values){
    //     switch(values.length){
    //         case 3:
    //             tax = BigDecimal.valueOf(values[2]);
    //         case 2:
    //             discount = BigDecimal.valueOf(values[1]);
    //         case 1:
    //             price = BigDecimal.valueOf(values[0]);
    //     }
    // }

    // public String serve(){
    //     String result;

    //     switch (condition) {
    //         case Condition.COLD:
    //             result = "It is cold";
    //             break;
    //         case Condition.HOT:
    //             result = "It is HOT";
    //             break;
    //         case Condition.WARM:
    //             result = "It is Warm";
    //             break;
    //         default:
    //             result = "None of the above";
    //     }

    //     return result;
    // }





    




    public BigDecimal getDiscount(){
        return price.multiply(DISCOUNT_RATE);
    }


    public Rating getRating() {
        return rating;
    }

    // public void someOperation(int param){
    //     var value1 = "Hello";
    //     var value2 = param;
    // }
    
    public Product applyRating(Rating newRating){
        return Product(id,name,price,newRating);
    }

    
}
