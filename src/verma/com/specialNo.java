package verma.com;
import java.util.Scanner;
public class specialNo {

	public static void main(String[] args) {
		
		        Scanner sc = new Scanner(System.in); 

		        System.out.print("Enter the number: ");
		        int n = sc.nextInt();

		        int a = n / 10;     
		        int b = n % 10; 

		        int sum = a + b;
		        int product = a * b;

		      
		        if (sum + product == n) {
		            System.out.println( " Special Number.");
		        } else {
		            System.out.println( "not a Special Number.");
		        }
	
		 }
		}
