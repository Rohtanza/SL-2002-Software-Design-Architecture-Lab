public class Warrior extends Character {
    private int strength;

    public Warrior(String name, int strength) {
        super(name);
        this.strength = strength;
    }

    @Override
    public void attack() {
        System.out.println(name + " attacks with strength " + strength);
    }
}

