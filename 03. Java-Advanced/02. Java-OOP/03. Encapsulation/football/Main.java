package football;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Team> teams = new HashMap<>();

        String input = reader.readLine();
        while (!input.equals("END")) {
            String[] data = input.split(";");

            try {
                switch (data[0]) {
                    case "Team":
                        teams.putIfAbsent(data[1], new Team(data[1]));
                        break;
                    case "Add":
                        checkIfTeamExists(teams, data[1]);
                        Player player = new Player(data[2], Integer.parseInt(data[3]), Integer.parseInt(data[4]),
                                Integer.parseInt(data[5]), Integer.parseInt(data[6]), Integer.parseInt(data[7]));
                        teams.get(data[1]).addPlayer(player);
                        break;
                    case "Remove":
                        checkIfTeamExists(teams, data[1]);
                        teams.get(data[1]).removePlayer(data[2]);
                        break;
                    case "Rating":
                        checkIfTeamExists(teams, data[1]);
                        System.out.println(data[1] + " - " + ((int) Math.round(teams.get(data[1]).getRating())));
                        break;
                }
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }

            input = reader.readLine();
        }
    }

    private static void checkIfTeamExists(Map<String, Team> teams, String teamName) {
        if (!teams.containsKey(teamName)) {
            throw new IllegalArgumentException("Team " + teamName + " does not exist.");
        }
    }
}
