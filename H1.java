import java.util.Scanner;

public class H1 {
    // Необходимо написать программу, где бы пользователю предлагалось ввести 3
    // числа. Нужно: проверить какое число большее и какое меньшее из 3-ёх, а также
    // посчитать среднее арифметическое.

    public static void main(String[] args) {
        System.out.println("Enter 3 numbers:");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        System.out.print("Maximum is: ");
        if (a > b && a > c) {
            System.out.println(a);
        }

        else if (b >= a && b >= c) {
            System.out.println(b);
        }

        else {
            System.out.println(c);
        }

        System.out.print("Minimum is: ");
        if (a <= b && a <= c) {
            System.out.println(a);
        }

        else if (b <= a && b <= c) {
            System.out.println(b);
        }

        else  {
            System.out.println(c);
        }

        double avrg;
        avrg = (a + b + c) / 3;
        System.out.println("Average is: " + (avrg));

        // Необходимо написать программу, где бы пользователю предлагалось ввести
        // порядковый номер дня недели. Результат - в консоль будет выведено текстовое
        // название дня (пример: при вводе 6 - получим результат - пятница). Также, при
        // вводе неверного дня - программа выдаёт сообщение об ошибке. При написании
        // программы использовать switch case.
        System.out.println("Enter day number:");
        int dayNum = scan.nextInt();

        switch (dayNum) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Wrong Day number");
        }

        // Необходимо написать следующую программу:
        // Создайте две переменные:
        // String username = "Admin";
        // String password = "P@ssword";
        // Получите данные и сравните с username. Если данные не верны то выведите:
        // “Нет пользователя с таким именем!”
        // Если верно то попросите ввести пароль. Сравните с password. Если данные не
        // верны то выведите:
        // “Вы ввели неверный пароль!”
        // Если данные верны то выведите:
        // "Здравствуйте " + username + ", Вы вошли в систему."

        String username = "Admin";
        String password = "P@ssword";
        String name;
        String pass;        

        
       System.out.print("Username: ");
        name = scan.next();
       
        if (name.equals(username)){
            System.out.print("Password: ");
            pass = scan.next();
            if (pass.equals(password)){
                System.out.println("Hello, " + username + ". You are logged in.");
            }
            else{
                System.out.println("Wrong password");            
        }
        }
        else{
            System.out.println("No such username!");           
        }  

        scan.close();

        
    }
}
