package it.enrico.classes;

import javax.swing.*;
import java.awt.*;

public class Pova extends JFrame {
    JButton i;
    public void pova(){

        i=new JButton("ciaoooo");
        i.setForeground(new Color(0x02cbff));

        JPanel panel=new JPanel();
        panel.add(i);

        setContentPane(panel);
        setVisible(true);

    }

    public static void main(String[] args) {
        new Pova();
    }
}
