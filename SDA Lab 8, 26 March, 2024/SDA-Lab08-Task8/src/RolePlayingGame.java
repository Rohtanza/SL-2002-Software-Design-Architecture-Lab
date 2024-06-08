public class RolePlayingGame {
    public static void main(String[] args) {
        Warrior warrior = new Warrior("Arthur", 10);
        warrior.attack();

        Mage mage = new Mage("Merlin", 15);
        mage.attack();

        Thief thief = new Thief("Loki", 12);
        thief.attack();

        Character[] characters = {warrior, mage, thief};
        for (Character character : characters) {
            character.attack();
        }
    }
}
