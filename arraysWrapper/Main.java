package arraysWrapper;

public class Main {
    public static void main(String[] args) {
        String[] pizzaSize = {"Regular", "Medium", "Large"};
        int[] pizzaCost = {100, 250, 390};
        String[] pizzaOrdered = {"Medium", "Regular"};
        int[] quantityOrdered = {2, 1};
        float totalAmount = 0f;
        for(int index1 = 0; index1 < pizzaOrdered.length ; index1++) {
            for(int index2 = 0; index2 < pizzaSize.length ; index2++) {
                if ( pizzaOrdered[index1] == pizzaSize[index2] ) {
                    totalAmount += pizzaCost[index2] * quantityOrdered[index1];
                }
                else {
                    totalAmount += 0;
                }
            }
        }
        totalAmount = totalAmount - (totalAmount*(float)5/100);
        System.out.println("Your total bill amount is: "+totalAmount);

    }
}
