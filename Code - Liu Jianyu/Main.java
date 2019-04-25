
package IRIS;

import IRIS.segmentation.*;
import java.io.*;
import javax.imageio.*;
import java.awt.image.BufferedImage;

public class Main {

    public Main() {
        File file = new File("C:\\Users\\Liu\\Desktop\\eye.jpg");
        BufferedImage bimg = null;
        try {
            bimg = ImageIO.read(file);
            Segment segment = new Segment();
            segment.segment(bimg);

            file = new File("C:\\Users\\Liu\\Desktop\\eyeeye.jpg");
            ImageIO.write(bimg, "jpg", file);
        } catch (Exception e)	{
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
            new Main();
    }

    private BufferedImage bimg;
}