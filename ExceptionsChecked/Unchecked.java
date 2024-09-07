package ExceptionsChecked;

//NullPointerException is an unchecked exception -- Runtime exception 

public class Unchecked {
    public static void main(String[] args) {
        String name = null;
        printLength(name);
    }

    public static void printLength(String myString) {
        // try{
        // System.out.println(myString.length());
        // }
        // catch(NullPointerException npe){
        //     System.out.println("string cannot be null");
        // }

        // throw new RuntimeException();//unchecked exception
        // throw new Exception();//checked exception
    }
}
