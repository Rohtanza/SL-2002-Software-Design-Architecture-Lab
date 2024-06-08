import java.util.ArrayList;
import java.util.List;

// Creating Classes
class Playlist {
    private String name;
    private List<Naat> naats;
    public Playlist(String name) {
        this.name = name;
        this.naats = new ArrayList<>();
    }

    public void addNaat(Naat song) {
        naats.add(song);
    }

    public void removeNaat(Naat song) {
        naats.remove(song);
    }

    public void displayNaats() {
        System.out.println("Naats: " + name);
        for (Naat naat : naats) {
            System.out.println(naat);
        }
    }
}