package baseball.domain;

public class Computer {
    private int[] baseballNumber;

    public Computer(int[] baseballNumber) {
        this.baseballNumber = baseballNumber;
    }

    public int[] getBaseballNumber() {
        return baseballNumber;
    }

    public void setBaseballNumber(int[] baseballNumber) {
        this.baseballNumber = baseballNumber;
    }
}
