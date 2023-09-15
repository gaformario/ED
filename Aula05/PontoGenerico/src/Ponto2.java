public class Ponto2<T, K> {
    T x;
    K y;

    public Ponto2(T x, K y) {
        this.x = x;
        this.y = y;

    }

    @Override
    public String toString() {
        return "x = " + x + ", y = " + y;

    }
}