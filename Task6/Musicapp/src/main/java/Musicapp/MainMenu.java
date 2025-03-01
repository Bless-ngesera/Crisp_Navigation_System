package Musicapp;

import javax.swing.*;

public class MainMenu {
    private JFrame frame;

    public MainMenu() {
        frame = new JFrame("Music Industry App");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
    }

    public void createAndShowGUI() {
        JPanel panel = new JPanel(null);

        JButton btnHome = new JButton("Go to Home Page");
        JButton btnDataInput = new JButton("Go to Data Input");
        JButton btnDisplay = new JButton("Go to Display");
        JButton btnBestMusician = new JButton("Best Musicians");

        btnHome.setBounds(100, 50, 200, 30);
        btnDataInput.setBounds(100, 100, 200, 30);
        btnDisplay.setBounds(100, 150, 200, 30);
        btnBestMusician.setBounds(100, 200, 200, 30);

        panel.add(btnHome);
        panel.add(btnDataInput);
        panel.add(btnDisplay);
        panel.add(btnBestMusician);

        btnHome.addActionListener(e -> switchScreen(new HomePage().getPanel()));
        btnDataInput.addActionListener(e -> switchScreen(new DataInputPanel().getPanel()));
        btnDisplay.addActionListener(e -> switchScreen(new DisplayPanel().getPanel()));
        btnBestMusician.addActionListener(e -> switchScreen(new BestMusicianPanel().getPanel()));

        frame.add(panel);
        frame.setVisible(true);
    }

    private void switchScreen(JPanel panel) {
        frame.getContentPane().removeAll();
        frame.getContentPane().add(panel);
        frame.revalidate();
        frame.repaint();
    }
}
