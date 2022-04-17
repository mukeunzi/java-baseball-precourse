package baseball.service;

import baseball.domain.Baseball;
import baseball.domain.Computer;
import baseball.domain.User;
import baseball.message.GameMessage;
import baseball.view.PrintGameMessage;
import camp.nextstep.edu.missionutils.Console;

import java.util.HashMap;

public class BaseballGameService {
    private Computer computer;
    private User user;
    private Baseball baseball;
    private HashMap<Integer, Integer> computerBaseballMap;

    public BaseballGameService() {
        this.user = new User();
        this.computer = new Computer();
        this.baseball = new Baseball();
        this.computerBaseballMap = new HashMap<>();

        for (int i = 0; i < this.computer.getBaseballNumber().length; i++) {
            this.computerBaseballMap.put(this.computer.getBaseballNumber()[i], i);
        }
    }

    public void play() {
        while (this.baseball.getStrikeCount() != Baseball.BASEBALL_DIGITS) {
            this.baseball = new Baseball();

            PrintGameMessage.printInputMessage();
            inputUserBaseball();
            printGameResult();
        }
    }

    public void inputUserBaseball() {
        String userInput = Console.readLine();
        Baseball.validateInput(userInput);

        int userBaseball[] = new int[userInput.length()];
        for (int i = 0; i < userInput.length(); i++) {
            userBaseball[i] = userInput.charAt(i) - '0';
        }
        user.setBaseballNumbers(userBaseball);
    }

    public void checkBallCount() {
        for (int i = 0; i < this.user.getBaseballNumbers().length; i++) {
            int computerIndex = computerBaseballMap.getOrDefault(this.user.getBaseballNumbers()[i], -1);
            if (computerIndex < 0 || computerIndex == i) {
                continue;
            }

            this.baseball.increaseBallCount();
        }
    }

    public void checkStrikeCount() {
        for (int i = 0; i < this.user.getBaseballNumbers().length; i++) {
            int computerIndex = computerBaseballMap.getOrDefault(this.user.getBaseballNumbers()[i], -1);
            if (computerIndex < 0 || computerIndex != i) {
                continue;
            }

            this.baseball.increaseStrikeCount();
        }
    }

    public void printGameResult() {
        checkBallCount();
        checkStrikeCount();

        String resultMessage = analyzeResultMessage(this.baseball.getBallCount(), this.baseball.getStrikeCount());
        PrintGameMessage.printHint(resultMessage);
    }

    public String analyzeResultMessage(int ballCount, int strikeCount) {
        String hint = "";
        if (ballCount > 0) {
            hint += ballCount + GameMessage.BALL_MESSAGE + " ";
        }
        if (strikeCount > 0) {
            hint += strikeCount + GameMessage.STRIKE_MESSAGE;
        }
        return hint.length() > 0 ? hint.trim() : GameMessage.NOTHING_MESSAGE;
    }
}
