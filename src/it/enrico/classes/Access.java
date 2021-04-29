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
 * controllo di accesso al software
 * con uso di password:
 * "MMR"
 *
 */

public class Access extends JFrame implements ActionListener{

    @Serial
    private static final long serialVersionUID = 1L;
    private final JButton login;
    private final JButton sign_up;
    private final JButton exit;

    public Access() {
        super("MMR");

        BufferedImage logo_uni = null;
        try {
            logo_uni = ImageIO.read(new File("src/main/java/images/logo_uni.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        BufferedImage logo_mmr = null;
        try {
            logo_mmr = ImageIO.read(new File("src/main/java/images/mmr_logo.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        BufferedImage sfondo = null;
        try {
            sfondo = ImageIO.read(new File("src/main/java/images/Benvenuto.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        login = new JButton("Login");
        login.addActionListener(this);
        sign_up = new JButton("Sign up");
        sign_up.addActionListener(this);
        exit = new JButton("exit");
        exit.addActionListener(this);

        /*uscita eseguibile:
        if (input == 1) {
            //chiudo l'applicazione:
            System.exit(0);
        }
        */

        /**
         * pannello di login e sign up
         */
        JPanel pannello = new JPanel();

        pannello.setBackground(new Color(255, 255, 255));

        assert logo_mmr != null;
        assert logo_uni != null;

        System.out.println(logo_uni.getHeight());
        System.out.println(logo_uni.getWidth());
        System.out.println(logo_mmr.getHeight());
        System.out.println(logo_mmr.getWidth());

        //BufferedImage resized_logo_mmr = getScaledDimension(logo_mmr, 200, 300);
        //BufferedImage resized_logo_uni = getScaledDimension(logo_uni, 300, 400);

        System.out.println(logo_mmr.getHeight());
        System.out.println(logo_mmr.getWidth());
        System.out.println(logo_uni.getHeight());
        System.out.println(logo_uni.getWidth());

        //JLabel picLabel = new JLabel(new ImageIcon(resized_logo_mmr));
        //JLabel piclabel2 = new JLabel(new ImageIcon(resized_logo_uni));

        assert sfondo != null;
        JLabel picLabel = new JLabel(new ImageIcon(sfondo));

        //pannello.add(piclabel2);
        pannello.add(picLabel);
        pannello.add(login);
        pannello.add(sign_up);
        pannello.add(exit);

        setContentPane(pannello);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(1263, 710);
        setVisible(true);
    }

    public BufferedImage getScaledDimension(BufferedImage img, int MAX_IMG_WIDTH, int MAX_IMG_HEIGHT) {

        img.getWidth();
        int width;
        var height = img.getHeight();

        Dimension originalDimension = new Dimension(img.getWidth(),
                img.getHeight());
        Dimension boundaryDimension = new Dimension(MAX_IMG_WIDTH,
                MAX_IMG_HEIGHT);
        Dimension scalingDimension = getScaledDimension(originalDimension,
                boundaryDimension);

        width = (int) scalingDimension.getWidth();
        height = (int) scalingDimension.getHeight();

        BufferedImage resizedImage = new BufferedImage(width, height,
                img.getType());
        Graphics2D g = resizedImage.createGraphics();

        g.drawImage(img, 0, 0, width, height, null);
        return resizedImage;
    }


    public static Dimension getScaledDimension(Dimension imgSize, Dimension boundary) {

        int original_width = imgSize.width;
        int original_height = imgSize.height;
        int bound_width = boundary.width;
        int bound_height = boundary.height;
        int new_width = original_width;
        int new_height = original_height;

        // Controllo se e' necessario eseguire lo scaling
        if (original_width > bound_width) {
            //scaling della larghezza in base alla larghezza massima
            new_width = bound_width;
            //eseguo lo scaling dell'altezza per mantenere le proporzioni
            new_height = (new_width * original_height) / original_width;
        }

        // Dopo aver calcolato la nuova altezza, controllo se è ancora fuori limite
        if (new_height > bound_height) {

            new_height = bound_height;
            //rieseguo lo scaling per mantenere le proporzioni
            new_width = (new_height * original_width) / original_height;
        }

        return new Dimension(new_width, new_height);
    }

    /**
     * Invoked when an action occurs.
     *
     * @param e the event to be processed
     */
    @Override
    public void actionPerformed(ActionEvent e) {

        System.out.println(e);

        //se il tasto premuto è: fai->
        if(e.getSource() == exit){
            //chiudo l'applicazione:
            System.exit(0);
        }

        if(e.getSource() == login) {

            /**
             * prima di chiamare un altra classe ricordati
             * di settare invisibili le finestre che non servono:
             * per chiamare una classe usa questa nomenclatura:
             */
            setVisible(false);
         //   new Login();
        }

        if(e.getSource() == sign_up){
            setVisible(false);
          //  new Sign_up();
        }

    }

    public static void main(String[] args) {
        new Access();
    }
}