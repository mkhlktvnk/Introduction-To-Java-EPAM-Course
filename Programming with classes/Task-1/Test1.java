public class Test1 {
    private int a;
    private int b;

    public Test1(int a, int b) {
        this.a = a;
        this.b = b;
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
