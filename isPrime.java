import java.util.Scanner;
class Suduku{ // Function to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // If the number is divisible by any number other than 1 and itself, it's not prime
            }
        }
        return true; // If the number is not divisible by any other number, it's prime
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numToCheck = sc.nextInt(); // Change this number to test for primality
        if (isPrime(numToCheck)) {
            System.out.println(numToCheck + " is a prime number.");
        } else {
            System.out.println(numToCheck + " is not a prime number.");
        }
    }
}
