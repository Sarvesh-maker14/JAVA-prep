package staticKeyWord;

public class Tester{
    // public static int sampleVariable = 1;

	// static {
	// 	System.out.println("Static block in Tester class");
	// }

	// public static void main(String[] args) {
	// 	sampleVariable++;
	// 	Printer p = null;
	// 	System.out.println("In main");
	// 	p.display("The value of sample variable is: " + sampleVariable);
	// }
	static int num = 1;
	static {
		num = 2;
	}
	
	static {
		num = 3;
	}
	
	public static void display() {
		System.out.println(num);
	}
	public static void main(String[] args) {
		display();
	}

}
