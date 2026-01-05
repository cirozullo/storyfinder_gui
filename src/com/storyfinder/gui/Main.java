package com.storyfinder.gui;

import com.storyfinder.GestoreStoria;
import com.storyfinder.Storia;

import java.awt.*;
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
    private JLabel storyfinder;

    public Main() {
        setContentPane(MainPanel);
        setTitle("Storyfinder");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 250);
        setLocationRelativeTo(null);
        setVisible(true);
        storyfinder.setFont(new Font("Serif", Font.PLAIN, 32));
        generaStoriaButton.addActionListener(
                e -> {
                    String argomento = parolaChiave.getText();
                    GestoreStoria gestoreStoria = new GestoreStoria();
                    Storia lamiaStoria = gestoreStoria.getBestStory(argomento);

                    String nomepersonaggio = nome.getText();
                    String luogoiniziale = luogo.getText();
                    String oggettopreferito = oggetto.getText();
                    new StoryPage(nomepersonaggio, oggettopreferito, luogoiniziale, lamiaStoria);
                }
        );
    }

    static void main() {
        new Main();
    }
}
