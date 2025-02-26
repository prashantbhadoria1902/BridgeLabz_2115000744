package ProblemStatement;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.util.Arrays;
import java.util.List;

public class JsonProcessor {
    public static void main(String[] args) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();

        // Read JSON
        List<IPLMatch> matches = Arrays.asList(objectMapper.readValue(new File("src/main/resources/ipl.json"), IPLMatch[].class));

        // Apply censorship
        for (IPLMatch match : matches) {
            match.team1 = Censorship.maskTeamName(match.team1);
            match.team2 = Censorship.maskTeamName(match.team2);
            match.winner = Censorship.maskTeamName(match.winner);
            match.playerOfMatch = Censorship.redactPlayer(match.playerOfMatch);
        }

        // Write Censored JSON
        objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File("src/main/resources/ipl_censored.json"), matches);

        System.out.println("Censored JSON file created!");
    }
}
