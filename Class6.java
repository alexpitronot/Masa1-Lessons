// import java.util.Scanner;

public class Class6 {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);

        // System.out.print("Enter the first number: ");
        // int number1 = scanner.nextInt();

        // System.out.print("Enter the second number: ");
        // int number2 = scanner.nextInt();

        // System.out.print("Enter the third number: ");
        // int number3 = scanner.nextInt();

        // int max = Math.max(number1, Math.max(number2, number3));
        // int min = Math.min(number1, Math.min(number2, number3));
        // double average = (number1 + number2 + number3) / 3.0;

        // System.out.println("The maximum number is: " + max);
        // System.out.println("The minimum number is: " + min);
        // System.out.println("The average is: " + (int) average); //преобразование в
        // целое число

        // scanner.close();

        // Напишите программу создающую:
        // массив размера 5 элементов + заполнить его рандомальными целыми числами от 0
        // до 100.
        // массив размера 5 элементов + заполнить его произвольными именами.
        // Вывести на экран: Имя и оценку ученика с наибольшей оценкой*.

        // int[] grades = new int[5]; // массив размера 5 элементов
        // String[] names = {"Alex","David","Natali","Anna","Ilya"}; // массив размера 5
        // элементов + заполнить его произвольными именами

        // System.out.println("Grades:");
        // for (int i = 0; i < grades.length; i++) {
        // grades[i] = (int) (Math.random() * 101); // аполнить его рандомальными целыми
        // числами от 0 до 100
        // System.out.print(grades[i]+" ");
        // }

        // System.out.println("\nNames:");
        // for (int i = 0; i < names.length; i++) {
        // System.out.print(names[i]+" ");
        // }

        // // Находим индекс ученика с наивысшей оценкой
        // int maxIndex = 0;
        // for (int i = 1; i < grades.length; i++) {
        // if (grades[i] > grades[maxIndex]) {
        // maxIndex = i;
        // }
        // }

        // System.out.println("\nBest student is: " + names[maxIndex] + " - " +
        // grades[maxIndex]);



        // Напишите следующую программу:
        // Создайте 2 массива из 4 случайных целых чисел из отрезка [0;8] каждый
        // Выведите массивы на экран в двух отдельных строках
        // Посчитайте среднее арифметическое элементов каждого массива и сообщите, для
        // какого из массивов это значение оказалось больше (либо сообщите, что их
        // средние арифметические равны)

        int[] Arr1 = new int[4];
        int[] Arr2 = new int[4];

        int sum1 = 0, sum2 = 0;

        for (int i = 0; i < 4; i++) {
            Arr1[i] = (int) (Math.random() * 9); // Создаём массив 1
            sum1 += Arr1[i];                     // Сумма всех элемнтов в массив 1
            Arr2[i] = (int) (Math.random() * 9); // Создаём массив 1
            sum2 += Arr2[i];                     // Сумма всех элемнтов в массив 2
        }

        System.out.println("Array 1:");
        for (int num : Arr1) {
            System.out.print(num + " ");
        }

        System.out.println("\nArray 2:");
        for (int num : Arr2) {
            System.out.print(num + " ");
        }

        System.out.println();

        double average1 = sum1 / Arr1.length; // среднее арифметическое массива 1
        double average2 = sum2 / Arr2.length; // среднее арифметическое массива 2

        if (average1 > average2) { // сравнение
            System.out.println("Average of Array1 greater then Average of Array2");
        } else if (average2 > average1) {
            System.out.println("Average of Array2 greater then Average of Array1");
        } else {
            System.out.println("Average is the same");
        }
    }
}
