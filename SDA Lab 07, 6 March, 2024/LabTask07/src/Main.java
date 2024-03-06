import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean flag = true;
        Scanner scan = new Scanner(System.in);
        String input;
        while (flag) {
            System.out.println("Do you want to roll the Dice? Y/N\n");
            input = scan.nextLine();
            if (input.equalsIgnoreCase("Y")) {
                Dice game = new Dice();
                game.roll();
            } else {
                flag = false;
            }
        }
        scan.close();
    }
}
