package it.enrico.classes;


import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.Serial;

/**
 * creazione interfaccia di login:
 */

public class Sing extends JFrame  {

    @Serial
    private static final long serialVersionUID = 1L;
   // Frame i=new Frame();

    public Sing() {

        super("Login");



        JTextField utente = new JTextField("Inserisci nome utente");
        JLabel test=new JLabel("ciao");
        test.setBounds(0,50,200,200);

        JPanel panel = new JPanel();
        panel.setBackground(Color.yellow);
        utente.setPreferredSize(new Dimension(400,50));
        panel.add(utente);

        panel.add(test);





        setContentPane(panel);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(1000, 300);
        setVisible(true);

    }




    public static void main(String[] args) {
        new Sing();
    }

}
