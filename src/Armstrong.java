import java.util.Scanner;

public class Armstrong
{
    public static void main (String[]args)
    {
        int  len;
        Scanner input =new Scanner(System.in);
        System.out.println("Enter Number");
        int num =input.nextInt();

        // function to get order(length)
        len = order (num);

        // check if Armstrong
        if (armstrong (num, len))
            System.out.println(num + " is armstrong");
        else
            System.out.println(num + " is not armstrong");

    }


    static int order (int x)
    {
        int len = 0;
        while (x != 0 )
        {
            len++;
            x = x / 10;
        }
        return len;
    }

    static boolean armstrong (int num, int len)
    {

        int sum = 0, temp, digit;
        temp = num;

        // loop to extract digit, find power & add to sum
        while (temp != 0)
        {
            // extract digit
            digit = temp % 10;

            // add power to sum
            sum = sum + (int)Math.pow(digit, len);
            temp /= 10;
        }

        return num == sum;
    }
}