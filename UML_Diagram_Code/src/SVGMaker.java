import java.io.*;
public class SVGMaker {
    public int height;
    public int width;
    public String fileName;

    private  PrintWriter fileWriter;

    public SVGMaker(String fileName_in, int width_in, int height_in){
        fileName = fileName_in;

        width = width_in;
        height = height_in;

        try{
            fileWriter = new PrintWriter(new File(fileName));

            fileWriter.print("<svg " + "\nxmlns = 'http://www.w3.org/2000/svg'" + "\nxmlns:xlink = 'http://www.w3.org/1999/xlink'" + "\nversion = '1.1'" + "\nwidth = '" + width + "'" + " height = '" + height + "'>");
        }
        catch (FileNotFoundException ex){
            System.out.println("File not found.");
        }

    }
    public void drawCircle( Circle c){
        fileWriter.print("\n     <circle cx = '" + c.x + "' cy = '" + c.y +"'" +
                "\nr = '" + c.r + "'");
    }

    public void writeText(Text t){
        fileWriter.print("\n <text x = '" + t.x + "' y = '" + t.y +
                "\n fontfamily = '" + t.font_family + "' \n"
        + "font-size = '" + "'\n" + "font-style = '" + t.fontStyle + "' \n");
    }

    public void textEnder(String s){
        fileWriter.print(">" + s + "</text>");
    }

    public void drawRectangle(Rectangle r){
        fileWriter.print("\n  <rect x = '" + r.x + "' y = '" + r.y + "' \n"
                + "width = '" + r.width + "' height ='" + r.height + "'");
    }

    public void drawLine(Line l){
        fileWriter.print("\n <line x1 = '" + l.x1 + "' y1 = '" + l.y1 + "'\n"
        + "x2 = '" + l.x2 + "' y2 = '" + l.y2 + "'");
    }

    public void drawPath(Path p){
        fileWriter.print("\n <path d = 'M" + p.x1 + " " + p.y1 + " L" + p.x2 + " " + p.y2 + " L" + p.x3 + " " + p.y3 + "z'" );
    }

    public void lineEnder(){
        fileWriter.print("/>");
    }

    public void drawFill(Fill f, double max_in, double min_in)
    {
        double opacity = f.setOpacity(.75);
        String color = f.generateRandomColor();
        fileWriter.print(" \nfill = '" + color + "'");
        fileWriter.print("\nopacity = '" + opacity + "'/>");
    }

    public void fillYellow(Fill f){
        double opacity = f.setOpacity(.8);
        String color = "rgb(255,255,0)";
        fileWriter.print(" \nfill = '" + color + "'");
        fileWriter.print("\nopacity = '" + opacity + "'/>");
    }

    public void fillRed(Fill f){
        double opacity = f.setOpacity(.8);
        String color = "rgb(255,0,0)";
        fileWriter.print(" \nfill = '" + color + "'");
        fileWriter.print("\nopacity = '" + opacity + "'/>");
    }

    public void fillBlue(Fill f){
        double opacity = f.setOpacity(.8);
        String color = "rgb(0,0,255)";
        fileWriter.print(" \nfill = '" + color + "'");
        fileWriter.print("\nopacity = '" + opacity + "'/>");
    }

    public void fillWhite(Fill f){
        double opacity = f.setOpacity(.8);
        String color = "rgb(255,255,255)";
        fileWriter.print(" \nfill = '" + color + "'");
        fileWriter.print("\nopacity = '" + opacity + "'/>");
    }

    public void drawStroke(Stroke s, double max_in, double min_in, int strokeWidth_in){
        int width = strokeWidth_in;
        String color = s.getColor();
        fileWriter.print("\nstroke = '" + color + "' stroke-width = '" + width + "'");
    }

    public void blackStroke(Stroke s, int strokeWidth_in){
        int width = strokeWidth_in;
        String color = "rgb(0,0,0)";
        fileWriter.print("\nstroke = '" + color + "' stroke-width = '" + width + "'");
    }

    public void close(){
        fileWriter.print("\n\n</svg>");
        fileWriter.flush();
        fileWriter.close();
    }
}
