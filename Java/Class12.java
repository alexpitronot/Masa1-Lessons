import java.util.ArrayList;

public class Class12 {    
        // Свойства
    
        String name;
        int hours;
        boolean isOpen;
        String teacher;

        // Методы 

        void printing() {
            System.out.println("Our lesson is: " + name + ". Hours: " + hours + ". Open: " + isOpen);
        }  

        // Конструкторы

        public Class12 () {} // Конструктор для пустого объекта

        public Class12 (String name, int hours, boolean isOpen){ // Конструктор не пустого объекта
            this.name = name;
            this.hours = hours;
            this.isOpen = isOpen;
        }
       

        public Class12 (String name, int hours){ // Конструктор для объекта с 2 переменными
            this.name = name;
            this.hours = hours;
        }
    public static void main(String[] args) {

        Class12 Java = new Class12("Java",200, true);
        Class12 Python = new Class12("Python",100);
        Class12 Cplus = new Class12("Cplus",240,true);
        Java.printing();
        Python.printing();
        Cplus.printing();

        ArrayList<Class12> courses = new ArrayList<Class12>();
        courses.add(Java);
        courses.add(Python);
        courses.add(Cplus);

        // courses.remove(Java);

        for(int i=0; i<courses.size();i++){
            System.out.printf("Course: %s, hours: %s, is open? %s\n", courses.get(i).name, courses.get(i).hours, courses.get(i).isOpen);
        }

        // Cat cat1= new Cat();
        // Cat cat1 = new Cat("Murka", "white"); // создаём объект с помощью конструктора
        // System.out.println(cat1.getColor());
        // System.out.println(cat1.getName());

        // Cat cat2 = new Cat(); // создаём объект с помощью пустого конструктора
        // cat2.setName("Vas'ka");
        // cat2.setColor("black");

        // System.out.println(cat2.getColor());
        // System.out.println(cat2.getName());
    }
}
