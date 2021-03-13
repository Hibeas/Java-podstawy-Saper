package Projekt;

import javax.swing.*;
//Tutaj będzie tworzone okno w którym będzie wyświetlany saper
//Okno o parametrach 400x400 według painta zewnętrzną ramkę ma o długość 394x371, czyli 146174 pixeli
public class frame extends JFrame {
    private static int width = 400;//parametry okna - długość
    private static int hight = 400;//parametry okna - wysokość
    public frame(){
        super("Saper");//tytuł okna które tworzymy
        setResizable(false);//uniemożliwianie zmieniania wielkości okna (nie można rozszerzać
        setDefaultCloseOperation(EXIT_ON_CLOSE);//zamykanie okna gdy wciśniemy X(u góry okna)
        pack();
        setSize(width+getInsets().left + getInsets().right, hight+getInsets().bottom + getInsets().top);//tutaj ustawiamy rozmiar 400 + rozmiar obramowania, co stworzy nam pole, w którym możemy coś działać o rozmiarze 400x400
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
