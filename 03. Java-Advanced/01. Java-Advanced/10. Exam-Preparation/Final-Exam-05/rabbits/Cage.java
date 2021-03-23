package rabbits;

import java.util.ArrayList;
import java.util.List;

public class Cage {
    private String name;
    private int capacity;
    private List<Rabbit> data;

    public Cage(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void add(Rabbit rabbit) {
        if (this.data.size() < this.capacity) {
            this.data.add(rabbit);
        }
    }

    public boolean removeRabbit(String name) {
        for (Rabbit rabbit : this.data) {
            if (rabbit.getName().equals(name)) {
                this.data.remove(rabbit);
                return true;
            }
        }
        return false;
    }

    public void removeSpecies(String species) {
        List<Rabbit> toBeRemoved = new ArrayList<>();
        for (Rabbit rabbit : this.data) {
            if (rabbit.getSpecies().equals(species)) {
                toBeRemoved.add(rabbit);
            }
        }
        this.data.removeAll(toBeRemoved);
    }

    public Rabbit sellRabbit(String name) {
        for (Rabbit rabbit : this.data) {
            if (rabbit.getName().equals(name) && rabbit.isAvailable()) {
                rabbit.setAvailable(false);
                return rabbit;
            }
        }
        return null;
    }

    public List<Rabbit> sellRabbitBySpecies(String species) {
        List<Rabbit> toBeSold = new ArrayList<>();
        for (Rabbit rabbit : this.data) {
            if (rabbit.getSpecies().equals(species) && rabbit.isAvailable()) {
                rabbit.setAvailable(false);
                toBeSold.add(rabbit);
            }
        }
        return toBeSold;
    }

    public int count() {
        return this.data.size();
    }

    public String report() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Rabbits available at %s:", getName())).append(System.lineSeparator());
        for (Rabbit rabbit : this.data) {
            if (rabbit.isAvailable()) {
                sb.append(rabbit.toString()).append(System.lineSeparator());
            }
        }
        return sb.toString();
    }
}
