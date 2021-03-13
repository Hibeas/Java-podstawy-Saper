package Projekt;

import java.awt.*;
import java.awt.image.BufferedImage;

public class World {
    //"swiat" sapera
    private static int width = 40;
    private static int hight = 40;

    private Tile[][] tiles;

    private BufferedImage bomb = ImageLoader.scale(ImageLoader.loadImage("grafika/bomb.png"), Tile.getWidth(), Tile.getHight());//w końcu dodawanie tych afelkó
    private BufferedImage flag = ImageLoader.scale(ImageLoader.loadImage("grafika/flag.png"), Tile.getWidth(), Tile.getHight());
    private BufferedImage normal = ImageLoader.scale(ImageLoader.loadImage("grafika/normal.png"), Tile.getWidth(), Tile.getHight());
    private BufferedImage pressed = ImageLoader.scale(ImageLoader.loadImage("grafika/pressed.png"), Tile.getWidth(), Tile.getHight());
    public World(){
        tiles = new Tile[width][hight];//tworzenie kafelka

        for(int x=0;x<width;x++){
            for(int y=0;y<hight;y++){
                tiles[x][y]=new Tile(x,y);
                tiles[x][y].setImage(normal);
            }
        }
    }
    public void draw(Graphics g){
        for(int x=0;x<width;x++) {
            for (int y = 0; y < hight; y++) {
                tiles[x][y].draw(g);//tutaj rysujemy kafelek
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
