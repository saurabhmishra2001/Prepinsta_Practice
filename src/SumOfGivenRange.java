import java.util.Scanner;

public class SumOfGivenRange {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sum=0;
        System.out.println("Enter The Starting Range");
        int a=input.nextInt();
        System.out.println("Enter the Terminating Range");
        int b=input.nextInt();
        for (int i=a;i<=b;i++){
             sum=sum+i;
        }
        System.out.println("The sum from range "  + a + " to " + b + "  is  " +sum);
    }
}
