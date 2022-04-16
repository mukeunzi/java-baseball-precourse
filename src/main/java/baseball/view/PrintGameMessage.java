package baseball.view;

import baseball.message.GameMessage;

public class PrintGameMessage {
    public static void printInputMessage() {
        System.out.print(GameMessage.INPUT_MESSAGE);
    }

    public static void printHint(int ballCount, int strikeCount) {
        String hint = "";
        if (ballCount > 0) {
            hint += ballCount + GameMessage.BALL_MESSAGE + " ";
        }
        if (strikeCount > 0) {
            hint += strikeCount + GameMessage.STRIKE_MESSAGE;
        }
        System.out.println(hint.length() > 0 ? hint.trim() : GameMessage.NOTHING_MESSAGE);
    }

    public static void printRetry() {
        System.out.println(GameMessage.RETRY_MESSAGE);
    }

    public static void printEndMessage() {
        System.out.println(GameMessage.END_MESSAGE);
    }
}
