public class MathExample {
    public static void main(String args[]) {

        float num = 5.25f;

        System.out.println(Math.round(num));
        System.out.println(Math.floor(num));
        System.out.println(Math.ceil(num));

        float num1 = 4.25f;
        int num2 = 5;

        System.out.println("Max number is: " + Math.max(num1, num2));
        System.out.println("Min number is: " + Math.min(num1, num2));
    }
}
