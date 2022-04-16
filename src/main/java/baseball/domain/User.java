package baseball.domain;

public class User {
    private int[] baseballNumber;

    public User(int[] baseballNumber) {
        this.baseballNumber = baseballNumber;
    }

    public int[] getBaseballNumber() {
        return baseballNumber;
    }

    public void setBaseballNumber(int[] baseballNumber) {
        this.baseballNumber = baseballNumber;
    }
}
