package ProblemStatement;

import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CsvProcessor {
    public static void main(String[] args) throws Exception {
        CsvMapper csvMapper = new CsvMapper();
        CsvSchema schema = CsvSchema.emptySchema().withHeader();

        // Read CSV
        MappingIterator<Map<String, String>> iterator = csvMapper.readerFor(Map.class).with(schema).readValues(new File("src/main/resources/ipl.csv"));
        List<Map<String, String>> matches = iterator.readAll();

        // Apply censorship
        for (Map<String, String> match : matches) {
            match.put("team1", Censorship.maskTeamName(match.get("team1")));
            match.put("team2", Censorship.maskTeamName(match.get("team2")));
            match.put("winner", Censorship.maskTeamName(match.get("winner")));
            match.put("player_of_match", Censorship.redactPlayer(match.get("player_of_match")));
        }

        // Write Censored CSV
        CsvSchema outputSchema = CsvSchema.builder()
                .addColumn("match_id")
                .addColumn("team1")
                .addColumn("team2")
                .addColumn("score_team1")
                .addColumn("score_team2")
                .addColumn("winner")
                .addColumn("player_of_match")
                .setUseHeader(true)
                .build();

        csvMapper.writer(outputSchema).writeValue(new File("src/main/resources/ipl_censored.csv"), matches);

        System.out.println("Censored CSV file created!");
    }
}
