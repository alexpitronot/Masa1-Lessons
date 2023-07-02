import java.util.Scanner;

public class switchExample {
    public static void main(String args[]){
		System.out.println("Enter option: 1, 2, 3 or 4");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
 
		switch (number){
		case 1: System.out.println ("Option 1 - Add file"); break;
		case 2: System.out.println ("Option 2 - Delete file"); break;
		case 3: System.out.println ("Option 3 - Update file"); break;
		case 4: System.out.println ("Option 4 - Close file"); break;
		default: System.out.println("Wrong option");
		}
        scan.close();
	}
}
