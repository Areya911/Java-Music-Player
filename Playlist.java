import java.io.File;
import java.util.ArrayList;

public class Playlist {
    private ArrayList<Song> songs = new ArrayList<>();

    public void loadSongsFromFolder(String folderPath) {
        File folder = new File(folderPath);
        File[] files = folder.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.getName().endsWith(".mp3")) {
                    songs.add(new Song(file.getName(), file.getAbsolutePath()));
                }
            }
        }
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }
}
