//This Program will find that a number is Even or Odd
import java.util.Scanner;

public class Even_Odd {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter number");
        int num=in.nextInt();
        if (num%2==0){
            System.out.println("Even Number");
        }
        else {
            System.out.println("Odd Number");
        }
    }
}
