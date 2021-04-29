package it.enrico.classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;



public class Accesso extends JFrame implements ActionListener{
    private JFrame frame = new JFrame();
    private JLayeredPane lpane = new JLayeredPane();
    private JPanel panelBlue = new JPanel();
    private JPanel panelGreen = new JPanel();
    JButton login;
    JButton sign_up;
    JLabel background;

    // ImageIcon icon = new ImageIcon("java/code/src/main/java/im/secondo.png");
    public Accesso() throws IOException {

        login = new JButton("Login");
        login.addActionListener(this);
        sign_up = new JButton("Sign up");
        sign_up.addActionListener(this);
        //  l.setPreferredSize(g);
        //l.setBorder(BorderFactory.createEmptyBorder());
        // l.setContentAreaFilled(false);
        frame.setPreferredSize(new Dimension(1200, 700));
        frame.setLayout(new BorderLayout());
        frame.add(lpane, BorderLayout.CENTER);
        lpane.setBounds(0, 0, 1200, 700);
        // panelBlue.setBackground(Color.BLUE);
        ImageIcon back=new ImageIcon("src/main/java/images/ben.jpeg");
        background=new JLabel("",back,JLabel.CENTER);
        background.setBounds(0,0,1200,700);
        panelBlue.setBounds(0, 0, 1200, 700);
        panelBlue.setOpaque(true);
        panelBlue.add(background);
        panelGreen.setBackground(Color.YELLOW);
        panelGreen.add(login);
        panelGreen.add(sign_up);
        panelGreen.setBounds(200, 150, 200, 50);
        panelGreen.setOpaque(true);
        lpane.add(panelBlue, new Integer(0), 0);
        lpane.add(panelGreen, new Integer(1), 0);
        frame.pack();
        frame.setVisible(true);
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
   public void actionPerformed(ActionEvent e) {

        System.out.println(e);

        //se il tasto premuto è: fai->


        if(e.getSource() == login) {

            /**
             * prima di chiamare un altra classe ricordati
             * di settare invisibili le finestre che non servono:
             * per chiamare una classe usa questa nomenclatura:
             */
            setVisible(false);
          //  new Login();
        }

        if(e.getSource() == sign_up){
            setVisible(false);
           // new Sign_up();
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        new Accesso();
    }

}
