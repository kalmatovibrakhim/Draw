import javax.sound.sampled.Line;
import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
    Circle cir1 = new Circle(100,100,300);
    Shape cir2 = new Circle(200,200,300);
    Rectangle rec1 = new Rectangle(50,50,300,200);
    Shape rec2 = new Rectangle(100,100,400,300);

    Shape[] shapes = {cir1,cir2};
        for (Shape s:shapes) {
            s.draw();
        }
        System.out.println("blo blo blo ");
        System.out.println(cir1.equals(cir2));
    }

}