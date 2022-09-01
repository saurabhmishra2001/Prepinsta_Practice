//This Program will Find the sum of first N natural Number
import java.util.Scanner;

public class SumOfNaturalNumber {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the range of number to find the sum ");
        int range=in.nextInt();
        int sum=0;
        for (int i=0;i<=range;i++){
            sum=sum+i;
        }
        System.out.println(sum);
    }
}
