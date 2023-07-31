import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.ArrayList;
import java.util.Collection;

public class class9 {
    // public static void main(String[] args) {

    // Map<String, String> Countries = new HashMap<String, String>();
    // Countries.put("Dresden", "Germany");
    // Countries.put("Barcelona", "Spain");
    // Countries.put("Paris", "France");
    // Countries.put("Rome", "Italy");
    // Countries.put("Milano", "Italy");
    // Countries.put("Verona", "Italy");
    // Countries.put("Berlin", "Germany");

    // Collection<String> values = Countries.values();
    // for (Object value : values) {

    // System.out.println(value);

    // }

    // for (Map.Entry<String, String> item : Countries.entrySet()) {

    // System.out.println(item.getKey() + " - " + item.getValue());
    // }

    // Создаем первую коллекцию с 10 числами
    // List<Integer> numbers = new ArrayList<Integer>();

    // for (int i = 1; i <= 10; i++) {
    // numbers.add(i);
    // }

    // // Создаем вторую коллекцию с 10 именами
    // ArrayList<String> names = new ArrayList<>();
    // names.add("Alex");
    // names.add("Sviatoslav");
    // names.add("Oleg");
    // names.add("Alexander");
    // names.add("Oxana");
    // names.add("David");
    // names.add("Uliana");
    // names.add("Viktoria");
    // names.add("Halina");
    // names.add("Evgeniy");

    // // Создаем третью коллекцию и автоматически заполняем ее строками с числами и
    // именами из первых двух коллекций
    // List<String> combinedList = new ArrayList<>();
    // for (int i = 0; i < numbers.size(); i++) {
    // String combinedValue = numbers.get(i) + "-" + names.get(i);
    // combinedList.add(combinedValue);
    // }

    // // Выводим все значения третьей коллекции в цикле for-each
    // for (String item : combinedList) {
    // System.out.println(item);
    // }

    // }

    public static void main(String[] args) {
        
        double number1 = 5; // Первое число
        int exponent1 = 2; // Первая степень
        double result1 = power(number1, exponent1); // Первое число в первой степени
       
        double number2 = 7; // Второе число
        int exponent2 = 3; // Вторая степень
        double result2 = power(number2, exponent2); // Второе число во второй степени
       
        double sum = result1 + result2;
       
        System.out.println("Result: " + sum);
    }

    public static double power(double base, int exp) { // Получаем 2 значения: первый аргумент - будет само число, второй аргумент - будет степень
        double result = 1;
        for (int i = 0; i < exp; i++) {
            result *= base; // Возводим в степень
        }
        return result;
    }
}
