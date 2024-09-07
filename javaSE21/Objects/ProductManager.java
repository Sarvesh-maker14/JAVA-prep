package Objects;

import java.time.LocalDate;

public class ProductManager {

    private Product product;
    private Review review;
    
    public Product createProduct(int id,String name,BigDecimal price,Rating rating,LocalDate bestBefore){
       product = new Food(id, name, null, rating, bestBefore);
       return product;
    }

    public Product createProduct(int id,String name,BigDecimal price,Rating rating){
        product =  new Drink(id, name, null, rating);
        return product;
    }

    public Product reviewProduct(Product product,Rating rating,String comments){
        review = new Review(rating,comments);
        this.product = product.applyRating(rating);
        return this.product;
    }

        
    }
}
