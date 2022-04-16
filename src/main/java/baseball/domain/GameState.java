package baseball.domain;

public enum GameState {
    START(1),
    STOP(2);

    private int state;

    private GameState(int state) {
        this.state = state;
    }

    public int getState() {
        return state;
    }
}

