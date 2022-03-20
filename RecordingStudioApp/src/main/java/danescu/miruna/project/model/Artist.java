package danescu.miruna.project.model;

import java.util.Vector;

public class Artist {
    private String name;
    private Vector<Album> albums = new Vector<>();

    private static Vector<Artist> artists = new Vector<>();


    public Artist(String name) {
        this.name = name;
        artists.add(this);
    }

    public String getName() {
        return name;
    }


    public Vector<Album> getAlbums() {
        return albums;
    }


    public static Vector<Artist> getArtists() {
        return artists;
    }

    @Override
    public String toString() {
        return name;
    }
}
