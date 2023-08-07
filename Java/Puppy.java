public class Puppy {
   int puppyAge;
   String puppyColor;
   String puppyName;

   public Puppy(String name, String color) {
      // Конструктор имеет 2 параметра: name и color
      puppyName = name;
      puppyColor = color;
      System.out.println("Name chosen is: " + name + ". His color is: " + color);
   }

   public void setAge( int age ) {
      this.puppyAge = age;
   }

   public int getAge( ) {
      System.out.println("Puppy's age is :" + puppyAge );
      return puppyAge;
   }

   public static void main(String []args) {
      /* Создание объекта */
      Puppy myPuppy = new Puppy("tommy", "red");

      /* Вызываем метод, для задания возраста (age = 2) */
      myPuppy.setAge(2);

      /* Вызываем метод, для распечатывания возраста */
      myPuppy.getAge();

      /* Можно распечатать возраст и без обращения к методу, напрямую */
      System.out.println("Puppy's Age is: " + myPuppy.puppyAge +". Puppy's Name is: " + myPuppy.puppyName + ". Puppy's Color is: " + myPuppy.puppyColor);
   }
}