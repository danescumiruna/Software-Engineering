package danescu.miruna.project.actionListener;

import danescu.miruna.project.model.Artist;
import danescu.miruna.project.view.AlbumInterface;
import danescu.miruna.project.view.ArtistInterface;
import danescu.miruna.project.view.RecordInterface;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionViewAlbumsRecordsButton implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {

        AlbumInterface albumInterface = AlbumInterface.getInstance();
        ArtistInterface artistInterface = ArtistInterface.getInstance();
        try {
            RecordInterface recordInterface = RecordInterface.getInstance();
            int index1 = albumInterface.getList().getSelectedIndex();
            int index2 = artistInterface.getList().getSelectedIndex();
            System.out.println(index1);
            Artist.getArtists().get(index2).getAlbums().get(index1);
            recordInterface.setVisible(true);
        } catch (ArrayIndexOutOfBoundsException exception) {
            JOptionPane.showMessageDialog(null, "You must select an album", "Exception Message", JOptionPane.INFORMATION_MESSAGE);
        }

    }
}
