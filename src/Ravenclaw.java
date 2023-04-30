public class Ravenclaw extends Hogwarts {
    private int quality1;
    private int quality2;
    private int quality3;
    private int quality4;

    public Ravenclaw(String name, int spellPower, int transgressionDistance, int quality1, int quality2, int quality3, int quality4) {
        super(name, spellPower, transgressionDistance);
        this.quality1 = quality1;
        this.quality2 = quality2;
        this.quality3 = quality3;
        this.quality4 = quality4;
    }

    public int getQuality1() {
        return quality1;
    }

    public void setQuality1(int quality1) {
        this.quality1 = quality1;
    }

    public int getQuality2() {
        return quality2;
    }

    public void setQuality2(int quality2) {
        this.quality2 = quality2;
    }

    public int getQuality3() {
        return quality3;
    }

    public void setQuality3(int quality3) {
        this.quality3 = quality3;
    }

    public int getQuality4() {
        return quality4;
    }

    public void setQuality4(int quality4) {
        this.quality4 = quality4;
    }

    public String toString() {
        return "Ученик факультета Когтевран - " + getName() + "\n" +
                "Способности ученика: " + "\n" +
                "Колдовство - " + getSpellPower() + "\n" +
                "Дальность трансгрессии - " + getTransgressionDistance() + "\n" +
                "Умственные способности - " + quality1 + "\n" +
                "Мудрость - " + quality2 + "\n" +
                "Остроумие - " + quality3 + "\n" +
                "Творчество - " + quality4;
    }
}

