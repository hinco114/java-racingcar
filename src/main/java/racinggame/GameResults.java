package racinggame;

import java.util.ArrayList;
import java.util.List;

public class GameResults {
    private final List<GameResult> gameResults;

    public GameResults() {
        this.gameResults = new ArrayList<>();
    }

    public List<GameResult> getGameResults() {
        return gameResults;
    }
}
