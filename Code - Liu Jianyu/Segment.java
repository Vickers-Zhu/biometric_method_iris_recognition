
package IRIS;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.*;

public class Segment {
    
    public void segment(BufferedImage bimg) {
		BufferedImage img = new BufferedImage(bimg.getWidth(), bimg.getHeight(), bimg.getType());
		Graphics g = img.getGraphics();
		g.drawImage(bimg, 0, 0, null);
		circles = new HashMap();

		for (int i = 100; i<105; i = i+5) {
			final Point cp = FindCircle.findCircle(img, i);
			circles.put("iris", new Circle(cp, i));
		}

		for (int i = 0; i<circles.size(); i++) {
			final Circle c = (Circle) circles.elementAt(i);
			Utils.drawCircle(bimg, c.cp, c.radius);
		}
	}

    public class Circle {
	    public Point cp;
	    public int radius;
	    public Circle(final Point cp, final int radius) 
	    {
		    this.cp = cp;
		    this.radius = radius;
	    }
    }

    public Map getCircles() {
	    return circles;
    }

    private Map circles;
    public static final int IRIS = 101;
    public static final int PUPIL = 102;
}
