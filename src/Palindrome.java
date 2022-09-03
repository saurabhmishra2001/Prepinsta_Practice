import java.util.Scanner;
public class Palindrome {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int reverse = 0, rem;
        System.out.println("Enter a Number ");
        int num = input.nextInt();
        int temp=num;
        while (num != 0) {
            rem = num % 10;
            reverse = reverse * 10 + rem;
            num /= 10;
        }

        if (temp == reverse) {
            System.out.println("The number: " + reverse + " is Palindrome");
        }
        else {
            System.out.println("The Number : "+reverse +" is not Palindrome");
        }
    }
}


