public class lotto {
    public static void main(String[] args) {
        int number1 = (int) (Math.random() * 34) + 1;
        int number2;
        int number3;
        int number4;
        int number5;
        int number6;

        do {
            number2 = (int) (Math.random() * 34) + 1;
        } while (number2 == number1);

        do {
            number3 = (int) (Math.random() * 34) + 1;
        } while (number3 == number1 || number3 == number2);

        do {
            number4 = (int) (Math.random() * 34) + 1;
        } while (number4 == number1 || number4 == number2 || number4 == number3);

        do {
            number5 = (int) (Math.random() * 34) + 1;
        } while (number5 == number1 || number5 == number2 || number5 == number3 || number5 == number4);

        do {
            number6 = (int) (Math.random() * 34) + 1;
        } while (number6 == number1 || number6 == number2 || number6 == number3 || number6 == number4 || number6 == number5);

        System.out.println("Random Numbers: " + number1 + ", " + number2 + ", " + number3 + ", " + number4 + ", " + number5 + ", " + number6);

        // int a = 1 + (int) (Math.random()*34);       
        // System.out.println ("from 1 to 34: " + a);

        // int b = 1 + (int) (Math.random() *34); 
        // System.out.println ("from 1 to 34: " + b);

        // int c = 1 + (int) (Math.random() *34); 
        // System.out.println ("from 1 to 34: " + c);

        // int d = 1 + (int) (Math.random() *34); 
        // System.out.println ("from 1 to 34: " + d);

        // int e = 1 + (int) (Math.random() *34); 
        // System.out.println ("from 1 to 34: " + e);

        // int f = 1 + (int) (Math.random() *34); 
        // System.out.println ("from 1 to 34: " + f);

        // System.out.println (" ");

        // int g =  1 + (int) (Math.random() *7); 
        // System.out.println ("from 1 to 7: " + g);

}
}