package staticKeyWord;

public class Demo {
    static int x;
    static int y;
    void add(int a , int b) {
        x = a + b;
        y = x + b;
    }

    public static void main(String args[]) {
        Demo obj1 = new Demo();
        Demo obj2 = new Demo ();   
        int a = 2;
        obj1.add(a, a + 1);
        obj2.add(5, a);
        System.out.println(obj1.x + " " + obj2.y);     
    }

}
