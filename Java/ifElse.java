import java.util.Scanner;

public class ifElse {
    public static void main (String [] args) {
        
        // int a = 2;
        // int b = 3;
        // String str = (a == b) ? "a = b" : "a != b";
		// System.out.println(str);
		
		
        // if (a == b) {
        //     System.out.println ("a = b"); //Условие верное = true
        // }
        // else {
        //     System.out.println ("a != b"); //Условие не верное = false
        // }

		System.out.print ("Enter 1, 2 or 3: "); 
		Scanner inputFigure = new Scanner (System.in); 
		int i = inputFigure.nextInt(); 
		if (i==1) { 
			System.out.println ("Your number is: 1");
		}
		else if (i==2) {
			System.out.println ("Your number is: 2");
		}
		else if (i==3) {
			System.out.println ("Your number is: 3");
		}
		else {
			System.out.println ("Your number is not 1, 2 or 3");
		}
        inputFigure.close();
		
	}
}
