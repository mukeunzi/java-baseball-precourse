package baseball.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

@DisplayName("Baseball 클래스 테스트 시작")
public class BaseballTest {
    @Test
    @DisplayName("생성자함수 호출 시 볼, 스트라이크 횟수 0으로 초기화")
    public void initializeBaseball() {
        Baseball baseball = new Baseball();
        assertThat(baseball.getBallCount()).isEqualTo(0);
        assertThat(baseball.getStrikeCount()).isEqualTo(0);
    }

    @Test
    @DisplayName("야구공 게임의 조건, 범위를 담고있는 static 변수 확인")
    public void checkStaticVariable() {
        assertThat(Baseball.BASEBALL_DIGITS).isEqualTo(3);
        assertThat(Baseball.MIN_NUMBER).isEqualTo(1);
        assertThat(Baseball.MAX_NUMBER).isEqualTo(9);
    }


    @Test
    @DisplayName("볼 횟수가 잘 누적되는지 확인")
    public void checkIncreaseBallCount() {
        Baseball baseball = new Baseball();
        baseball.increaseBallCount();
        assertThat(baseball.getBallCount()).isEqualTo(1);
    }

    @Test
    @DisplayName("스트라이크 횟수가 잘 누적되는지 확인")
    public void checkIncreaseStrikeCount() {
        Baseball baseball = new Baseball();
        baseball.increaseStrikeCount();
        baseball.increaseStrikeCount();
        assertThat(baseball.getStrikeCount()).isEqualTo(2);
    }

    @Test
    @DisplayName("입력 값을 초과했을 경우 오류 확인")
    public void checkValidateInputWithExceedDigits() {
        assertThatThrownBy(() -> {
            Baseball.validateInput("1543");
        }).isInstanceOf(Exception.class)
                .hasMessageContaining("3자리 숫자만 입력할 수 있습니다.");
    }

    @Test
    @DisplayName("입력 값이 작을 경우 오류 확인")
    public void checkValidateInputWithShortDigits() {
        assertThatThrownBy(() -> {
            Baseball.validateInput("15");
        }).isInstanceOf(Exception.class)
                .hasMessageContaining("3자리 숫자만 입력할 수 있습니다.");
    }

    @Test
    @DisplayName("입력 값이 1~9 사이가 아닐 경우 오류 확인")
    public void checkValidateInputWithZero() {
        assertThatThrownBy(() -> {
            Baseball.validateInput("098");
        }).isInstanceOf(Exception.class)
                .hasMessageContaining("숫자만 입력할 수 있습니다.");
    }

    @Test
    @DisplayName("입력 값이 중복일 경우 오류 확인")
    public void checkValidateInputWithDuplication() {
        assertThatThrownBy(() -> {
            Baseball.validateInput("113");
        }).isInstanceOf(Exception.class)
                .hasMessageContaining("중복되지 않는 숫자만 입력할 수 있습니다.");
    }
}
