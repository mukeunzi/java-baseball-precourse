package baseball.domain;

import baseball.util.RandomNumber;

public class Computer {
    private int[] baseballNumbers;

    public Computer() {
        RandomNumber randomNumber = new RandomNumber(Baseball.BASEBALL_DIGITS);
        this.baseballNumbers = randomNumber.generateRandomNumbers();
    }

    public int[] getBaseballNumber() {
        return baseballNumbers;
    }

    public void setBaseballNumber(int[] baseballNumbers) {
        this.baseballNumbers = baseballNumbers;
    }
}
