import java.util.Scanner;

public class Class6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int number3 = scanner.nextInt();

        int max = Math.max(number1, Math.max(number2, number3));
        int min = Math.min(number1, Math.min(number2, number3));
        double average = (number1 + number2 + number3) / 3.0;

        System.out.println("The maximum number is: " + max);
        System.out.println("The minimum number is: " + min);
        System.out.println("The average is: " + (int) average); //преобразование в целое число

        scanner.close();
        
    }
}
