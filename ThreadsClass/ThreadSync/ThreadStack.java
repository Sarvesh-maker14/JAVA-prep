package ThreadsClass.ThreadSync;

public class ThreadStack {

    private int[] array;
    private int stackTop;
    Object lock1,lock2;

    public Stack(int capacity){
        array = new int[capacity];
        stackTop = -1;
        lock = new Object();
    }
    
    public boolean isEmpty(){
        return stackTop < 0;
    }

    public boolean isFull(){
        return stackTop >= array.length - 1;
    }


    public boolean push(int element){
        synchronized(lock1) {
            if(isFull()) return false;
        ++stackTop;

        try{
            Thread.sleep(1000);
        }catch(Exception e){

        }
        array[stackTop] = element;
        return true;
        }
        
      
    }

    public int pop(){
        synchronized(lock2) {
        if(isEmpty()) return Integer.MIN_VALUE;
        
        int obj = array[stackTop];

        try{
            Thread.sleep(1000);
        }catch(Exception e){

        }
        stackTop--;
        return obj;
        }
    }
}
