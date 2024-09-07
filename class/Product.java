// java we can'nt access the address
// classes --> creating your own data type (template)
                         

            //                class(template)
            //                  |
            //     _____________|____________________
            //     |                                |
            //   object 1                        object 2(instance of a class)

// Basic basic1; --> decleration

//new --> keyword dynamically allocates memeory at run time and returns a reference to it

//dynamic memory allocation --> this happens when the program is runnning

// Basic   basic1   =   new    Basic();                  creating a new object
// |compile time|      |happens at run time|


//compile time --> fiding error and byte code ---> machine code
//run time --> when the program is running



//Product p1 = new Product();  this --> this.name ===== p1.name

///////////////////////////////////////////////////////////////////////
//constructor overloading (polymorphism)
// //public class MyClass {
//     private int value1;
//     private int value2;

//     // Constructor with no parameters
//     public MyClass() {
//         value1 = 0;
//         value2 = 0;
//     }

//     // Constructor with one parameter
//     public MyClass(int v1) {
//         value1 = v1;
//         value2 = 0;
//     }

//     // Constructor with two parameters
//     public MyClass(int v1, int v2) {
//         value1 = v1;
//         value2 = v2;
//     }

  
// }


//Integer num = 45; --> wrapper class


//-----------------------------------------------------------------------------------------
//final --> kisi class ko unchanged banana hai 
// Final int increase = 2%; --> we can'nt modify the variable
//final variable has to be initialized while declaring
//only for primitive datatypes

//exceptions

//objects can be modified
//final student A = new student();
//A.name = "student"

//sarvesh = new object --> this cannot be done


//--------------------------------------------------------------------------------
// memory is freed from the heap using grabage collector


//finalize --> we do a work when the garbage collector will destroy the object
//  protected void finalize() throws Throwable {
//     system.out.println("object is destroyed");
//  }

public class Product {
    private int productId;
    private float price;
    private int stock;

    public void displayDetails() {
        System.out.println("Product Id: " + this.productId);
        System.out.println("Product Price: " + price);
    }
    
    public void displayDetails(int discountPercentage) {
    	System.out.println("Product discounted price: "+ this.getPriceAfterDiscount(discountPercentage));
    	if(this.stock>0)
    		 System.out.println("Stock Available");
    	else System.out.println("Stock not available");    	
    }

    public float getPriceAfterDiscount(int discountPercentage) {
        float discountedPrice = price - (price * discountPercentage / 100);
        return discountedPrice;
    }

    public int getProductId() {
        return productId;
    }
    public void setProductId(int productId) {
        this.productId = productId;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }

    public static void main(String[] args) {
		Product p1 = new Product();//declaring new object
		p1.setProductId(1001);//setting attributes with values
		p1.setPrice(400);
		p1.setStock(6);
		
		Product p2 = new Product();
		p2.setProductId(1005);
		p2.setPrice(500);
		p2.setStock(4);
		
		Product p3 = new Product();
	    
        p1.displayDetails();//method call
        System.out.println();
        p2.displayDetails();
	}
}


