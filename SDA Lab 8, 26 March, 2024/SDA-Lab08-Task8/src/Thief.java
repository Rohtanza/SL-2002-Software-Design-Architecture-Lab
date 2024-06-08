public class Thief extends Character {
    private int agility;

    public Thief(String name, int agility) {
        super(name);
        this.agility = agility;
    }

    @Override
    public void attack() {
        System.out.println(name + " attacks with agility " + agility);
    }
}
