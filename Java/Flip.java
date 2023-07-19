import java.util.Scanner;
public class Flip {

public static void main(String[] args) {
    System.out.println("Enter 3-digit number:");
    Scanner myScanner = new Scanner(System.in);
    // int num = 10;
    int n, e, d, s;
    n = myScanner.nextInt();
    e = n % 10;     
    d = n / 10 % 10;  
    s = n / 100;
    System.out.print(e + " " + d + " " + s + " \n" + (e * 100 + d * 10 + s));    
    myScanner.close();
}
}
