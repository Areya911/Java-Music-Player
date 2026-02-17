import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;

public class MusicServer implements Runnable {

    private List<Song> songs;

    public MusicServer(List<Song> songs) {
        this.songs = songs;
    }

    @Override
    public void run() {
        try (ServerSocket serverSocket = new ServerSocket(5000)) {
            System.out.println("Server started...");

            while (true) {
                Socket socket = serverSocket.accept();
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

                for (Song song : songs) {
                    out.println(song.getTitle());
                }

                socket.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
