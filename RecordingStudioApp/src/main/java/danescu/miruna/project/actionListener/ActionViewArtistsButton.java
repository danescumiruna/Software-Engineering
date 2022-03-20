package danescu.miruna.project.actionListener;

import danescu.miruna.project.model.Artist;
import danescu.miruna.project.view.ArtistInterface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;

public class ActionViewArtistsButton implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        ArtistInterface artistInterface = ArtistInterface.getInstance();

        try (BufferedReader file = new BufferedReader(new FileReader("src/main/java/danescu/miruna/project/Files/Artists.txt"))) {
            String name = file.readLine();
            Vector<Artist> artists = new Vector<>();
            while (name != null) {
                artists.add(new Artist(name));
                name = file.readLine();
            }
            artistInterface.getList().setListData(artists);
        } catch (IOException exception) {
            exception.printStackTrace();
        }

    }
}
