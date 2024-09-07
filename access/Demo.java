package access;

class Demo {
	int value1, value2;

	Demo() {
		value1 = 10;
		value2 = 20;
	}

	public void display() {
		System.out.println("Value 1:" + value1);
		System.out.println("Value 2:" + value2);
	}
	public static void main(String[] args) {
		Demo object1 = new Demo();
		Demo object2 = object1;

		object1.value1 += 1;
		object1.value2 += 1;

		System.out.println("For Object 1--");
		object1.display();
		System.out.println("For Object 2--");
		object2.display();
	}
}


