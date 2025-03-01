package Musicapp;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class DisplayPanel {
    private JPanel panel;

    public DisplayPanel() {
        panel = new JPanel(null);

        JLabel lblTitle = new JLabel("Stored Music Information:");
        lblTitle.setBounds(20, 20, 200, 25);

        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Music Genres");
        DefaultMutableTreeNode pop = new DefaultMutableTreeNode("Pop");
        DefaultMutableTreeNode rock = new DefaultMutableTreeNode("Rock");
        DefaultMutableTreeNode jazz = new DefaultMutableTreeNode("Jazz");
        DefaultMutableTreeNode hipHop = new DefaultMutableTreeNode("Hip-Hop");

        pop.add(new DefaultMutableTreeNode("Taylor Swift"));
        rock.add(new DefaultMutableTreeNode("Queen"));
        jazz.add(new DefaultMutableTreeNode("Miles Davis"));
        hipHop.add(new DefaultMutableTreeNode("Leo"));

        root.add(pop);
        root.add(rock);
        root.add(jazz);
        root.add(hipHop);

        JTree tree = new JTree(root);
        JScrollPane treeScrollPane = new JScrollPane(tree);
        treeScrollPane.setBounds(20, 50, 200, 150);

        JButton btnBack = new JButton("Back");
        btnBack.setBounds(20, 210, 100, 30);

        panel.add(lblTitle);
        panel.add(treeScrollPane);
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

