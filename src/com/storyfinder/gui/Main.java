package com.storyfinder.gui;

import com.storyfinder.GestoreStoria;
import com.storyfinder.Storia;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Main extends JFrame {

    private JPanel MainPanel;
    private JTextField nome;
    private JTextField luogo;
    private JTextField oggetto;
    private JTextField parolaChiave;
    private JButton generaStoriaButton;

    public Main() {
        setContentPane(MainPanel);
        setTitle("Storyfinder");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);
        setVisible(true);
        generaStoriaButton.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    new StoryPage();
                }
            }
        );
    }

    static void main() {
        new Main();
    }
}
