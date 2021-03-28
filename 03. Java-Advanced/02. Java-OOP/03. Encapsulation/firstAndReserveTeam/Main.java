package firstAndReserveTeam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Person> players = new ArrayList<>();

        int n = Integer.parseInt(reader.readLine());
        for (int i = 0; i < n; i++) {
            String[] data = reader.readLine().split(" ");
            players.add(new Person(data[0], data[1], Integer.parseInt(data[2]), Double.parseDouble(data[3])));
        }

        Team team = new Team("Black Eagles");
        for (Person player : players) {
            team.addPlayer(player);
        }

        System.out.println("First team have: " + team.getFirstTeam().size() + " players");
        System.out.println("Reserve team have: " + team.getReserveTeam().size() + " players");
    }
}
