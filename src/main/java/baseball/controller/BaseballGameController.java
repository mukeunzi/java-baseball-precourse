package baseball.controller;

import baseball.domain.GameState;
import baseball.exception.InvalidParameterError;
import baseball.message.ErrorMessage;
import baseball.service.BaseballGameService;
import baseball.view.PrintGameMessage;
import camp.nextstep.edu.missionutils.Console;

public class BaseballGameController {
    private GameState gameState;
    private BaseballGameService baseballGameService;

    public void run() {
        initializeGame();
        startGame();
        retry();
    }

    public void initializeGame() {
        this.gameState = GameState.START;
    }

    public void startGame() {
        baseballGameService = new BaseballGameService();
        baseballGameService.play();
    }

    public void retry() {
        PrintGameMessage.printRetry();
        int retryAnswer = inputUserAnswer();
        if (retryAnswer == 1) {
            run();
        }
        if (retryAnswer == 2) {
            PrintGameMessage.printEndMessage();
        }
    }

    public int inputUserAnswer() {
        int userInput = Integer.parseInt(Console.readLine());
        if (userInput <= 0 || userInput >= 3) {
            throw new InvalidParameterError(ErrorMessage.RETRY_ERROR);
        }

        return userInput;
    }
}
