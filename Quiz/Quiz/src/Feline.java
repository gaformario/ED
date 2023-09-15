public class Feline {

 

     public static void main(String[] args) {

         int x = 42, y = 44;

         System.out.print(" " + 7 + 2 + " ");

         System.out.print(foo() + x + 5 + " ");

         System.out.print(x + y + foo());

     }

 

     private static String foo() {

         return "foo";

     }

}