package verma.com;
import java.util.Scanner;

public class primeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

     
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (n <= 1) {
            System.out.println(n + " is not a prime number.");
        } else {
            boolean isPrime = true;
            int i = 2;

            while (i < n) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
                i++;
            }

      
            if (isPrime) {
                System.out.println(n + " is a prime number.");
            } else {
                System.out.println(n + " is not a prime number.");
            }
        }
    }
}
