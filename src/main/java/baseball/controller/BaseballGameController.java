package baseball.controller;

import baseball.domain.Baseball;
import baseball.domain.Computer;
import baseball.domain.User;
import baseball.service.BaseballGameService;
import baseball.view.PrintGameMessage;
import camp.nextstep.edu.missionutils.Console;

public class BaseballGameController {
    private BaseballGameService baseballGameService;
    private Computer computer;
    private User user;
    private Baseball baseball;

    public void run() {
        baseballGameService = new BaseballGameService();
        computer = new Computer();
        user = new User();
        baseball = new Baseball();

        start();
    }

    public void start() {
        PrintGameMessage.printInputMessage();
        int userInput[] = getUserInput();

        user.setBaseballNumber(userInput);
    }

    public int[] getUserInput() {
        String userInput = Console.readLine();
        baseball.validateInput(userInput);

        int userBaseball[] = new int[userInput.length()];
        for (int i = 0; i < userInput.length(); i++) {
            userBaseball[i] = userInput.charAt(i) - '0';
        }
        return userBaseball;
    }
}
