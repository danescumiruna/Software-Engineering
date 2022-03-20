package danescu.miruna.project.view;

import javax.swing.*;

public class RecordInterface extends JFrame {
    private JLabel title;
    private JLabel name;
    private JTextField textName;
    private JLabel duration;
    private JTextField textDuration;
    private JButton addButton;
    private JTextArea textArea;
    private JButton viewRecords;

    private static RecordInterface instance;

    public static RecordInterface getInstance() {
        if (instance == null) {
            instance = new RecordInterface();
        }
        return instance;
    }

    private RecordInterface() {
        init();
    }

    public void init() {
        setSize(500, 700);

        setLayout(null);

        title = new JLabel("Records", JLabel.CENTER);
        title.setBounds(200, 20, 50, 20);
        add(title);

        textArea = new JTextArea();
        textArea.setBounds(50, 170, 380, 300);
        add(textArea);

        viewRecords = new JButton();
        viewRecords.setBounds(150, 520, 150, 30);
        viewRecords.setText("View Records");
        add(viewRecords);

        name = new JLabel("Name:", JLabel.LEFT);
        name.setBounds(20, 70, 100, 20);
        add(name);

        textName = new JTextField();
        textName.setBounds(130, 70, 100, 20);
        add(textName);

        duration = new JLabel("Duration:", JLabel.LEFT);
        duration.setBounds(20, 100, 100, 20);
        add(duration);

        textDuration = new JTextField();
        textDuration.setBounds(130, 100, 100, 20);
        add(textDuration);

        addButton = new JButton();
        addButton.setText("Add");
        addButton.setBounds(300, 80, 100, 30);
        add(addButton);

        setTitle("RecordsInterface");
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setVisible(false);
    }

    public JTextField getTextName() {
        return textName;
    }

    public JTextField getTextDuration() {
        return textDuration;
    }

    public JButton getAddButton() {
        return addButton;
    }

    public JTextArea getTextArea() {
        return textArea;
    }

    public JButton getViewRecords() {
        return viewRecords;
    }
}
