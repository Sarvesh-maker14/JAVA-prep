package enumClass;

public class ShoppingCart {
    enum Category {
        MOBILE,TABLET,COMPUTER,LAPTOP
    }
    
    
        private double amount;
        private Category type;
        private double discount;
        ShoppingCart(double amount,Category type){
            this.amount=amount;
            this.type=type;
        }
        public double getAmount() {
            return amount;
        }
        public void setAmount(double amount) {
            this.amount = amount;
        }
        public double getDiscount() {
            return discount;
        }
        public void setDiscount(double discount) {
            this.discount = discount;
        }
    
        public Category getType() {
            return type;
        }
    
        public void checkDiscountApplicability(double amount,Category type)
        {
            if(amount>=30000){
                System.out.println("congratulations you are applicable for discount");
                this.applyDiscount(type);
            }
            else {
                
                System.out.println("Thank you for shopping, your bill amount is: " + this.getAmount());
            }
        }
        public void applyDiscount(Category type) {
            switch (type) {
                case MOBILE:
                    if (amount >= 30000.0) {
                        setDiscount(0.15); // 15% discount for MOBILE
                    } else {
                        getAmount();
                    }
                    break;
                case TABLET:
                    if (amount >= 35000.0) {
                        setDiscount(0.10); // 10% discount for TABLET
                    } else {
                        getAmount();
                    }
                    break;
                case LAPTOP:
                    if (amount >= 35000.0) {
                        setDiscount(0.08); // 8% discount for LAPTOP
                    } else {
                        getAmount();
                    }
                    break;
                case COMPUTER:
                    if (amount >= 50000.0) {
                        setDiscount(0.10); // 10% discount for DESKTOP
                    } else {
                        getAmount();
                    }
                    break;
                default:
                    setDiscount(0.07); // 7% general discount for other categories
            }
        }
    
    
    
    
    
        public static void main(String[] args) {
    		ShoppingCart shop=new ShoppingCart(20000.0,Category.COMPUTER);
    		shop.checkDiscountApplicability(shop.getAmount(),shop.getType());
        }
    
   
    
    
}
