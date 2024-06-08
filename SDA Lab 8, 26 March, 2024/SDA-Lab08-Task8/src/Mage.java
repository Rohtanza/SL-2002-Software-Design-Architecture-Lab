public class Mage extends Character {
    private int intelligence;

    public Mage(String name, int intelligence) {
        super(name);
        this.intelligence = intelligence;
    }

    @Override
    public void attack() {
        System.out.println(name + " attacks with intelligence " + intelligence);
    }
}
