package Projekt;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Random;

public class World {
    //"swiat" sapera
    private static int width = 20;//tutaj możemy zmieniąc wielkość, a dzięki temu zarazem ilość kafelków
    private static int hight = 20;

    private final int AMOUNT_OF_BOMBS = 20;//tutaj ustawiamy ilość bomb
    private Random random;

    private Tile[][] tiles;

    private BufferedImage bomb = ImageLoader.scale(ImageLoader.loadImage("grafika/bomb.png"), Tile.getWidth(), Tile.getHight());//w końcu dodawanie tych afelkó
    private BufferedImage flag = ImageLoader.scale(ImageLoader.loadImage("grafika/flag.png"), Tile.getWidth(), Tile.getHight());
    private BufferedImage normal = ImageLoader.scale(ImageLoader.loadImage("grafika/normal.png"), Tile.getWidth(), Tile.getHight());
    private BufferedImage pressed = ImageLoader.scale(ImageLoader.loadImage("grafika/pressed.png"), Tile.getWidth(), Tile.getHight());
    public World() {
        random = new Random();

        tiles = new Tile[width][hight];//tworzenie kafelka

        for (int x = 0; x < width; x++) {
            for (int y = 0; y < hight; y++) {
                tiles[x][y] = new Tile(x, y, normal, bomb, pressed, flag);
            }
        }
        placeBombs();
    }
    private void placeBombs(){
        for (int i=0;i<AMOUNT_OF_BOMBS;i++){
            placBomb();
            setNumbers();
        }
    }
    private void placBomb(){
        int x = random.nextInt(width);
        int y = random.nextInt(hight);

        if(!tiles[x][y].isBomb()){//kiedy nie ma bomby to ...
            tiles[x][y].setBomb(true);
        }
        else placBomb();
    }
    private void setNumbers(){//usytawioa cyfry
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < hight; y++) {
                int mx = x-1;
                int gx = x+1;
                int my = y-1;
                int gy = y+1;

                int amountOFBombs = 0;
                if(mx >= 0&&my>=0&&tiles[mx][my].isBomb())amountOFBombs++;//musimy to napisać 8 razy (8 to maskymnalna liczba jaka może być w saperze gdyż tyle pol obejmuje jedno pole)
                if(mx >= 0&&tiles[mx][y].isBomb())amountOFBombs++;//sprawdzamy wszędzie czy sa bomby 9dookoła pole)
                if(mx >= 0&&gy<hight&&tiles[mx][gy].isBomb())amountOFBombs++;

                if(my>=0&&tiles[x][my].isBomb())amountOFBombs++;
                if(gy<hight&&tiles[x][gy].isBomb())amountOFBombs++;

                if(gx < width&&my>=0&&tiles[gx][my].isBomb())amountOFBombs++;
                if(gx < width&&tiles[gx][y].isBomb())amountOFBombs++;
                if(gx < width&&gy<hight&&tiles[gx][gy].isBomb())amountOFBombs++;

                tiles[x][y].setAmoundOFnearBombs(amountOFBombs);

            }
        }
    }
    public void clicked(int x, int y){
        System.out.println(x + ";");
        int tileX = x/width;
        int tileY = y/hight;

        tiles[tileX][tileY].setOpened(true);

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
