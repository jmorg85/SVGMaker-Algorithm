public class Stroke {
    double max;
    double min;
    String color;
    int strokeWidth;

    public Stroke(double max_in, double min_in, int strokeWidth_in){
        max = max_in;
        min = min_in;
        strokeWidth = strokeWidth_in;
    }
    public String getColor(){
        int value;
        value = (int) (Math.random() * (max - min) + min);

        if (value == 0) {
            color = "red";
        }
        if (value == 1){
            color = "green";
        }


        if (value == 2) {
            color = "blue";
        }

        if (value == 3){
            color = "black";
        }
        return color;
    }
    public int getStrokeWidth(int strokeWidth){
        return strokeWidth;
    }

}
