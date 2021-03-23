package guild;

import java.util.ArrayList;
import java.util.List;

public class Guild {
    private List<Player> roster;
    private String name;
    private int capacity;

    public Guild(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.roster = new ArrayList<>();
    }

    public void addPlayer(Player player) {
        if (this.roster.size() < this.capacity) {
            this.roster.add(player);
        }
    }

    public boolean removePlayer(String name) {
        for (Player player : this.roster) {
            if (player.getName().equals(name)) {
                this.roster.remove(player);
                return true;
            }
        }
        return false;
    }

    public void promotePlayer(String name) {
        for (Player player : this.roster) {
            if (player.getName().equals(name)) {
                player.setRank("Member");
                return;
            }
        }
    }

    public void demotePlayer(String name) {
        for (Player player : this.roster) {
            if (player.getName().equals(name)) {
                player.setRank("Trial");
                return;
            }
        }
    }

    public Player[] kickPlayersByClass(String clazz) {
        List<Player> result = new ArrayList<>();
        for (Player player : this.roster) {
            if (player.getClazz().equals(clazz)) {
                result.add(player);
            }
        }
        this.roster.removeAll(result);
        return result.toArray(new Player[0]);
    }

    public int count() {
        return this.roster.size();
    }

    public String report() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Players in the guild: %s:", this.name)).append(System.lineSeparator());
        for (Player player : this.roster) {
            sb.append(player.toString()).append(System.lineSeparator());
        }
        return sb.toString();
    }
}
