package baseball.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("BaseballGameService 클래스 테스트 시작")
public class BaseballGameServiceTest {
    @Test
    @DisplayName("1볼 1스트라이크가 잘 출력되는지 확인")
    public void checkBallAndStrike() {
        BaseballGameService baseballGameService = new BaseballGameService();
        String hint = baseballGameService.analyzeResultMessage(1, 1);
        assertThat(hint).isEqualTo("1볼 1스트라이크");
    }

    @Test
    @DisplayName("1볼이 잘 출력되는지 확인")
    public void checkBall() {
        BaseballGameService baseballGameService = new BaseballGameService();
        String hint = baseballGameService.analyzeResultMessage(1, 0);
        assertThat(hint).isEqualTo("1볼");
    }

    @Test
    @DisplayName("2스트라이크가 잘 출력되는지 확인")
    public void checkStrike() {
        BaseballGameService baseballGameService = new BaseballGameService();
        String hint = baseballGameService.analyzeResultMessage(0, 2);
        assertThat(hint).isEqualTo("2스트라이크");
    }

    @Test
    @DisplayName("낫싱이 잘 출력되는지 확인")
    public void checkNothing() {
        BaseballGameService baseballGameService = new BaseballGameService();
        String hint = baseballGameService.analyzeResultMessage(0, 0);
        assertThat(hint).isEqualTo("낫싱");
    }
}
