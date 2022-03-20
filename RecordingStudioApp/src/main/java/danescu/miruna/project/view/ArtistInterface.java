package danescu.miruna.project.view;

import javax.swing.*;

public class ArtistInterface extends JFrame {
    private JLabel title;
    private JButton viewAlbums;
    private JButton viewArtists;
    private JList list;

    private static ArtistInterface instance;

    private ArtistInterface() {
        init();
    }

    public static ArtistInterface getInstance() {
        if (instance == null) {
            instance = new ArtistInterface();
        }
        return instance;
    }

    public void init() {
        setSize(450, 500);

        setLayout(null);

        title = new JLabel("Artists", JLabel.CENTER);
        title.setBounds(200, 20, 50, 20);
        add(title);

        list = new JList();
        list.setBounds(50, 50, 320, 250);
        add(list);

        viewArtists = new JButton();
        viewArtists.setBounds(50, 320, 150, 30);
        viewArtists.setText("View Artists");
        add(viewArtists);

        viewAlbums = new JButton();
        viewAlbums.setBounds(220, 320, 150, 30);
        viewAlbums.setText("View Albums");
        add(viewAlbums);

        setTitle("ArtistsInterface");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public JButton getViewAlbums() {
        return viewAlbums;
    }

    public JButton getViewArtists() {
        return viewArtists;
    }

    public JList getList() {
        return list;
    }
}
