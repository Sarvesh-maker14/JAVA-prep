package ThreadsClass.ThreadSync;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(5);

        new Thread(()->{
            int counter = 0;
            while(++counter < 10){
                System.out.println("pushed: " + stack.push(100));
            }
        },"Pusher").start();

        new Thread(()->{
            int counter = 0;
            while(++counter < 10){
                System.out.println("Popped: " + stack.pop());
            }
        },"Popper").start();

        
    }
}
