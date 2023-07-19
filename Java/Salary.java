import java.util.Scanner;

public class Salary {
    public static void main(String args[]){

        // int salary; 
        // double experience;

        Scanner scan = new Scanner(System.in);

        System.out.println("Your salary: ");
        int salary = scan.nextInt();

        System.out.println("Your experience: ");
        double experience = scan.nextDouble();

        scan.close();

        int bonus;
        double newSalary;

        if (experience < 5) { // Если выслуга до 5 лет, премия составляет 10% от заработной платы.
            newSalary = salary*1.1;
            bonus = 10;
        }
        else if (experience >= 5 && experience < 10) { // Если выслуга от 5 лет (включительно) до 10 лет, премия составляет 15% от заработной платы.
            newSalary = salary*1.15;
            bonus = 15;
        }
        else if (experience >= 10 && experience < 15) { // Если выслуга от 10 лет (включительно) до 15 лет, премия составляет 25% от заработной платы.
            newSalary = salary*1.25;
            bonus = 25;            
        }
        else if (experience >= 15 && experience < 20) { // Если выслуга от 15 лет (включительно) до 20 лет, премия составляет 35% от заработной платы.
            newSalary = salary*1.35;
            bonus = 35;            
        }
        else if (experience >= 20 && experience < 25) { // Если выслуга от 20 лет (включительно) до 25 лет, премия составляет 45% от заработной платы.
            newSalary = salary*1.45;
            bonus = 45;            
        }
        else { // Если выслуга от 25 лет (включительно) и более, премия составляет 50% от заработной платы.
            newSalary = salary*1.5;
            bonus = 50;
        }

       double newBonus = newSalary-salary; 
       System.out.println("Your new salary is: " + newSalary + " Your bonus was: " + newBonus + ". It was " + bonus + "%");        
    }
}
