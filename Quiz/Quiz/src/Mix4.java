public class Mix4 {

     int counter = 0;

    

     public static void main(String[] args) {

          int count = 0;

          Mix4[] m4 = new Mix4[5];

          for(int x = 0; x < m4.length; x++) {

               m4[x] = new Mix4();

               m4[x].counter = m4[x].counter+1;

               count = count + m4[x].maybeNew(x);

          }

          System.out.print(count+" "+m4[1].counter);

     }

 

     public int maybeNew(int index) {

          if(index < 5) {

               Mix4 m4 = new Mix4();

               m4.counter = m4.counter+1;

               return 1;

          }

          return 0;

     }

}