package baseball.service;

import baseball.domain.GameState;

public class BaseballGameService {
    private GameState gameState;

    public BaseballGameService() {
        this.gameState = GameState.START;
    }
}
