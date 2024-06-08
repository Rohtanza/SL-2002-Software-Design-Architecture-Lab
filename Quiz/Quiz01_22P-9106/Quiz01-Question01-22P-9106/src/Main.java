//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Date dateone = new Date(3, 20, 2024);
        Date datetwo = new Date("March", 20, 2024);
        Date datethree = new Date(110, 2024);
        System.out.println("Quiz 01 | 22P-9016 | Question 01 | ");
        System.out.println("The first required date format is: " + dateone.tommddyyyy());
        System.out.println("The second format required is : " + datetwo.tomonthdayyear());
        System.out.println("The third Format required is: " + datethree.todddyyyy());
        System.out.println("");
    }
}

