package Saperokienkowy;

import javax.swing.*;
import java.awt.*;

public class Ramka extends JFrame {
    public Ramka() {
        super("Hello World");
        JFrame jframe = new JFrame("JFrame Size Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        jframe.setSize(new Dimension(400, 300));
        jframe.pack();
        jframe.setLocationRelativeTo(null);
        jframe.setBackground (Color.RED);
    }
}
