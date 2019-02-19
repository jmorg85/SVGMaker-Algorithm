import java.awt.*;
import java.util.*;
import java.nio.*;

public class Main {

    public static void main(String[] args) {
	Rectangle r = new Rectangle(50,50,100,100);
	Circle c = new Circle(200,200,50);
	Circle c1 = new Circle(50,800,75);
	Fill f = new Fill(4,0,.75);
	Stroke s = new Stroke(4,0,10);
	Line l = new Line(50,25,175,200);
	Path p = new Path(50,50,250,50,100,200);
	shapeAlgorithm sh = new shapeAlgorithm();
	myOwnShape m = new myOwnShape();

	r.FindArea(5,10);
	r.FindPerimeter(5, 10);
	r.FindVolume(5,10,15);
	double distance = c.getDist(5,12,2,24);
	System.out.println("The distance between the two circles is = " + distance);
	c.findArea();
	c.copy(c1);
	if(c.intersets(c1) == true)
		System.out.println("The circles intersect.");
	else
		System.out.println("The circles don't intersect.");

	SVGMaker svg = new SVGMaker("s.svg", 300, 300);
	svg.drawCircle(c);
	svg.drawStroke(s,4,0,10);
	svg.drawFill(f, 4,0);
	svg.drawRectangle(r);
	svg.drawStroke(s,4,0,4);
	svg.drawFill(f,4,0);
	svg.drawLine(l);
	svg.drawStroke(s,4,0,4);
	svg.lineEnder();
	svg.drawPath(p);
	svg.drawStroke(s,4,0,2);
	svg.drawFill(f,4,0);
	svg.close();

	sh.generateShapes();
	m.makeShape();
    }
}
