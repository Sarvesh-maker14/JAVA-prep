public class Customer {
    
    String customerName;

    //getter
    String getCustomerName(){
        return customerName;
    }

    //setter
    void setCustomerName(String customerName){
        this.customerName = customerName;
    }


    public static void main(String args[]){
    Customer customerObject = new Customer();

    customerObject.customerName = "Suppu";
    System.out.println("hi there "+customerObject.getCustomerName());
    }



}






