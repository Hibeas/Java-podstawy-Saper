package Projekt;

import java.awt.*;

public class Tile {
    private int x;
    private int y;
    private static int width = frame.getScreenWidth()/World.getWidth();
    private static int hight = frame.getScreenHight()/World.getHight();

    public Tile(int x, int y){
        this.x=x;
        this.y=y;//tworzenie obiektu kafelek
    }
    //ta klasa odpowiada za kafelki
    public void draw(Graphics g){
        g.setColor(Color.RED);
        g.fillRect(x*width,y*hight,width,hight);
    }
}
