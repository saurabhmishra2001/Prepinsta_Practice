import java.util.Scanner;

public class GreaterAmongThreeNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Inter 1st Number");
        int a= input.nextInt();
        System.out.println("Inter 2nd Number");
        int b= input.nextInt();
        System.out.println("Inter 3rd Number");
        int c= input.nextInt();

        if ((a>b) && (a>c)){
            System.out.println("1st Number is Greater that is "+a);
        }
        else if ((b>a) && (b>c)){
            System.out.println("2nd Number is Greater that is  "+b);
        }
        else {
            System.out.println("3rd Number is Greater that is "+c);
        }
    }
}
