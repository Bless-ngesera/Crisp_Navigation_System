package Musicapp;

import javax.swing.*;
import musicdata.MusicData;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MainMenu().createAndShowGUI());

        System.out.println("Available Genres:");
        for (String genre : MusicData.getGenres()) {
            System.out.println(genre);
        }

        System.out.println("\nArtists in Pop Genre:");
        for (String artist : MusicData.getArtists("Pop")) {
            System.out.println(artist);
        }
    }
}

