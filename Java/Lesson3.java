public class Lesson3 {
	public static void main(String[] args) {
		// int k = 70;
		// int p = 10;
		// int f = 5;
		// int m = k+p; 
		// System.out.println("m=" + m); 
		// m = m-30;
		// System.out.println("m=" + m);
		// int s = m*f;
		// System.out.println ("s=" + s);
		// s =s/k;
		// System.out.println("s=" + s);

        // System.out.println(p%3);
		// int a = 10;
        // int b = 3;
        // System.out.println(a / b + " " + a % b + "/" + b); 
		
        // int m = 2;
		// m+= 7;
		// System.out.print (m);
        
        // int n = 2;
		// n++;
		// System.out.println(n);

        // int n1 = 2;
		// n1--;
		// System.out.println(n1);

        // int n = 2;
		// int k = 2;
		// int a = 2 * n++; //теперь значение a равно 4, а n равно 3
		// int b = 2 * ++k; //теперь значение b равно 6, а k равно 3
		// System.out.println(a);
		// System.out.println(n);
		// System.out.println(b);
		// System.out.println(k);
		int i1=5;
		int i2=11;
		double d1 = 5.5;
		double d2 = 1.3;
		long l = 20l;
		double result=0;
		result = i2 / d1 + d2 % i1 - l;
		System.out.println(i2 / d1);
		System.out.println(d2 % i1);
		System.out.println(result);


		int a = 5;
		int b = 8;
		System.out.println(a-- - --a + ++a + a++ +a);
		System.out.println(++b - b++ + ++b - --b);
	}
}
