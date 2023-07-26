import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<String> people = new ArrayList<String>();
        // добавим в список ряд элементов
        people.add("Tom");
        people.add("Alice");
        people.add("Kate");
        people.add("Sam");
        people.add(1, "Bob"); // добавляем элемент по индексу 1

        people.set(1, "Robert"); // установка нового значения для 2-го объекта

        // System.out.println(people.get(1));// получаем 2-й объект
        for(int i=0; i<people.size();i++){
            System.out.printf("ArrayList: %s\n", people.get(i));
        }

        // 

        System.out.printf("ArrayList has %d elements \n", people.size());
        for (String person : people) {

            System.out.println(person);
        }
        // проверяем наличие элемента
        if (people.contains("Tom")) {

            System.out.println("ArrayList contains Tom");
        }

        // удалим несколько объектов
        // удаление конкретного элемента
        people.remove("Robert");
        System.out.println("\nAfter deleting:");
        // удаление по индексу
        people.remove(0);

        Object[] peopleArray = people.toArray();
        for (Object person : peopleArray) {

            System.out.println(person);

        }
    }
}
