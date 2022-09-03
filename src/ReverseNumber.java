import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int reverse=0, rem;
        System.out.println("Enter a Number ");
        int num = input.nextInt();
        while (num != 0)
        {
            rem = num % 10;
            reverse = reverse * 10 + rem;
            num /= 10;
        };
        System.out.println ("Reversed Number: " + reverse);

    }
}
