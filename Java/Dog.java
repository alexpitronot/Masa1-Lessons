public class Dog {

    String breed; // свойство: порода
    int age; // свойство: возраст
    String color; // свойство: цвет

    public Dog() {
    };

    void barking() { // метод: лаять
        System.out.println("WOW WOW WOW");
    }

    boolean hungry() { // метод: быть голодным
        return true;
    }

    void sleeping() { // метод: спать
    }
}

class Dobermann extends Dog {
 
    @Override // Перегрузка
    public void barking()
    {
        super.barking(); // super - обращение к родительскому классу
        System.out.println("Bark!");
    }
 
}