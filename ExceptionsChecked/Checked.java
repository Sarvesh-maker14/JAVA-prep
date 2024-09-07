package ExceptionsChecked;

//checked exception are checked at compile time

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Checked {
    
    public static void main(String[] args) throws FileNotFoundException {
        readFile("myFile.txt");
    }

    public static void readFile(String fileName) throws FileNotFoundException {
        // try {
        //     //checked exception 
        //     FileReader reader = new FileReader(fileName);
        // } catch (FileNotFoundException e) {
        //     // TODO Auto-generated catch block
        //     e.printStackTrace();
        // }

        FileReader reader = new FileReader(fileName);  



    }
}
