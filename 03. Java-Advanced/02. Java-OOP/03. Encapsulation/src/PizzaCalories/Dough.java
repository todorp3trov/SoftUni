package PizzaCalories;

public class Dough {
    private String flourType;
    private String bakingTechnique;
    private double weight;

    public Dough(String flourType, String bakingTechnique, double weight) {
        setFlourType(flourType);
        setBakingTechnique(bakingTechnique);
        setWeight(weight);
    }

    private void setFlourType(String flourType) {
        if (flourType.equals("White") || flourType.equals("Wholegrain")) {
            this.flourType = flourType;
        } else {
            throw new IllegalArgumentException("Invalid type of dough.");
        }
    }

    private void setBakingTechnique(String bakingTechnique) {
        if (bakingTechnique.equals("Crispy") || bakingTechnique.equals("Chewy") || bakingTechnique.equals("Homemade")) {
            this.bakingTechnique = bakingTechnique;
        } else {
            throw new IllegalArgumentException("Invalid type of dough.");
        }
    }

    private void setWeight(double weight) {
        if (weight < 1 || weight > 200) {
            throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
        }
        this.weight = weight;
    }

    public double calculateCalories() {
        double toppingCalories = 0;
        double flourTypeModifier = 0;
        double bakingTechniqueModifier = 0;
        switch (flourType) {
            case "White":
                flourTypeModifier = 1.5;
                break;
            case "Wholegrain":
                flourTypeModifier = 1.0;
                break;
        }

        switch (bakingTechnique) {
            case "Crispy":
                bakingTechniqueModifier = 0.9;
                break;
            case "Chewy":
                bakingTechniqueModifier = 1.1;
                break;
            case "Homemade":
                bakingTechniqueModifier = 1.0;
                break;
        }

        toppingCalories = (2 * weight) * flourTypeModifier * bakingTechniqueModifier;
        return toppingCalories;
    }

}
