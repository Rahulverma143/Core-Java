package verma.com;

import java.util.Scanner;

public class p18 {

    public static String checkOddishEvenish(int number) {
        int sum = 0;
        int temp = number;

        while (temp > 0) {
            int digit = temp % 10;
            sum = sum + digit;
            temp = temp / 10;
        }

        if (sum % 2 == 0) {
            return "Evenish";
        } else {
            return "Oddish";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number:");
        int num = sc.nextInt();
            String result = checkOddishEvenish(num);
            System.out.println(result);
    }
}
