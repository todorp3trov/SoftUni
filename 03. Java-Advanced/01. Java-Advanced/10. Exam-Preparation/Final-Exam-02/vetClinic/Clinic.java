package vetClinic;

import java.util.ArrayList;
import java.util.List;

public class Clinic {
    private List<Pet> data;
    private int capacity;

    public Clinic(int capacity) {
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public void add(Pet pet) {
        if (this.capacity > this.data.size()) {
            this.data.add(pet);
        }
    }

    public boolean remove(String name) {
        for (Pet pet : this.data) {
            if (pet.getName().equals(name)) {
                this.data.remove(pet);
                return true;
            }
        }
        return false;
    }

    public Pet getPet(String name, String owner) {
        for (Pet pet : this.data) {
            if (pet.getName().equals(name) && pet.getOwner().equals(owner)) {
                return pet;
            }
        }
        return null;
    }

    public Pet getOldestPet() {
        Pet oldestPet = null;

        for (Pet pet : this.data) {
            if (oldestPet == null || pet.getAge() > oldestPet.getAge()) {
                oldestPet = pet;
            }
        }

        return oldestPet;
    }

    public int getCount() {
        return this.data.size();
    }

    public String getStatistics() {
        StringBuilder sb = new StringBuilder();

        sb.append("The clinic has the following patients:").append(System.lineSeparator());
        for (Pet pet : this.data) {
            sb.append(String.format("%s %s", pet.getName(), pet.getOwner())).append(System.lineSeparator());
        }

        return sb.toString();
    }
}
