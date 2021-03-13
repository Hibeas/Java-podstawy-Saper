package Projekt;

import javax.swing.*;
//Tutaj będzie tworzone okno w którym będzie wyświetlany saper
public class frame extends JFrame {
    private static int width = 400;//parametry okna - długość
    private static int hight = 400;//parametry okna - wysokość
    public frame(){
        super("Saper");//tytuł okna które tworzymy
        setResizable(false);//uniemożliwianie zmieniania wielkości okna (nie można rozszerzać
        setDefaultCloseOperation(EXIT_ON_CLOSE);//zamykanie okna gdy wciśniemy X(u góry okna)
        setSize(width, hight);
        setLocationRelativeTo(null);//okno będzie wyświetlana pośrodku
        setVisible(true);//wyświetla ramka
    }
    public static int getScreenWidth(){
        return width;
    }
    public static int getScreenHight(){
        return hight;
    }

}
