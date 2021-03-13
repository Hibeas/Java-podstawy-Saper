package Projekt;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class ImageLoader {
    public static BufferedImage loadImage(String path){
        try {
            return ImageIO.read(ImageLoader.class.getClassLoader().getResourceAsStream(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static BufferedImage scale(BufferedImage source,int width, int hight){//zeby odpowiednio działały png(chodzitutaj by nasz kafelek nie pojawiał sikę w połowie tylko w całosći)
        BufferedImage scaled = new BufferedImage(width,hight,source.getType());
        Graphics g = scaled.getGraphics();
        g.drawImage(source, 0, 0,width,hight,null);
        g.dispose();
        return scaled;
    }
}
