package danescu.miruna.project.actionListener;

import danescu.miruna.project.model.Album;
import danescu.miruna.project.model.Record;
import danescu.miruna.project.view.AlbumInterface;
import danescu.miruna.project.model.Artist;
import danescu.miruna.project.view.ArtistInterface;
import danescu.miruna.project.view.RecordInterface;

import javax.management.Notification;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

public class ActionAddButton implements ActionListener {

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

        String name = recordInterface.getTextName().getText();
        String duration = recordInterface.getTextDuration().getText();

        try {
            int d = Integer.parseInt(duration);
            try (FileWriter file = new FileWriter((path), true)) {
                album.addRecord(new Record(name, Integer.parseInt(duration)));
                file.write(name + " " + duration + "\n");
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        } catch (NumberFormatException exception) {
            JOptionPane.showMessageDialog(null, "Duration must be an integer value", "Exception Message", JOptionPane.CLOSED_OPTION);
        }

        recordInterface.getTextArea().setText("");
    }

}
