package baseball.util;

import baseball.domain.Baseball;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.HashSet;

public class RandomNumber {
    private int index;
    private int[] numbers;
    private HashSet<Integer> numberSet;

    public RandomNumber(int length) {
        this.index = 0;
        this.numbers = new int[length];
        this.numberSet = new HashSet<>();
    }

    public int[] generateRandomNumbers() {
        while (this.numberSet.size() != this.numbers.length) {
            this.numberSet.add(getRandomNumber());
        }

        for (int number : this.numberSet) {
            this.numbers[this.index++] = number;
        }
        return this.numbers;
    }

    private int getRandomNumber() {
        int randomNumber = Randoms.pickNumberInRange(Baseball.MIN_NUMBER, Baseball.MAX_NUMBER);
        return randomNumber;
    }
}
