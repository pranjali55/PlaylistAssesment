import test.vagrant.Playlist;

public class PrintSongs {
    public static void main(String[] args) {
        Playlist playlist = new Playlist(3);
        playlist.addSong("S1");
        playlist.addSong("S2");
        playlist.addSong("S3");
        playlist.printPlaylist();

        playlist.playSong("S4");
        playlist.printPlaylist();

        playlist.playSong("S2");
        playlist.printPlaylist();

        playlist.playSong("S1");
        playlist.printPlaylist();
    }



}
