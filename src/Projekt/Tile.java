package Projekt;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Tile {
    private BufferedImage normal;
    private BufferedImage openedImage;
    private BufferedImage flagImage;
    private BufferedImage bombImage;

    private int x;
    private int y;
    private boolean bomb;
    private boolean opened;
    private boolean flag;
    private int amoundOFnearBombs;

    private static int width = frame.getScreenWidth()/World.getWidth();
    private static int hight = frame.getScreenHight()/World.getHight();

    public Tile(int x, int y, BufferedImage normal, BufferedImage bomb, BufferedImage openedImage, BufferedImage flag){
        this.x=x;
        this.y=y;//tworzenie obiektu kafelek
        this.normal = normal;
        this.bombImage = bomb;
        this.openedImage = openedImage;
        this.flagImage = flag;

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

    public void placeFlag(){
        if(flag) flag = false;
        else {
            if (!opened) flag = true;
        }

    }

    public boolean isFlag() {
        return flag;
    }
    public void reset(){
        flag = false;
        bomb=false;
        opened = false;
    }
    public void draw(Graphics g){
        if(!opened){
            if(!flag)g.drawImage(normal, x*width, y*width, null);
            else g.drawImage(flagImage, x*width, y*width, null);
        }
        else {
            if(bomb)g.drawImage(bombImage, x*width, y*width, null);
            else {
                g.drawImage(openedImage, x*width, y*width, null);
                if(amoundOFnearBombs > 0){//czcionka
                    g.setColor(Color.RED);
                    g.drawString(""+amoundOFnearBombs, x*width+7,y*hight + hight-4);
                }
            }
        }
    }
    public int getAmoundOFnearBombs() {
        return amoundOFnearBombs;
    }
    public boolean canOpen(){
        return !opened&&!bomb&&amoundOFnearBombs>=0;
    }

    public static int getWidth() {
        return width;
    }

    public static int getHight() {
        return hight;
    }
}
