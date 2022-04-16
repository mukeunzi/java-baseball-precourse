package baseball.domain;

public class User {
    private int[] baseballNumbers;

    public User() {
        this.baseballNumbers = new int[Baseball.BASEBALL_DIGITS];
    }

    public int[] getBaseballNumbers() {
        return baseballNumbers;
    }

    public void setBaseballNumbers(int[] baseballNumbers) {
        this.baseballNumbers = baseballNumbers;
    }
}
