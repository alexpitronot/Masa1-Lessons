import java.util.Scanner;

public class CoffeMachine {
    public static void main(String[] args) {  

        System.out.println("Your budget: ");
		Scanner scan = new Scanner(System.in);
		int budget = scan.nextInt();

        if (budget >0) { // Если бюджет больше чем 0
            System.out.println("Choose your coffe: 1 - Latte (20$), 2 - Capucino (15$), 3 - Mocha (16$), 4 - Americano (5$)"); // попросит выбрать номер напитка. (4 варианта и цены).

            Scanner coffeChoice = new Scanner(System.in);
            int numcoffeChoiceber = coffeChoice.nextInt();

            int change =0, wrongCase = 0;
            String coffeName ="";

            switch (numcoffeChoiceber){ // подсчёт сдачи и название напитка
                case 1: change = budget - 20; coffeName = "Latte"; break;
                case 2: change = budget - 15; coffeName = "Capucino"; break;
                case 3: change = budget - 16; coffeName = "Mocha"; break;
                case 4: change = budget - 5; coffeName = "Americano"; break;
                default: wrongCase = 1; // нет такого кофе
            }

            /* Если да -> сообщение о завершении покупки. А также выведет сдачу.
                Если нет -> Сообщение о нехватке бюджета.
            */
            
            if (change>=0) {     // программа проверит достаточно ли бюджета для покупки  
                if (wrongCase == 0)
                {           
                    System.out.println("You bought: " + coffeName + ". And your change is: " + change + "$");
                }
                else {
                   System.out.println("There is no such choice!"); 
                }
            }
            else {                
                System.out.println("You don't have enough money to bye: " + coffeName + ". Add " + -change + "$"); 
            }
		
            coffeChoice.close();
        }

        else if (budget == 0) { // Если бюджет равен 0
            System.out.println("Your budget is 0, no coffe today! ");
        }

        else { // Если бюджет меньше чем 0 
            int ownUs = 0-budget;
            System.out.println("Your budget low then 0! You own us - " + ownUs + "$");
        }

        scan.close();
    }
}
