public class Hogwarts {
    private String name;
    private int spellPower;
    private int transgressionDistance;

    public Hogwarts(String name, int spellPower, int transgressionDistance) {
        this.name = name;
        this.spellPower = spellPower;
        this.transgressionDistance = transgressionDistance;
    }

    public String getName() {
        return name;
    }

    public int getSpellPower() {
        return spellPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setSpellPower(int spellPower) {
        this.spellPower = spellPower;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }
}


