public class Test2 {
    private int a;
    private int b;

    public Test2() {
        this.a = 0;
        this.b = 0;
    }

    public Test2(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getSum() {
        return a + b;
    }

    public int getMax() {
        return Math.max(a, b);
    }
}
