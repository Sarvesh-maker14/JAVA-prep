package collectionFramework.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class DemoArrayList {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();

       
        arrayList.add(10); // 10 --> (integer to Object) Implicit conversion
        arrayList.add(10.6); 
        arrayList.add(10.8f); 
        arrayList.add("hello"); 
        arrayList.add(2,"at 2nd Index"); // add(index,value) --> this will shift

        // arrayList.set(0, 45); // this will update the value at the index
        
    // /**
    //  * Constructs an empty list with an initial capacity of ten.
    //  */
    // public ArrayList() {
    //     this.elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
    // }

    // System.out.println(arrayList); // --> [] 
    // System.out.println(arrayList.isEmpty()); 

    // DemoArrayList d = new DemoArrayList();
    // System.out.println(d); //--> collectionFramework.ArrayList.DemoArrayList@372f7a8d
    // //reference id atata --> from toSring method


    //  List arrayList1 = new ArrayList(); // run time polymorphism
    //     arrayList1.add(10); // 10 --> (integer to Object) Implicit conversion
    //     arrayList1.add(10.6); 
    //     arrayList1.add(10.8f); 
    //     arrayList1.add("hello"); 
    //  ArrayList arrayList2 = new ArrayList(arrayList1);
    //     arrayList2.add(10.6); 
    //     arrayList2.add(10.8f); 
    //     arrayList2.add("hello");

    //     System.out.println(arrayList2);

    // Generic --> <dataType> --> jiss type ka data chaiye bas --> type safety

    // ArrayList<String> arrayList = new ArrayList<String>();



    //Iterating through array List
    // 1.for
    // 2.foreach 
    // 3.Iterator
    // 4.List Iterator
    // 5.Enumeration

//for

// for(int i =0;i<arrayList.size();i++){
//     System.out.println(arrayList.get(i));
// }


//foreach

// for (Object object : arrayList) {
//      System.out.println(object);
// }

//Iterator --> interface 
// we can only go in forward direction 


// public abstract Iterator iterator();

    // Iterator u = arrayList.iterator();

    // while (u.hasNext()) {
    //     Object object = (Object) u.next();
    //     System.out.println(object);
    // }


    // }


// }
