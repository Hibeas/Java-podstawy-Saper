package Projekt;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

//Tutaj będzie tworzone okno w którym będzie wyświetlany saper
public class frame extends JFrame implements MouseListener {//Mouselistenet odpowiada za pilnowanie myszki

    private static int width = 400;//parametry okna - długość
    private static int hight = 400;//parametry okna - wysokość
    private Screen screen;
    private World world;

    public frame(){
        super("Saper");//tytuł okna które tworzymy
        world = new World();

        setResizable(false);//uniemożliwianie zmieniania wielkości okna (nie można rozszerzać
        setDefaultCloseOperation(EXIT_ON_CLOSE);//zamykanie okna gdy wciśniemy X(u góry okna)

        screen = new Screen();//tworzymy obiekt screen
        add(screen);
        pack();
        setSize(width+getInsets().left + getInsets().right, hight+getInsets().bottom + getInsets().top);//tutaj ustawiamy rozmiar 400 + rozmiar obramowania, co stworzymy nam okno o rozmiarach 400x400, a nie 396x375
        setLocationRelativeTo(null);//okno będzie wyświetlana pośrodku
        setVisible(true);//wyświetla ramka
    }
    //początek zaimplementowanyhc metod Mouse
    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
    //koniec zaimplementowanych metod mause

    public class Screen extends JPanel{
        @Override
        public void paintComponent(Graphics g){//tutaj nadpisujemy już funkcje zawartę w JPanelu umożliwiająca nam rysowanie obiektów w aplika cji okiendkowej
            world.draw(g);
        }
    }


    public static int getScreenWidth(){
        return width;
    }


    public static int getScreenHight(){
        return hight;
    }

}
