package Pet_Clinics;

class Pet {
    private String name;
    private int age;
    private String kind;

    public Pet() {
        this.name = "default";
        this.age = -1;
        this.kind = "default";
    }

    public Pet(String name, int age, String kind) {
        this.name = name;
        this.age = age;
        this.kind = kind;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getKind() {
        return kind;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj.getClass() != this.getClass()) {
            return false;
        }
        Pet other = (Pet) obj;
        return this.name.equals(other.getName()) && this.age == other.getAge() && this.kind.equals(other.getKind());
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + (this.name != null ? this.name.hashCode() : 0);
        hash = 53 * hash + this.age;
        hash = 53 * hash + (this.kind != null ? this.kind.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return String.format("%s %d %s", this.name, this.age, this.kind);
    }
}
