package baseball.view;

import baseball.message.GameMessage;

public class PrintGameMessage {
    public static void printInputMessage() {
        System.out.print(GameMessage.INPUT_MESSAGE);
    }

    public static void printHint(String hint) {
        System.out.println(hint);
    }

    public static void printRetry() {
        System.out.println(GameMessage.RETRY_MESSAGE);
    }

    public static void printEndMessage() {
        System.out.println(GameMessage.END_MESSAGE);
    }
}
