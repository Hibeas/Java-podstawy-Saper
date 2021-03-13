package Projekt;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Tile {
    private BufferedImage image;
    private int x;
    private int y;

    private static int width = frame.getScreenWidth()/World.getWidth();
    private static int hight = frame.getScreenHight()/World.getHight();

    public Tile(int x, int y){
        this.x=x;
        this.y=y;//tworzenie obiektu kafelek
    }

    public void setImage(BufferedImage image) {
        this.image = image;
    }

    //ta klasa odpowiada za kafelki
    public void draw(Graphics g){
        g.drawImage(image, x*width, y*width, null);
    }
}
