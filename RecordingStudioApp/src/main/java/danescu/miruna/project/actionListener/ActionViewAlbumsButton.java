package danescu.miruna.project.actionListener;

import danescu.miruna.project.model.Album;
import danescu.miruna.project.model.Artist;
import danescu.miruna.project.view.AlbumInterface;
import danescu.miruna.project.view.ArtistInterface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ActionViewAlbumsButton implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        AlbumInterface albumInterface = AlbumInterface.getInstance();
        ArtistInterface artistInterface = ArtistInterface.getInstance();

        int index = artistInterface.getList().getSelectedIndex();
        Artist artist = Artist.getArtists().get(index);
        String path = "src/main/java/danescu/miruna/project/Files/artists/" + artist.getName() + ".txt";

        try (BufferedReader file = new BufferedReader(new FileReader(path))) {
            String name = file.readLine();
            while (name != null) {
                artist.getAlbums().add(new Album(name));
                name = file.readLine();

            }
            albumInterface.getList().setListData(artist.getAlbums());
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

}
