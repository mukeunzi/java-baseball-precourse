package baseball.service;

import baseball.domain.Baseball;
import baseball.domain.Computer;
import baseball.domain.User;
import baseball.view.PrintGameMessage;
import camp.nextstep.edu.missionutils.Console;

import java.util.Arrays;
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
}
