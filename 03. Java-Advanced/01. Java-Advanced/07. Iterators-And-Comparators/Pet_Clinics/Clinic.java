package Pet_Clinics;

class Clinic {
    private String name;
    private int numRooms;
    private Pet[] petsInRooms;
    private final Pet emptyRoom = new Pet();

    public Clinic(String name, int numRooms) {
        this.name = name;
        this.numRooms = numRooms;
        this.petsInRooms = new Pet[numRooms];
        for (int i = 0; i < numRooms; i++) {
            this.petsInRooms[i] = this.emptyRoom;
        }
    }

    public boolean addPet(Pet pet) {
        int i = 1;
        int index = this.petsInRooms.length / 2;
        if (this.petsInRooms[index].equals(this.emptyRoom)) {
            this.petsInRooms[index] = pet;
            return true;
        }
        while (i <= index) {
            if (this.petsInRooms[index - i].equals(this.emptyRoom)) {
                this.petsInRooms[index - i] = pet;
                return true;
            }
            if (this.petsInRooms[index + i].equals(this.emptyRoom)) {
                this.petsInRooms[index + i] = pet;
                return true;
            }
            i++;
        }
        return false;
    }

    public boolean release() {
        int index = this.petsInRooms.length / 2;
        for (int i = index; i < this.petsInRooms.length; i++) {
            if (!this.petsInRooms[i].equals(this.emptyRoom)) {
                this.petsInRooms[i] = this.emptyRoom;
                return true;
            }
        }
        for (int i = 0; i <= index; i++) {
            if (!this.petsInRooms[i].equals(this.emptyRoom)) {
                this.petsInRooms[i] = this.emptyRoom;
                return true;
            }
        }
        return false;
    }

    public boolean hasEmptyRooms() {
        for (Pet pet : this.petsInRooms) {
            if (pet.equals(this.emptyRoom)) {
                return true;
            }
        }
        return false;
    }

    public void print() {
        for (Pet petInRoom : this.petsInRooms) {
            System.out.println(petInRoom.equals(this.emptyRoom) ? "Room empty" : petInRoom.toString());
        }
    }

    public void print(int index) {
        System.out.println(this.petsInRooms[index - 1].equals(emptyRoom) ? "Room empty" : this.petsInRooms[index - 1].toString());
    }
}
