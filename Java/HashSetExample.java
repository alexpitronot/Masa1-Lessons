import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        Random random = new Random();
        
        while (numbers.size() < 6) {
            int randomNumber = random.nextInt(34) + 1; // Generate numbers between 1 and 34
            numbers.add(randomNumber);
        }
        
        System.out.println("Random Numbers: " + numbers);
    }
}
