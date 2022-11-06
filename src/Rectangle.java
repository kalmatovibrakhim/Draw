
import java.awt.*;

public class Rectangle extends Shape {
    private int coordinateX;
    private int coordinateY;

    private int width;
    private int heigth;


    public Rectangle(int coordinateX, int coordinateY, int width, int heigth) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.width = width;
        this.heigth = heigth;
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    public void Rectangle (){
        setTitle("RECTANGLE");
        setSize(1000,1000);
        setVisible(true);

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    public void paint(Graphics g){
        g.drawRect(coordinateX,coordinateY,width,heigth);
        switch (super.getColor()) {
            case "BLUE" -> g.setColor(Color.BLUE);
            case "RED" -> g.setColor(Color.RED);
            case "YELLOW" -> g.setColor(Color.YELLOW);
            case "GREAN" -> g.setColor(Color.GREEN);
            case "ORANGE" -> g.setColor(Color.ORANGE);
            default -> g.setColor(Color.BLACK);
        }
    }

    @Override
    public void draw() {
        Rectangle();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
