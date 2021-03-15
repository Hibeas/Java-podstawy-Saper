package Projekt;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Tile {
    private BufferedImage normal;
    private BufferedImage openedImage;
    private BufferedImage flag;
    private BufferedImage bombImage;

    private int x;
    private int y;
    private boolean bomb;
    private boolean opened;
    private int amoundOFnearBombs;

    private static int width = frame.getScreenWidth()/World.getWidth();
    private static int hight = frame.getScreenHight()/World.getHight();

    public Tile(int x, int y, BufferedImage normal, BufferedImage bomb, BufferedImage openedImage, BufferedImage flag){
        this.x=x;
        this.y=y;//tworzenie obiektu kafelek
        this.normal = normal;
        this.bombImage = bomb;
        this.openedImage = openedImage;
        this.flag = flag;

        opened = true;
    }

    public void setNormal(BufferedImage normal) {
        this.normal = normal;
    }
    public void setOpenedImage(BufferedImage openedImage) {
        this.openedImage = openedImage;
    }

    public void setOpened(boolean opened) {
        this.opened = opened;
    }

    public boolean isOpened() {
        return opened;
    }



    public void setBomb(boolean bomb) {
        this.bomb = bomb;
    }

    public boolean isBomb() {
        return bomb;
    }

    public void setAmoundOFnearBombs(int amoundOFnearBombs) {
        this.amoundOFnearBombs = amoundOFnearBombs;
    }

    //ta klasa odpowiada za kafelki
    public void draw(Graphics g){
        if(!opened)g.drawImage(normal, x*width, y*width, null);
        else {
            if(bomb)g.drawImage(bombImage, x*width, y*width, null);
            else {
                g.drawImage(openedImage, x*width, y*width, null);
                if(amoundOFnearBombs > 0){
                    g.drawString(""+amoundOFnearBombs, x*width,y*hight + hight);
                }
            }
        }
    }

    public static int getWidth() {
        return width;
    }

    public static int getHight() {
        return hight;
    }
}
