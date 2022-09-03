import java.util.Scanner;

public class PrimeToGivenRange {

        public static void main (String[]args)
        {
            Scanner input =new Scanner(System.in);
            System.out.println("Enter Lower Bound");
            int lower = input.nextInt();
            System.out.println("Enter upper Bound");
            int upper = input.nextInt();
            for (int i = lower; i <= upper; i++)
                if (isPrime (i))
                    System.out.println (i);
        }

        static boolean isPrime (int n)
        {
            int count = 0;
            if (n < 2)
                return false;

            for (int i = 2; i < n; i++)
            {
                if (n % i == 0)
                    return false;
            }

            return true;
        }
    }


