package musicdata;

import java.util.ArrayList;
import java.util.List;

public class MusicData {
    public static List<String> getGenres() {
        List<String> genres = new ArrayList<>();
        genres.add("Pop");
        genres.add("Rock");
        genres.add("Jazz");
        genres.add("Hip-Hop");
        return genres;
    }

    public static List<String> getArtists(String genre) {
        List<String> artists = new ArrayList<>();
        switch (genre) {
            case "Pop":
                artists.add("Taylor Swift");
                break;
            case "Rock":
                artists.add("Queen");
                break;
            case "Jazz":
                artists.add("Miles Davis");
                break;
            case "Hip-Hop":
                artists.add("Leo");
                break;
        }
        return artists;
    }
}

