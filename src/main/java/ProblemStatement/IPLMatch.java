package ProblemStatement;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

public class IPLMatch {
    @JsonProperty("match_id")
    public int matchId;
    @JsonProperty("team1")
    public String team1;
    @JsonProperty("team2")
    public String team2;
    @JsonProperty("score")
    public Map<String, Integer> score;
    @JsonProperty("winner")
    public String winner;
    @JsonProperty("player_of_match")
    public String playerOfMatch;

    public IPLMatch() {}

    public IPLMatch(int matchId, String team1, String team2, Map<String, Integer> score, String winner, String playerOfMatch) {
        this.matchId = matchId;
        this.team1 = team1;
        this.team2 = team2;
        this.score = score;
        this.winner = winner;
        this.playerOfMatch = playerOfMatch;
    }
}
