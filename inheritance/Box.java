package inheritance;

public class Box {
    double l;
    double h;
    double w;


    Box(){
        this.l = -1;
        this.h = -1;
        this.w = -1;
    }

    //cube
    Box(double side){
        this.l = side;
        this.h = side;
        this.w = side;
    }

    Box(double l ,double b ,double  h){
        this.l = l;
        this.h = h;
        this.w = b;
    }

    //copy constructor

    Box(Box old){
        this.h = old.h;
        this.l = old.l;
        this.w = old.w;
    }

    public void information(){
        System.out.println("running the box");
    }



}
