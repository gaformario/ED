public class Main {
    public static void main(String[] args) {
        
        Ponto<Integer> p = new Ponto<Integer>(2, 5);
        System.out.println(p);

        Ponto2<Double,Integer> p2 = new Ponto2<Double,Integer>(2.5, 15);
        System.out.println(p2);
    }
}
