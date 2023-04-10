package test.vagrant;

import java.util.ArrayList;

public class Playlist {
    private ArrayList<String> songs;
    private int capacity;

    public Playlist(int capacity) {
        this.songs = new ArrayList<String>();
        this.capacity = capacity;
    }

    public void addSong(String song) {
        if (songs.size() >= capacity) {
            songs.remove(0);
        }
        songs.add(song);
    }

    public void playSong(String song) {
        if (songs.contains(song)) {
            songs.remove(song);
        }
        addSong(song);
    }

    public void printPlaylist() {
        System.out.println(songs.toString());
    }
}