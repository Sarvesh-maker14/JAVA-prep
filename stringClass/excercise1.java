package stringClass;



public class excercise1 {
    
    private String customerName;
	private int applicableDiscount;
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getApplicableDiscount() {
		return applicableDiscount;
	}
	public void setApplicableDiscount(int applicableDiscount) {
		this.applicableDiscount = applicableDiscount;
	}
	
	public void findDiscountAndName(String inputString) {

		String[] parts = inputString.trim().split(":");
        String customerType = parts[0].trim();
        this.customerName = parts[1].trim();

        if (customerType.equalsIgnoreCase("Regular")) {
            this.applicableDiscount = 10;
        } else if (customerType.equalsIgnoreCase("Privileged")) {
            this.applicableDiscount = 20;
        } else {
            System.out.println("Invalid customer type");
        }
		
	}

    	public static void main(String[] args) {
		excercise1 customer1 = new excercise1();  //regular
		excercise1 customer2 = new excercise1(); //privileged
		
		//write the code to implement the solution

        customer1.findDiscountAndName("Regular:Jack");
        customer2.findDiscountAndName("Privileged:Mary");

        System.out.println(customer1.customerName);
        System.out.println(customer1.applicableDiscount);
        System.out.println(customer2.customerName);
        System.out.println(customer2.applicableDiscount);

	
	}


}
