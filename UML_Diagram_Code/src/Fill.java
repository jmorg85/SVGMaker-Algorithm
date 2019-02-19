public class Fill {
    double max;
    double min;
    double fillOpacity;
    String color;

    public Fill(double max_in, double min_in, double fillOpacity_in){
        max = max_in;
        min = min_in;
        fillOpacity = fillOpacity_in;
    }

    public String generateRandomColor() {

        int value;
            value = (int) (Math.random() * (max - min) + min);

            if (value == 0) {
                color = "rgb(255, 0, 0)";
            }
            if (value == 1){
                color = "rgb(0, 255, 0)";
            }


                if (value == 2) {
                    color = "rgb(0, 0, 255)";
                }

            if (value == 3){
                color = "rgb(0, 0, 0)";
            }
        return color;
    }

    public double setOpacity(double fillOpacity){

        return fillOpacity;
    }

}
