import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = input.nextInt();
        checkPrime(n);
    }
        private static void checkPrime(int n) {
            int count = 0;

            if (n < 2)
                System.out.println ("The given is number " + n + " is not prime");

            for (int i = 1; i <= n; i++)
            {
                if (n % i == 0)
                    count += 1;
            }

            if (count > 2)
                System.out.println ("The given is number " + n + " is not prime");

            else
                System.out.println ("The given is number " + n + " is prime");
        }
    }