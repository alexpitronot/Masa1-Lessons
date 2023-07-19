public class randomnum {
    public static void main(String args[]) {

        double a = Math.random();    //1   
        System.out.println ("from 0 to 1: " + a);

                                    //2

        //чтобы получить случайное вещественное число из промежутка [0;3), (3 исключительно)

        double b = Math.random()*3;
		
		System.out.println("from 0 to 3: " + b);

        // необходимо получить число с плавающей точкой в интервале [2; 3), (3 исключительно)

        double c = Math.random()+2;
		
		System.out.println("from 2 to 3: " + c);

        // необходимо получить вещественное число в интервале [20; 60) (60 исключительно)

        double d = 20 + Math.random()*40;
		
		System.out.println("from 20 to 60: " + d);

                                 //3
                                //  необходимо сгенерировать число в интервале [0;10] (2 включительно)
        int e = (int) ( Math.random() * 11 );
        System.out.println("int from 0 to 10: " + e);
    }
}
