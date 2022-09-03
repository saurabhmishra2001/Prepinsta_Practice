import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int sum=0;
        System.out.println("Enter the number ");
        int num = input.nextInt();
       while (num!=0){
           sum +=num % 10;
           num=num / 10;
       }
        System.out.println("Sum of Digits is  "+ sum);
    }
}
