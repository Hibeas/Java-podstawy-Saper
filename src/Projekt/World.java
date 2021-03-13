package Projekt;

import java.awt.*;

public class World {
    //"swiat" sapera
    private static int width = 40;
    private static int hight = 40;

    private Tile[][] tiles;

    public World(){
        tiles = new Tile[width][hight];//tworzenie kafelka

        for(int x=0;x<width;x++){
            for(int y=0;y<hight;y++){
                tiles[x][y]=new Tile(x,y);
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
