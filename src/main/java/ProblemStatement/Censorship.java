package ProblemStatement;

public class Censorship {
    public static String maskTeamName(String team) {
        String[] words = team.split(" ");
        if (words.length > 1) {
            words[words.length - 1] = "***";
        }
        return String.join(" ", words);
    }

    public static String redactPlayer(String player) {
        return "REDACTED";
    }
}
