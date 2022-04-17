package baseball.controller;

import baseball.exception.InvalidParameterError;
import baseball.message.ErrorMessage;
import baseball.service.BaseballGameService;
import baseball.view.PrintGameMessage;
import camp.nextstep.edu.missionutils.Console;

public class BaseballGameController {
    private int gameState;
    private static final int START = 1;
    private static final int STOP = 2;
    private BaseballGameService baseballGameService;

    public void run() {
        initializeGame();
        startGame();
        retry();
    }

    public void initializeGame() {
        this.gameState = BaseballGameController.START;
    }

    public void startGame() {
        baseballGameService = new BaseballGameService();
        baseballGameService.play();
    }

    public void retry() {
        PrintGameMessage.printRetry();
        int retryAnswer = inputUserAnswer();
        if (retryAnswer == BaseballGameController.START) {
            run();
        }
        if (retryAnswer == BaseballGameController.STOP) {
            PrintGameMessage.printEndMessage();
        }
    }

    public int inputUserAnswer() {
        int userInput = Integer.parseInt(Console.readLine());
        if (userInput < BaseballGameController.START || userInput > BaseballGameController.STOP) {
            throw new InvalidParameterError(ErrorMessage.RETRY_ERROR);
        }

        return userInput;
    }
}
