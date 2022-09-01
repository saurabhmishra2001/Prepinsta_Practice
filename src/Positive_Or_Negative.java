//This Program will find that a given number is positive or negative
import java.util.Scanner;
public class Positive_Or_Negative {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Number");
        int n= in.nextInt();//Input number
        if (n>0){
            System.out.println("Number is positive");
        }
        else if(n<0) {
            System.out.println("Number is Negative");
        }
        else {
            System.out.println("Number is Zero");
        }

    }
}
