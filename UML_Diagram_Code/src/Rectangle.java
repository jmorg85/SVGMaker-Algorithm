import java.sql.SQLOutput;

public class Rectangle {
    public double x;
    public double y;
    public double width;
    public double height;

    public Rectangle(double x_in, double y_in, double width_in, double height_in){
        x = x_in;
        y = y_in;
        width = width_in;
        height = height_in;
    }
    public void FindArea(int length, int width)
    {
        int Area = length * width;
        System.out.println("Rectangle area = " + Area);
    }
    public void FindPerimeter(int length, int width)
    {
        int perimeter = (2*length) + (2*width);
        System.out.println("The perimeter of the rectangle is: " + perimeter);
    }
    public void FindVolume(int length, int width, int height)
    {
        int volume = length*width*height;
        System.out.println("The volume of the rectangle is: "+ volume);
    }

}
