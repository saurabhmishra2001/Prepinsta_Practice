import java.time.Year;
import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter a year");
        int year =input.nextInt();
        if (year%400==0){
            System.out.println(year+ " is a Leap year ");
        } else if (year%4==0 && year%100 !=0) {
            System.out.println(year+ " is a Leap year");
        }
        else {
            System.out.println(year +" is not a Leap year");
        }
    }
}
