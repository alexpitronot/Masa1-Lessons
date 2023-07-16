public class foreach {
    public static void main(String[] args) {
    
        int[] array = {51,136, 387};
 
           for (int i = 0; i < array.length; i++) {
           System.out.println(array[i]);
           }

        int[] array1 = {51,136,387};
 
           for (int i:array1) {
           System.out.println(i);
           }
    }
}
