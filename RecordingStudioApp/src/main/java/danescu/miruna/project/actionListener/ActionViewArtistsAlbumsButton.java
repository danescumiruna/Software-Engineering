package danescu.miruna.project.actionListener;

import danescu.miruna.project.model.Album;
import danescu.miruna.project.model.Artist;
import danescu.miruna.project.view.AlbumInterface;
import danescu.miruna.project.view.ArtistInterface;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

public class ActionViewArtistsAlbumsButton implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {

        try {
            ArtistInterface artistInterface = ArtistInterface.getInstance();
            AlbumInterface albumInterface = AlbumInterface.getInstance();
            int index = artistInterface.getList().getSelectedIndex();
            Artist.getArtists().get(index);
            Vector<Album> albums = new Vector<>();
            albums.add(new Album(""));
            albumInterface.getList().setListData(albums);
            albumInterface.setVisible(true);

        } catch (ArrayIndexOutOfBoundsException exception) {
            JOptionPane.showMessageDialog(null, "You must select an artist", "Exception Message", JOptionPane.INFORMATION_MESSAGE);
        }

    }
}
