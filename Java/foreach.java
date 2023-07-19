public class foreach {
    public static void main(String[] args) {

        // int[] array = {51,136, 387};

        // for (int i = 0; i < array.length; i++) {
        // System.out.println(array[i]);
        // }

        // int[] array1 = {51,136,387};

        // for (int i:array1) {
        // System.out.println(i);
        // }

        int[] grades = new int[5]; // массив размера 5 элементов
        String[] names = { "Alex", "David", "Natali", "Anna", "Ilya" }; // массив размера 5 элементов + заполнить его
                                                                        // произвольными именами

        System.out.println("Grades:");
        for (int i = 0; i < grades.length; i++) {
            grades[i] = (int) (Math.random() * 101); // аполнить его рандомальными целыми числами от 0 до 100
            System.out.print(grades[i] + " ");
        }
        
        System.out.println("\nNames:");
        for (String n : names) {
            System.out.print(n + " ");
        }

        // Находим индекс ученика с наивысшей оценкой
        int maxIndex = 0;
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] > grades[maxIndex]) {
                maxIndex = i;
            }
        }

        System.out.println("\nBest student is: " + names[maxIndex] + " - " + grades[maxIndex]);

    }
}
