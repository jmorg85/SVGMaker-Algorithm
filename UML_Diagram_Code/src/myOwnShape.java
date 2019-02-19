import java.util.*;
public class myOwnShape {
    Fill f = new Fill(4,0,.8);


    public void makeShape(){
        SVGMaker svg = new SVGMaker("finalAlgorithm.svg", 1000, 1000);
        ArrayList<Circle>circleList = new ArrayList<Circle>();
        Stroke s = new Stroke(4,0,2);
        Circle c = new Circle(450, 350, 150);
        Circle c2 = new Circle(450,350,120);
        Circle c3 = new Circle(450,350,65);
        svg.drawCircle(c3);
        svg.fillBlue(f);

        for (int i=0; i<900;i++) {
            Circle c1 = new Circle();
            c1.setRandom(0, 900, 0, 900, 15, 15);
            double delta_y = 0;
            double delta_x = 0;
            delta_x = c.x - c1.x;
            delta_y = c.y - c1.y;
            double theta = Math.atan2(delta_y, delta_x);
            double r = c.r + c1.r;
            c1.x = c.x + r * Math.cos(theta);
            c1.y = c.y - r * Math.sin(theta);
            svg.drawCircle(c1);
            svg.fillYellow(f);
        }
        for (int i=0; i<900;  i++){
            Circle c1 = new Circle();
            c1.setRandom(0, 900, 0, 900, 20, 20);
            double delta_y = 0;
            double delta_x = 0;
            delta_x = c2.x - c1.x;
            delta_y = c2.y - c1.y;
            double theta = Math.atan2(delta_y, delta_x);
            double r = c2.r + c1.r;
            c1.x = c.x + r * Math.cos(theta);
            c1.y = c.y - r * Math.sin(theta);
            svg.drawCircle(c1);
            svg.fillRed(f);
            svg.drawStroke(s,4,0,3);
        }
        for (int i=0; i<900; i++){

            Circle c1 = new Circle();
            c1.setRandom(0, 900, 0, 900, 15, 15);
            double delta_y = 0;
            double delta_x = 0;
            delta_x = c3.x - c1.x;
            delta_y = c3.y - c1.y;
            double theta = Math.atan2(delta_y, delta_x);
            double r = c3.r + c1.r;
            c1.x = c3.x + r * Math.cos(theta);
            c1.y = c3.y - r * Math.sin(theta);
            svg.drawCircle(c1);
            svg.f
        }
         }
}
