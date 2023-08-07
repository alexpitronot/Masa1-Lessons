public class Phone {
    private String number;
    private String model;
    private double weight;

    // Конструктор с тремя параметрами
    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    // Конструктор с двумя параметрами (вызов из конструктора с тремя параметрами)
    public Phone(String number, String model) {
        // this(number, model, 0.0);
        this.number = number;
        this.model = model;
    }

    // Конструктор без параметров (по умолчанию)
    public Phone() {
        // this("", "", 0.0);
    }

    // Метод получения номера телефона
    public String getNumber() {
        return number;
    }

    // Метод принимает имя звонящего и выводит сообщение о звонке
    public void receiveCall(String callerName) {
        System.out.println("Call from " + callerName);
    }

    // Метод принимает имя звонящего и номер телефона звонящего
    public void receiveCall(String callerName, String callerNumber) {
        System.out.println("Call from " + callerName + " his number is " + callerNumber);
    }

    public static void main(String[] args) {
        // Создание трех экземпляров класса Phone
        Phone phone1 = new Phone("050-455-2734", "Samsung Galaxy S22", 140.5);
        Phone phone2 = new Phone("054-555-2734", "iPhone 11");
        Phone phone3 = new Phone();

        // Вывод значений переменных для каждого объекта
        System.out.println("Phone 1: Number: " + phone1.getNumber() + ", Model: " + phone1.model + ", Weight: " + phone1.weight);
        System.out.println("Phone 2: Number: " + phone2.getNumber() + ", Model: " + phone2.model + ", Weight: " + phone2.weight);
        System.out.println("Phone 3: Number: " + phone3.getNumber() + ", Model: " + phone3.model + ", Weight: " + phone3.weight);

        // Вызов метода receiveCall для каждого объекта
        phone1.receiveCall("John");
        phone2.receiveCall("Alice");
        phone3.receiveCall("Bob");

        // Вызов метода receiveCall с двумя параметрами
        phone1.receiveCall("Mark", "555-123-456");
    }
}
