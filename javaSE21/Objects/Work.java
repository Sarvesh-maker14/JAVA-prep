package Objects;

import java.math.BigDecimal;

public class Work {
    public static void main(String[] args) {
        Product p1 =  new Product();
        p1.setPrice(1.99);
        BigDecimal price = p1.getPrice();
        System.out.println(price);
    }
}
