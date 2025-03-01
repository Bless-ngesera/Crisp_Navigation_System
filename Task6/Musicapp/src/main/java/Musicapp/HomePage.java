package Musicapp;

import javax.swing.*;
import java.awt.*;

public class HomePage {
    private JPanel panel;

    public HomePage() {
        panel = new JPanel(new BorderLayout());
        JTabbedPane tabbedPane = new JTabbedPane();

        tabbedPane.addTab("Data Input", new DataInputPanel().getPanel());
        tabbedPane.addTab("Display Info", new DisplayPanel().getPanel());

        panel.add(tabbedPane, BorderLayout.CENTER);
    }

    public JPanel getPanel() {
        return panel;
    }
}
