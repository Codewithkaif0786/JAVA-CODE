import java.util.Scanner;

public class server {
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number is : ");
        float a = sc.nextFloat();
        System.out.println("Enter the second no is : ");
        float b = sc.nextFloat();

        float sum = a+b;

        System.out.println("Sum of two no is :"+sum);
   }
}