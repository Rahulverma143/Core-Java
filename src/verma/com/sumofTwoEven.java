package verma.com;

import java.util.Scanner;

public class sumofTwoEven {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int x = sc.nextInt();

        System.out.println("Enter the second number:");
        int y = sc.nextInt();

     //   if (x > y) {
     //       int temp = x;
     //       x = y;
    //        y = temp;
    //    }

        int sum = 0;
      //  int i = x;

        while (x <= y) {
            if (x % 2 == 0) {
                sum = sum + x;
            }
            x++;
        }

        System.out.println("sum = " + sum);
    }
}
