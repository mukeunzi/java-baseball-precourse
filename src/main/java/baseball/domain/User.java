package baseball.domain;

public class User {
    private int[] baseballNumbers;

    public User() {
        this.baseballNumbers = new int[Baseball.BASEBALL_DIGITS];
    }

    public int[] getBaseballNumber() {
        return baseballNumbers;
    }

    public void setBaseballNumber(int[] baseballNumbers) {
        this.baseballNumbers = baseballNumbers;
    }
}
