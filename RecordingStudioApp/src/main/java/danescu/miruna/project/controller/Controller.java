package danescu.miruna.project.controller;

import danescu.miruna.project.actionListener.*;
import danescu.miruna.project.view.AlbumInterface;
import danescu.miruna.project.view.ArtistInterface;
import danescu.miruna.project.view.RecordInterface;

public class Controller {
    public static void main(String[] args) {

        ArtistInterface artistInterface = ArtistInterface.getInstance();
        artistInterface.getViewAlbums().addActionListener((new ActionViewArtistsAlbumsButton()));
        artistInterface.getViewArtists().addActionListener(new ActionViewArtistsButton());

        RecordInterface recordInterface = RecordInterface.getInstance();
        recordInterface.getAddButton().addActionListener(new ActionAddButton());
        recordInterface.getViewRecords().addActionListener(new ActionViewRecordsButton());

        AlbumInterface albumInterface = AlbumInterface.getInstance();
        albumInterface.getViewRecords().addActionListener(new ActionViewAlbumsRecordsButton());
        albumInterface.getViewAlbums().addActionListener(new ActionViewAlbumsButton());
    }
}
