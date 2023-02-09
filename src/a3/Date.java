
package a3;

/**
 *
 * Class created for the concept of a Date
 * 
 * Hassan Saeed
 * 
 * 0936707
 */
public class Date { //Class containing parameters which can be filled for a date object
    
    int day;
    int month;
    int year;
    int n;
    
    void print (){ //Method which prints the desired outputs
        
        System.out.println("The date is: " + this.day + " / " + this.month + " / " + this.year);
        
    }
    
    void addDays(int n){ //Method which increments the day, month, and year values of object based on user input
        if (n <= 31){ //If and switch statements used to determine incrementation
            switch (this.month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (n <= 31){
                    this.day += n;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (n <= 30){
                    this.day += n;
                }
                break;
            case 2:
                if (n <= 28){
                    this.day += n;
                }
                break;
            }
        }
        else if (n >= 31){
            this.day += (n%31);
            this.month += (n/31);
            this.year += (n/365);
        }
        
        System.out.println("The date is: " + this.day + " / " + this.month + " / " + this.year);
    }
    
    void compare(Date comparison){ //Method used to determine difference of days between original input and modified date
        
        int dayComparison = Math.abs(comparison.day - this.day);
        int monthComparison = Math.abs(comparison.month - this.month);
        int yearComparison = Math.abs(comparison.year - this.year);
        
        int totalDifference = dayComparison + (monthComparison * 30) + (yearComparison * 365);
        
        System.out.println("The difference of days between the two dates is: " + totalDifference);
        
    }
    
}
