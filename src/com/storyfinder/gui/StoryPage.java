package com.storyfinder.gui;

import javax.swing.*;

public class StoryPage extends JFrame {
    private JPanel StoryPagePanel;
    private JLabel title;
    private JLabel parole_chiavi;
    private JLabel testo_storia;

    public StoryPage(String titleStoria, String parole_chiaviStoria, String testo_Storia) {
        setContentPane(StoryPagePanel);
        setTitle("Storia");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 600);
        setLocationRelativeTo(null);
        setVisible(true);
        title.setText(titleStoria);
    }
}
