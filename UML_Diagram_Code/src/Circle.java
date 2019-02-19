public class Circle
{
    //member variables

    public double x;
    public double y;
    public double r;

    //Methods
    public Circle(double x_in, double y_in, double r_in)
    {
        x = x_in;
        y = y_in;
        r = r_in;
    }

    public Circle()
    {
        x = 0;
        y = 0;
        r = 1;
    }

    public double getDist(double x1, double y1, double x2, double y2)
    {
        double sum = (x1-x2) * (x1-x2) + (y1-y2) * (y1-y2);
        return (Math.sqrt(sum));
    }

    public double getDist(Circle other)
    {
        double sum = (x-other.x) * (x-other.x) + (y-other.y) * (y-other.y);
        return (Math.sqrt(sum));
    }

    public boolean intersets(Circle other)
    {
        boolean result;
        double dist = getDist(x, y, other.x, other.y);

        if (dist < other.r) result = true;
        else
        {
            result = false;
        }
        return result;
    }

    public void copy(Circle other)
    {
        x = other.x;
        y = other.y;
        r = other.r;

    }

    public void print(String label)
    {
        System.out.println("\nCircle object: " + label);
        System.out.println("\n + x: " + x);
        System.out.println("\n + y: " + y);
        System.out.println("\n + r: " + r);
    }

    public void setRandom(double xmin, double xmax, double ymin, double ymax, double rmin, double rmax){
        x = (int) (Math.random() * (xmax - xmin) + xmin);
        y = (int) (Math.random() * (ymax - ymin) + xmin);
        r = (int) (Math.random() * (rmax - rmin) + rmin);
    }

    public void findArea(){
        double area = 0;
        area = Math.PI * (r*r);
        System.out.println("The circle's area = " + area);
    }


}