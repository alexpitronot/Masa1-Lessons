import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        Random random = new Random();
        
        while (numbers.size() < 6) {
            int randomNumber = random.nextInt(34) + 1; // Generate numbers between 1 and 34
            numbers.add(randomNumber);
        }
        
        System.out.println("Random Numbers: " + numbers);    
        
        // Упорядоченный список чисел
    
        TreeSet<Integer> numbers1 = new TreeSet<>();
        Random random1 = new Random();
        
        while (numbers1.size() < 6) {
            int randomNumber1 = random1.nextInt(34) + 1; // Generate numbers between 1 and 34
            numbers1.add(randomNumber1);
        }
        
        System.out.println("Random Numbers: " + numbers1);
    }
}
