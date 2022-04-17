package baseball.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("User 클래스 테스트 시작")
public class UserTest {
    @Test
    @DisplayName("생성자함수 호출 시 야구공 번호를 저장하는 멤버변수 초기화")
    public void initializeUser() {
        User user = new User();
        assertThat(user.getBaseballNumbers().length).isEqualTo(3);
    }
}
