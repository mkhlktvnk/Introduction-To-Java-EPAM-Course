public class Main {
    public static void main(String[] args) {
        DecimalCounter decimalCounter = new DecimalCounter();
        decimalCounter.increase();
        System.out.println(decimalCounter.getState());
        decimalCounter.decrease();
        System.out.println(decimalCounter.getState());

        for (int i = 0; i < 10; i++) {
            decimalCounter.increase();
            System.out.println(decimalCounter.getState());
        }

        for (int i = 0; i < 10; i++) {
            decimalCounter.decrease();
            System.out.println(decimalCounter.getState());
        }

        DecimalCounter secondDecimalCounter = new DecimalCounter(0, 100, 200);

        for (int i = 0; i < 100; i++) {
            secondDecimalCounter.increase();
            System.out.println(secondDecimalCounter.getState());
        }

        // Exception: value is out of bounds [100; 200]
        for (int i = 0; i < 200; i++) {
            secondDecimalCounter.decrease();
            System.out.println(secondDecimalCounter.getState());
        }
    }
}
