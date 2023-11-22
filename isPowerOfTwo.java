import java.util.Scanner;

public class server {
        // Function to check if
    // x is power of 2
    static boolean isPowerOfTwo(int n)
    {
        if (n == 0)
            return false;
 
        while (n != 1) {
            if (n % 2 != 0)
                return false;
            n = n / 2;
        }
        return true;
    }
 
    // Driver program
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input element");
        int n = sc.nextInt();

        if(isPowerOfTwo(n)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}