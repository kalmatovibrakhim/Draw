import java.awt.*;
import javax.swing.*;

public abstract class Shape  extends JFrame {
    private String color = "Blue";

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void draw();

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}

