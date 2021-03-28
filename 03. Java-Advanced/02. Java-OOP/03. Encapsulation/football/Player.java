package football;

public class Player {
    private String name;
    private int endurance;
    private int sprint;
    private int dribble;
    private int passing;
    private int shooting;

    public Player(String name, int endurance, int sprint, int dribble, int passing, int shooting) {
        this.setName(name);
        this.setEndurance(endurance);
        this.setSprint(sprint);
        this.setDribble(dribble);
        this.setPassing(passing);
        this.setShooting(shooting);
    }

    private void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("A name should not be empty.");
        }
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    private void setEndurance(int endurance) {
        this.validateSkill(endurance, "Endurance");
        this.endurance = endurance;
    }

    private void setSprint(int sprint) {
        this.validateSkill(sprint, "Sprint");
        this.sprint = sprint;
    }

    private void setDribble(int dribble) {
        this.validateSkill(dribble, "Dribble");
        this.dribble = dribble;
    }

    private void setPassing(int passing) {
        this.validateSkill(passing, "Passing");
        this.passing = passing;
    }

    private void setShooting(int shooting) {
        this.validateSkill(shooting, "Shooting");
        this.shooting = shooting;
    }

    private void validateSkill(int skill, String prefix) {
        if (skill < 1 || skill > 100) {
            throw new IllegalArgumentException(prefix + " should be between 0 and 100.");
        }
    }

    public double overallSkillLevel() {
        return (double) (this.endurance + this.sprint + this.dribble +
                this.passing + this.shooting) / 5;
    }
}
