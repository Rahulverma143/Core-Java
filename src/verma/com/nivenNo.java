package verma.com;
import java.util.Scanner;
public class nivenNo {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter a number: ");
	        int number = sc.nextInt();

	        int sum = 0;
	        int temp = number;

	        while (temp > 0) {
	            int digit = temp % 10;
	            sum = sum + digit;
	            temp = temp / 10;
	        }

	        if (number % sum == 0) {
	            System.out.println("Niven number.");
	        } else {
	            System.out.println("Not a  Niven number.");
	        }
	    }
	}
