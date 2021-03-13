package Saperokienkowy;

import java.awt.*;
import java.awt.event.ActionListener;

import javax.swing.*;

public class main
{

    public static void main(String[] args)
    {
        //Tworzenie dwuwymiarowej tablicy i dopisywanie do niej elemetnów
        String[][] array = new String[7][7];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = " X ";
            }
        }
        //Wyświetlanie okienka
        SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                for (int i = 0; i < array.length; i++) {
                    for (int j = 0; j < array[i].length; j++) {
                        System.out.print(array[i][j]);
                    }
                    System.out.println();
                }
                Ramka();
            }
        });
    }

    static void Ramka()
    {
        JLabel waga, wzrost, lwynik;
        //Typowe właściowści okna
        JFrame jframe = new JFrame("JFrame Size Example");
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setPreferredSize(new Dimension(400, 300));
        jframe.pack();
        jframe.setLocationRelativeTo(null);
        jframe.setVisible(true);
        wzrost = new JLabel("Wpisz swój wzrost w cm");
        wzrost.setBounds(50, 60, 200, 100);
    }

}
