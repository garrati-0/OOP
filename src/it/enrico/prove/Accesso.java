package it.enrico.prove;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;



public class Accesso extends JFrame implements ActionListener{
    private JFrame frame = new JFrame();
    private JLayeredPane lpane = new JLayeredPane();
    private JPanel panelBack = new JPanel();
    private JPanel panelLog = new JPanel();
    JButton login;
    JButton sign_up;
    JLabel background;
    Color azzurro = new Color(0x02cbff);
    Color azzurro1=new Color(0x01c8ff);

    // ImageIcon icon = new ImageIcon("java/code/src/main/java/im/secondo.png");
    public Accesso() throws IOException{

        login = new JButton("Login");
        login.addActionListener(this);

        ImageIcon icon_sign =new ImageIcon("src/images/iconasi2.png");
        sign_up = new JButton(icon_sign);
        sign_up.addActionListener(this);
        sign_up.setBorder(BorderFactory.createEmptyBorder());
        sign_up.setContentAreaFilled(false);


        //  l.setPreferredSize(g);
        //l.setBorder(BorderFactory.createEmptyBorder());
        // l.setContentAreaFilled(false);
        frame.setPreferredSize(new Dimension(1200, 660));
        frame.setBounds(400,200,1200,660);
        frame.setLayout(new BorderLayout());
        frame.add(lpane, BorderLayout.CENTER);
        lpane.setBounds(0, 0, 1200, 700);


        // panelBlue.setBackground(Color.BLUE);
        ImageIcon back=new ImageIcon("src/images/ben.jpeg");
        background=new JLabel("",back,JLabel.CENTER);
        background.setBounds(0,0,1200,700);
        panelBack.setBounds(0, -5, 1200, 700);



        panelBack.setOpaque(true);
        panelBack.add(background);
        panelLog.setBackground(azzurro1);


        JTextField utente = new JTextField("Inserisci nome utente");
        JPasswordField password = new JPasswordField("inserisci una nuova password");


        JPanel access = new JPanel();
        access.setBackground(azzurro1);

        utente.setPreferredSize(new Dimension(400,50));
        password.setPreferredSize(new Dimension(400,50));
        access.setBounds(100, 200, 400,150);
        access.add(utente);
        access.add(password);

        panelLog.add(login);
        //panelGreen.add(sign_up);

        JPanel sing=new JPanel();
        JLabel messaggio= new JLabel("se non sei registrato");

        sing.add(messaggio);
        sing.add(sign_up);
        sing.setBounds(0,550,300,100);
        sing.setBackground(azzurro);

        panelLog.setBounds(400, 350, 100, 40);
        panelLog.setOpaque(true);

        lpane.add(panelBack, new Integer(0), 0);
        lpane.add(panelLog, new Integer(1), 0);
        lpane.add(access,new Integer(2),0);
        lpane.add(sing,new Integer(3),0);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
      //  frame.pack();
        frame.setResizable(false);
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
        //    new Login();
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
