
package a3;

import java.util.Scanner;

/**
 *
 * Class created for the concept of a Rectangle
 * 
 * Hassan Saeed
 * 0936707
 */
public class Rect { //Class containing parameters which can be filled for an object
    Scanner sc = new Scanner(System.in);
    
    int x;
    int y;
    int length; 
    int width;
    int moveX;
    int moveY;
    int n = 1;
    int area;

    
    public void getCoordinates (){ //Function used to collect input from user
        
        System.out.println("Please type the X and Y coordinates of the rectangle, respectively:"); //Object characteristics are collected
        this.x = sc.nextInt();
        this.y = sc.nextInt();
        
    }
    
    
    public void lengthAndWidth(){ //Method used to find length and width of object
        
        System.out.println("Please enter the length and width of the rectangle, respectively:");
        int length = sc.nextInt();
        int width = sc.nextInt();
        
        if (length != 0){
            this.length = Math.abs(length);
        }
        else {
            this.length = 1;
        }
        
        if (width != 0){
            this.width = Math.abs(width);
        }
        else {
            this.width = 1;
        }
    }
    
    public int getPerimeter(int length, int width){ //Method which calculates perimeter of object
        return length + length + width + width;
    }
    
    public int getArea(int length, int width){ //Method which calculates area of object
        return length * width;
    }
    
    public void move(){ //Method which moves object
        System.out.println("Would you like to move the position of the rectangle? Enter Y or N");
        char choice = sc.next().charAt(0);
        
        if (choice == 'Y' || choice == 'y'){ //If user chooses yes, the object movement parameters will be requested
            System.out.println("Please enter a new X and Y coordinate");
            this.x = sc.nextInt();
            this.y = sc.nextInt();
            
            System.out.println("The new x and y coordinates are: (" + this.x + ", " + this.y + ")"); 
        }
    }
    
    public void changeSize(int n){ //Method which changes the size of the object based on the entered multiplier
        this.length *= n;
        this.width *= n;
    }
    
    public void print(){ //Method which prints the desired outputs
        System.out.println("The x and y coordinates of the rectangle are : " + this.x + ", " + this.y);
        System.out.println("The length of the rectangle is : " + this.length);
        System.out.println("The width of the rectangle is : " + this.width);
        System.out.println("The perimeter of the rectangle is : " + getPerimeter(this.length, this.width));
        System.out.println("The area of the rectangle is : " + getArea(this.length, this.width));
        
    }
    
    public void isBiggerThan (Rect comparison){ //Method which takes object as parameter and compares it to current object
        
        System.out.println("Rectangle 2 is bigger than rectangle 1");
        if (comparison.getArea(comparison.length, comparison.width) > getArea(this.length, this.width)){
            System.out.println("False");
        }
        else {
            System.out.println("True");
        }
    }
}
