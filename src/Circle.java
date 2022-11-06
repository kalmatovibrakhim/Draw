import java.awt.*;

public class Circle extends Shape{
    private int coordinateX ;
    private int coordinateY ;
    private int radius ;

    public Circle(int coordinateX, int coordinateY, int radius) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.radius = radius;
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    public void circle(){
        setTitle("CIRCLE");
        setSize(1000, 1000);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
    }
    public void paint(Graphics g){
        g.drawOval(coordinateX,coordinateY,radius,radius);
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
        circle();
    }

    @Override
    public String toString() {
        return "Circle{" +
                "coordinateX=" + coordinateX +
                ", coordinateY=" + coordinateY +
                ", radius=" + radius +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
