import java.util.Scanner;

public class GreaterAmongTwo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter 1st Number");
        int a=input.nextInt();
        System.out.println("Enter 2nd Number");
        int b=input.nextInt();
        if (a>b){
            System.out.println("1st Number is greater That is  "+a);
        }
        else {
            System.out.println("2nd Number is greater That is "  +b);
        }
    }
}

