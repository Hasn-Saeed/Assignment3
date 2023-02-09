
package a3;

import a3.Date;
import java.util.Scanner;

/**
 *
 * Program which imports Date class and uses it to create an object
 * 
 * Hassan Saeed
 * 
 * 0936707
 */
public class DateProgram {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Date date1 = new Date();
        
        System.out.println("Please enter an integer for the year: "); //Object characteristics are collected
        date1.year = sc.nextInt();
        int year = date1.year;
        
        System.out.println("Please enter an integer for the month (between 1 and 12): ");
        date1.month = sc.nextInt();
        int month = date1.month;
        
        while (date1.month < 1 || date1.month > 12){
            System.out.println("Please enter a valid integer for the month");
            date1.month = sc.nextInt();
            month = date1.month;
        }
        
        System.out.println("Please enter an integer for the day (between 1 and 31 according to the month): ");
        date1.day = sc.nextInt();
        int day = date1.day;
        
        date1.print(); //Print method called to display object to user
        
        System.out.println("Please enter an integer if you would like to add to the previously input date:");
        date1.n = sc.nextInt();
        
        date1.addDays(date1.n); //Add days method called. Number of days is sent as argument
        
        
       
        //Initialize and populate second date object
        Date date2 = new Date();
        
        System.out.println("\nSecond date:");
        System.out.println("Please enter an integer for the year: "); //Object characteristics are collected
        date2.year = sc.nextInt();
        
        System.out.println("Please enter an integer for the month (between 1 and 12): ");
        date2.month = sc.nextInt();
        
        while (date2.month < 1 || date2.month > 12){
            System.out.println("Please enter a valid integer for the month");
            date2.month = sc.nextInt();
        }
        
        System.out.println("Please enter an integer for the day (between 1 and 31 according to the month): ");
        date2.day = sc.nextInt();
        
        date2.print(); 
        
        date1.compare(date2); //Compare method used to find difference between the two dates
        
    }
    
}
