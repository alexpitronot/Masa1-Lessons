import java.util.Scanner;

public class H2 {

    // public static void main(String[] args) {
    // Scanner scanner = new Scanner(System.in);
    // System.out.println("Enter length of rectangle:");
    // double length = scanner.nextDouble();

    // System.out.println("Enter width of rectangle:");
    // double width = scanner.nextDouble();

    // double ploschad = getSquare(length,width);
    // System.out.println(ploschad);

    // scanner.close();
    // }

    // public static double getSquare(double dlinna, double shirina) {
    // return dlinna*shirina;
    // }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integer not negative number please:");
        int number = scanner.nextInt();

        int fac = factorial(number);

        System.out.println(number + "! = " + fac);
        scanner.close();
    }

    public static int factorial(int x) {
        int fac = 1;
        for (int i = x; i > 0; i--) {
            fac = fac * i;
        }
        return fac;
    }
}
