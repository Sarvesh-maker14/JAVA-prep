package staticKeyWord;

public class Car {
    private String color;
	private static int numberOfCars = 0;    //static variable
	
	public Car(String color) {
	   this.color = color;
       numberOfCars++;

	}
	
	public String getColor() {       //static method
	    return this.color;
	}
	
	public static void getNumberOfCars() {
        System.out.println("Color of the car : "+numberOfCars);
		
	}

	public void displayColor() {
		System.out.println("Color of the car : "+this.color);
	}

    public static void displayCar() {
	    System.out.println("Displaying Car details");
	}
	
	public static void main(String[] args) {
		// Car c1 = new Car("Red");
		// Car c2 = new Car("Green");
		// Car c3 = new Car("Blue");
		  // Retrieve and display the color of each car
           
          Car[] cars = { new Car("Red"), new Car("Green"), new Car("Blue") };
          for (Car car : cars) {
              car.displayColor();
          }

            getNumberOfCars();
      }
  
      public static void main(String[] args) {
      
          displayCar();
         
      }
}
