public class Class12 {    
        String name;
        int hours;
        boolean isOpen;
         
        void printing() {
            System.out.println("Our lesson is :" + name + ". Hours: " + hours + " Open: " + isOpen);
        }  
    public static void main(String[] args) {

        // Class12 Java = new Class12();
        // Java.printing();
        
        // Cat cat1= new Cat();
        Cat cat1= new Cat("Murka", "white");
        System.out.println(cat1.getColor());
        System.out.println(cat1.getName());

        Cat cat2= new Cat();
        cat2.setName("Vas'ka");
        cat2.setColor("black");

        System.out.println(cat2.getColor());
        System.out.println(cat2.getName());
    }
}
