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
