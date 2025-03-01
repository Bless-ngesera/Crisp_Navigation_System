package Musicapp;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;

public class BestMusicianPanel {
    private JPanel panel;

    public BestMusicianPanel() {
        panel = new JPanel(new BorderLayout());
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Best Musicians");
        root.add(new DefaultMutableTreeNode("Billie Eilish (22, Grammy Winner)"));
        root.add(new DefaultMutableTreeNode("Olivia Rodrigo (20, Grammy Winner)"));

        JTree musicianTree = new JTree(root);
        panel.add(new JScrollPane(musicianTree), BorderLayout.CENTER);

        JButton btnBack = new JButton("Back");
        panel.add(btnBack, BorderLayout.SOUTH);

        btnBack.addActionListener(e -> {
            SwingUtilities.getWindowAncestor(panel).dispose();
            new MainMenu().createAndShowGUI();
        });
    }

    public JPanel getPanel() {
        return panel;
    }
}

