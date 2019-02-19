import java.io.*;
import java.util.*;
public class shapeAlgorithm {
    Fill f = new Fill(4,0,.8);

    public void generateShapes() {
        ArrayList<Circle>circleList = new ArrayList<Circle>();
        SVGMaker svg = new SVGMaker("shapeAlgorithm.svg", 900, 900);
        Circle c = new Circle(450, 450, 5);
        circleList.add(c);

        double delta_y;
        double delta_x;

        for(int i=0; i < 500; i++) {
            int index =0;
            double mindist = 10000000;
            Circle closest;
             c = new Circle();
             c.setRandom(0,900,0,900,5,5);
            for (int j = 0; j<circleList.size();j++){
                double dist = c.getDist(circleList.get(j));
                if (dist < mindist){
                    mindist = dist;
                    index = j;
                }

            }

            closest = circleList.get(index);
            delta_x = c.x - closest.x;
            delta_y = closest.y - c.y;

            double theta = Math.atan2(delta_y, delta_x);

            double r = closest.r + c.r;
            c.x = closest.x + r * Math.cos(theta);
            c.y = closest.y - r * Math.sin(theta);

            circleList.add(c);
            svg.drawCircle(c);
            svg.drawFill(f,4,0);

            //Get good at arrayLists for this thing and ask professor Watta about the distance.
        }
        svg.close();
    }

}
