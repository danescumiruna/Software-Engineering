package danescu.miruna.project.actionListener;

import danescu.miruna.project.model.Album;
import danescu.miruna.project.view.AlbumInterface;
import danescu.miruna.project.model.Artist;
import danescu.miruna.project.view.ArtistInterface;
import danescu.miruna.project.view.RecordInterface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class ActionViewRecordsButton implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        ArtistInterface artistInterface = ArtistInterface.getInstance();
        AlbumInterface albumInterface = AlbumInterface.getInstance();
        RecordInterface recordInterface = RecordInterface.getInstance();

        int index1 = artistInterface.getList().getSelectedIndex();
        int index2 = albumInterface.getList().getSelectedIndex();
        Artist artist = Artist.getArtists().get(index1);
        Album album = artist.getAlbums().get(index2);

        String path = "src/main/java/danescu/miruna/project/Files/albums/" + album.getName() + ".txt";

        try (BufferedReader file = new BufferedReader(new FileReader(path))) {
            String line = file.readLine();
            while (line != null) {
                recordInterface.getTextArea().append(line + "\n");
                line = file.readLine();
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }

    }

}
