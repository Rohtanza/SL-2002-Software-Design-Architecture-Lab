import java.util.Random;

public class Dice {
    private int value;

    Dice() {
        this.value = 0;
    }

    void roll() {
        Random rand = new Random();
        this.value = rand.nextInt(6) + 1;
        System.out.print("Side: " + this.value);
        if (this.value == 6) {
            System.out.println(" (Chaka)");
        } else {
            System.out.println(" (better luck next time)");
        }
    }
}
