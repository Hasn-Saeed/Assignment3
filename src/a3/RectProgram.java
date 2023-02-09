
package a3;

import a3.Rect;
import java.util.Scanner;

/**
 *
 * Program which imports Rect class and uses it to create an object
 * 
 * Hassan Saeed
 * 
 * 0936707
 */
public class RectProgram {
    
    public static void main(String[] args) { //Main function which is executed by program
        Scanner sc = new Scanner(System.in);
        
        Rect rect1 = new Rect(); //Creation of object 1
        System.out.println("-----------Rectangle 1-----------");
        
        rect1.getCoordinates(); //Methods called to collect coordinates and length and width data of object
        rect1.lengthAndWidth();
        
        System.out.println("Please enter a length and width modifier. If you would like it to be unchanged enter 1:");
        rect1.n = sc.nextInt();
        rect1.changeSize(rect1.n); //Method called to modify size of object
        
        rect1.print(); //Print method called to display object specifications to user
        rect1.move(); //Method called to move object
        
        Rect rect2 = new Rect();
        System.out.println("-----------Rectangle 2-----------");
        
        rect2.getCoordinates(); 
        rect2.lengthAndWidth();
        
        System.out.println("Please enter a length and width modifier. If you would like it to be unchanged enter 1:");
        rect2.n = sc.nextInt();
        rect2.changeSize(rect2.n); //Method called to modify size of object
        
        rect2.print(); //Print method called to display object specifications to user
        rect2.move();
        
        System.out.println("-----------Comparison-----------");
        rect2.isBiggerThan(rect1);
    }
}
