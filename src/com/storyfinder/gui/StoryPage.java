package com.storyfinder.gui;

import com.storyfinder.Storia;

import javax.swing.*;

public class StoryPage extends JFrame {
    private JPanel StoryPagePanel;
    private JLabel title;
    private JLabel parole_chiavi;
    private JLabel testo_storia;

    public StoryPage(String nomePersonaggio, String oggettiStoria, String luogoStoria, Storia storia) {
        setContentPane(StoryPagePanel);
        setTitle("Storia");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 600);
        setLocationRelativeTo(null);
        setVisible(true);
        Title.settext(storia.gettitolo);
        parole_chiavi.settext(storia.getparole_chiavi);
        testo_storia.settext(storia.gettesto_storia);
    }
}
