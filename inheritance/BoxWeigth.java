package inheritance;

public class BoxWeigth extends Box {
    double weight;

    public BoxWeigth(){
        this.weight = -1;
    }

    BoxWeigth(BoxWeigth other){
        super(other);
        weight = other.weight;
    }


    public BoxWeigth(double l,double h,double w,double weight){
        super(l,h,w); //call the parent class constructor
        //used to initialise value present in parent class
        this.weight = weight;
    }
}
