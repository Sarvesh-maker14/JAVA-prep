package inheritance;

public class BoxPrice extends BoxWeigth {
    double cost;

    BoxPrice (){
        super();
        this.cost = -1;
    }

    // BoxPrice(BoxPrice other){
    //     super(other);
    //     this.cost = other.cost;
    // }

    public BoxPrice(double l,double h,double w,double weight, double cost){
        super(l,h,w,weight); //call the parent class constructor
        //used to initialise value present in parent class
        this.cost = cost;
    }
}
