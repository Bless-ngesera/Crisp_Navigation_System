package Musicapp;

import javax.swing.*;
import javax.swing.ButtonGroup;

public class DataInputPanel {
    private JPanel panel;

    public DataInputPanel() {
        panel = new JPanel(null);

        JLabel lblGenre = new JLabel("Select Genre:");
        JComboBox<String> cmbGenre = new JComboBox<>(new String[]{"Pop", "Rock", "Jazz", "Hip-Hop"});
        JLabel lblArtist = new JLabel("Artist Name:");
        JTextField txtArtist = new JTextField();
        JLabel lblAlbum = new JLabel("Album Name:");
        JTextField txtAlbum = new JTextField();
        JLabel lblDescription = new JLabel("Description:");
        JTextArea txtDescription = new JTextArea();
        JLabel lblFormat = new JLabel("Format:");
        JRadioButton rbCD = new JRadioButton("CD");
        JRadioButton rbVinyl = new JRadioButton("MP4");
        ButtonGroup formatGroup = new ButtonGroup();
        formatGroup.add(rbCD);
        formatGroup.add(rbVinyl);
        JButton btnSave = new JButton("Save");
        JButton btnBack = new JButton("Back");

        lblGenre.setBounds(20, 20, 100, 25);
        cmbGenre.setBounds(130, 20, 150, 25);
        lblArtist.setBounds(20, 60, 100, 25);
        txtArtist.setBounds(130, 60, 150, 25);
        lblAlbum.setBounds(20, 100, 100, 25);
        txtAlbum.setBounds(130, 100, 150, 25);
        lblDescription.setBounds(20, 140, 100, 25);
        txtDescription.setBounds(130, 140, 150, 60);
        lblFormat.setBounds(20, 210, 100, 25);
        rbCD.setBounds(130, 210, 60, 25);
        rbVinyl.setBounds(200, 210, 70, 25);
        btnSave.setBounds(50, 250, 100, 30);
        btnBack.setBounds(180, 250, 100, 30);

        panel.add(lblGenre);
        panel.add(cmbGenre);
        panel.add(lblArtist);
        panel.add(txtArtist);
        panel.add(lblAlbum);
        panel.add(txtAlbum);
        panel.add(lblDescription);
        panel.add(txtDescription);
        panel.add(lblFormat);
        panel.add(rbCD);
        panel.add(rbVinyl);
        panel.add(btnSave);
        panel.add(btnBack);

        btnBack.addActionListener(e -> {
            SwingUtilities.getWindowAncestor(panel).dispose();
            new MainMenu().createAndShowGUI();
        });
    }

    public JPanel getPanel() {
        return panel;
    }
}

