package Objects;

import java.math.BigDecimal;
import java.time.LocalTime;

public final class Drink extends Product {
    
    public Drink(int id, String name, BigDecimal price, Rating rating){
        super(id, name, price, rating);
    }

    @Override
    public BigDecimal getDiscount(BigDecimal discount) {
        LocalTime now = LocalTime.now();
        return (now.isAfter(LocalTime.of(17,30))&&now.isBefore(LocalTime.of(18,30)))?super.getDiscount():BigDecimal.ZERO;
    }

    
}
