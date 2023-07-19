public class break_continue {
    public static void main(String args[]){
        int i;
        int a;
        i = 1;
        a = 3;
        // while(i <= 5){
        //     System.out.println(i + ": running!");
        //     if (i == a)
        //         break;
        //     i++;
        // }

        // while(i <= 5){
        //     System.out.println(i + ": running!");
        //     if (i == a)
        //         continue;
        //     i++;
        // }

        while(i <= 5){
            System.out.println(i + ": running!");
            if (i == a) { 
                i+=2;
                continue;                
            }
            i++;
        }
    }

}
