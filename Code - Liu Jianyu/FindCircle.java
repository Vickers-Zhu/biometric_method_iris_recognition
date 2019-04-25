
package IRIS;

import java.io.*;
import java.awt.Point;
import java.awt.image.BufferedImage;

public class FindCircle {
    
    static Point findCircle(BufferedImage bimg, int radius) {

        Canny canny = new Canny();
        
        bimg = canny.cannyiris(bimg);

        HoughTransform ht = new HoughTransform(bimg, radius, 1);

        Point cp = ht.getCenterPoint(0);
        
	   return cp;
    }
}
