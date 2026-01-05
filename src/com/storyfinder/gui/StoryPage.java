package com.storyfinder.gui;

import com.storyfinder.Storia;

import javax.swing.*;
import java.awt.*;

public class StoryPage extends JFrame {
    private JPanel StoryPagePanel;
    private JLabel title;
    private JTextPane testo_storia;

    public StoryPage(String nomePersonaggio, String oggettiStoria, String luogoStoria, Storia storia) {
        setContentPane(StoryPagePanel);
        setTitle("Storia");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 600);
        setLocationRelativeTo(null);
        setVisible(true);
        title.setText(storia.getTitolo());
        title.setFont(new Font("Serif", Font.PLAIN, 32));
        String testoStoria = storia.getTesto_storia();
        String testoStoriaFinale = testoStoria.replace("[nome]", nomePersonaggio)
                .replace("[luogo]", luogoStoria)
                .replace("[oggetto]", oggettiStoria);
        testo_storia.setText(testoStoriaFinale);
    }
}
