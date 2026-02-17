import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        Playlist playlist = new Playlist();
        playlist.loadSongsFromFolder("songs");

        MusicPlayer player = new MusicPlayer();

        ListView<Song> listView = new ListView<>();
        listView.getItems().addAll(playlist.getSongs());

        Button playBtn = new Button("Play");
        Button stopBtn = new Button("Stop");

        playBtn.setOnAction(e -> {
            Song selected = listView.getSelectionModel().getSelectedItem();
            if (selected != null) {
                player.play(selected.getPath());
            }
        });

        stopBtn.setOnAction(e -> player.stop());

        VBox root = new VBox(10, listView, playBtn, stopBtn);
        Scene scene = new Scene(root, 300, 400);

        stage.setTitle("Java Music Player");
        stage.setScene(scene);
        stage.show();

        // Start server in background
        new Thread(new MusicServer(playlist.getSongs())).start();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
