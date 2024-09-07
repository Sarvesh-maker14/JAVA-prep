package Objects;

import java.math.BigDecimal;
import java.time.LocalDate;

public final class Food extends Product {
    private LocalDate bestBefore;

    public LocalDate getBestBefore() {
        return bestBefore;
    }

    public Food(int id, String name, BigDecimal price, Rating rating, LocalDate bestBefore) {
        super(id, name, price, rating);
        this.bestBefore = bestBefore;
    }

    @Override
    public BigDecimal getDiscount(BigDecimal discount) {
       
        return (bestBefore.isEqual(LocalDate.now()))?super.getDiscount():BigDecimal.ZERO;
    }

    
    

}
