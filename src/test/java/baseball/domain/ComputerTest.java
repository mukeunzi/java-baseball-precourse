package baseball.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Computer 클래스 테스트 시작")
public class ComputerTest {
    @Test
    @DisplayName("생성자함수 호출 시 야구공 번호를 저장하는 멤버변수 초기화")
    public void initializeComputer() {
        Computer computer = new Computer();
        assertThat(computer.getBaseballNumber().length).isEqualTo(3);
    }
}
