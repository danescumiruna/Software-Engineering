package danescu.miruna.project.view;

import javax.swing.*;

public class AlbumInterface extends JFrame {
    private JLabel title;
    private JList list;
    private JButton viewAlbums;
    private JButton viewRecords;

    private static AlbumInterface instance;

    private AlbumInterface() {
        init();
    }

    public static AlbumInterface getInstance() {
        if (instance == null) {
            instance = new AlbumInterface();
        }
        return instance;
    }

    public void init() {
        setSize(500, 650);

        title = new JLabel("Albums", JLabel.CENTER);
        title.setBounds(220, 20, 50, 20);
        add(title);

        //DefaultListModel model = new DefaultListModel();
        list = new JList();
        list.setBounds(30, 50, 430, 400);
        add(list);

        viewAlbums = new JButton();
        viewAlbums.setText("View Albums");
        viewAlbums.setBounds(270, 480, 150, 30);
        add(viewAlbums);

        viewRecords = new JButton();
        viewRecords.setText("View Records");
        viewRecords.setBounds(100, 480, 150, 30);
        add(viewRecords);

        setTitle("AlbumsInterface");
        setLayout(null);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setVisible(false);
    }

    public JList getList() {
        return list;
    }

    public JButton getViewAlbums() {
        return viewAlbums;
    }

    public JButton getViewRecords() {
        return viewRecords;
    }

}
