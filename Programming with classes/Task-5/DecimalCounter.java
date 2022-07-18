public class DecimalCounter {
    private int state;
    private final int minValue;
    private final int maxValue;

    public DecimalCounter() {
        this.state = 0;
        this.minValue = 0;
        this.maxValue = 10;
    }

    public DecimalCounter(int state, int minValue, int maxValue) {
        this.state = state;
        this.minValue = minValue;
        this.maxValue = maxValue;
    }

    public void increase() {
        checkIncreaseOperation();
        state++;
    }

    public void decrease() {
        checkDecreaseOperation();
        state--;
    }

    public int getState() {
        return state;
    }

    private void checkIncreaseOperation() {
        if (state + 1 > maxValue) {
            String message = String.format("value %d is out of bounds [%d; %d]", state + 1, minValue, maxValue);
            throw new IndexOutOfBoundsException(message);
        }
    }

    private void checkDecreaseOperation() {
        if (state - 1 < minValue) {
            String message = String.format("value %d is out of bounds [%d; %d]", state - 1, minValue, maxValue);
            throw new IndexOutOfBoundsException(message);
        }
    }
}
