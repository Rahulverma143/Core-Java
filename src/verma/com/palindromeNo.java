package verma.com;
import java.util.Scanner;
public class palindromeNo {

	public static void main(String[] args) {
		System.out.println("Enter the Number:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d;
		int temp = n;
		int sum = 0;
		while(n>0){
		    d = n % 10;
		    sum = sum*10+d;
		    n = n/10;
		}
		if(temp == sum){
		    System.out.println("palindrome number");
		}
		else {
		    System.out.println("not palindrome number");
		}
	}
}

