package baseball.message;

import baseball.domain.Baseball;

public class GameMessage {
    public static final String INPUT_MESSAGE = "숫자를 입력해주세요 : ";
    public static final String BALL_MESSAGE = "볼";
    public static final String STRIKE_MESSAGE = "스트라이크";
    public static final String NOTHING_MESSAGE = "낫싱";
    public static final String RETRY_MESSAGE = Baseball.BASEBALL_DIGITS + "개의 숫자를 모두 맞히셨습니다! 게임 종료" + "\n" + "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";
    public static final String END_MESSAGE = "게임이 종료되었습니다.";
}
