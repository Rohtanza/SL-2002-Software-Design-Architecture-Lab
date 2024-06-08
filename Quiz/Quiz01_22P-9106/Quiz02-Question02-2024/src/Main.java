//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Quiz 01 | Muhammad Rehan | 22P-9106 | Question no 2 | Part One");
        Naat song1 = new Naat("Tajdar e Haram", "Atif Aslam", 3.1);
        Naat song2 = new Naat("Mera nabi hai", "Naatkha", 5.9);

        Playlist naats = new Playlist("naats");
        naats.addNaat(song1);
        naats.addNaat(song2);

        naats.displayNaats();


        System.out.println("\n\nQuiz 01 | Muhammad Rehan | 22P-9106 | Question no 2 | Part Two");
        System.out.println("We are utilizing the compositions in a way that ");
        System.out.println("we first create a list/array of the naats ");
        System.out.println("Now that member list is a element of a class with a behavior " );
        System.out.println("we can manipulate and change and implement logic as per our need " );
    }
}
