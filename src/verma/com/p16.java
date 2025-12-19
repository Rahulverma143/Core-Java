package verma.com;

import java.util.Scanner;
public class p16 {

	static int checkBirthday(int day, String month) {
		if (day == 5 && month.equals("july")) {
			return 1;
		} else {
			return 0;
		}
	}

	public static void main(String[] args) {
	System.out.println("Enter the day and date");
	Scanner sc = new Scanner(System.in);
	String month = sc.nextLine();
	int day = sc.nextInt();
	
	int hi = checkBirthday(day , month);
	if(hi == 1) {
		System.out.println("Remenber");
	}
	else {
		System.out.println("Not remember");
	}
}
}