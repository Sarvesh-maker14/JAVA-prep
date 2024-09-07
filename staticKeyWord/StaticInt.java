package staticKeyWord;
//static variables
public class StaticInt {
    
    static int a = 4;
    static int b;

    //static block
    static{ // hum subse pehle execute honge 
        //ek hi baar chalega when class is loaded for the first time
        System.out.println("I am static");
        b = a * 5;
    }

    public static void main(String[] args) {
        StaticInt obj = new StaticInt();
        System.out.println(StaticInt.a + StaticInt.b);
    }
}
