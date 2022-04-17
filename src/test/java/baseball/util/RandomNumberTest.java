package baseball.util;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("RandomNumber 클래스 테스트 시작")
public class RandomNumberTest {
    @Test
    @DisplayName("세자리 랜덤숫자 생성 확인")
    public void checkGenerateRandomNumbers() {
        int digits = 3;

        RandomNumber randomNumber = new RandomNumber(digits);
        int randomNumbers[] = randomNumber.generateRandomNumbers();
        HashSet<Integer> randomNumberSet = new HashSet<>();
        for (int number : randomNumbers) {
            randomNumberSet.add(number);
        }

        assertThat(randomNumbers.length).isEqualTo(digits);
        assertThat(randomNumberSet.size()).isEqualTo(digits);
    }
}
