// import java.util.Scanner;

public class For {
    public static void main(String args[]) {
        // for (int i = 1; i <= 5; i++) {
        // System.out.println("Cool!");
        // }

        // for (int i = 3; i > -4; i--) {
        // System.out.print(i + " ");
        // }

        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter a number from 1 to 10: ");

        // int number = scanner.nextInt();

        // int result;
        // if (number > 0 && number < 10) {
        // System.out.println("Table for " + number + ":");
        // for (int i = 1; i <= 10; i++) {
        // result = number * i;
        // System.out.println(number + " x " + i + " = " + result);
        // }
        // } else {
        // System.out.print("Number is not from 1 to 10");
        // }

        // scanner.close();

        // System.out.println("Enter any integer positive number:");
        // Scanner num_scan = new Scanner(System.in);
        // int number = num_scan.nextInt();
        // if (number < 0) {
        // System.out.println("Your number is not positive:");
        // } else {
        // int x = 0;
        // for (int i = 1; i <= number; i++) {
        // x += i;
        // }
        // System.out.println(x);

        // num_scan.close();
        // }

        // int i=1;
        // while (i < 513) {
        // int k = 3;
        // System.out.println (i);
        // i*=k;
        // }

        int n = 11;
        int first = 1;
        int second = 1;
        System.out.print(first + " " + second + " ");
        for (int i = 3; i <= n; i++) {
            int next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
        }
    }
}