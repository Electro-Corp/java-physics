import assets.*;
import assets.Point;

import java.awt.Graphics;
import java.awt.Color;
import javax.swing.*;
import physics.Physics;
import objects.Square;

public class Engine extends JPanel {
    int xSize, ySize;

    public Engine() {
        xSize = 400;
        ySize = 400;
        init();
    }

    public Engine(int x, int y) {
        xSize = x;
        ySize = y;
        init();
    }

    private void init() {
        // initializes a JFrame with a height of 400px and a width of 400px with the
        // name Physics
        // Frame can be resized
        CFrame frame = new CFrame(xSize, ySize, "Physics");

        frame.add(this);
        frame.pack();
        frame.setBounds(0, 0, xSize, ySize);
        this.setBounds(0, 0, xSize, ySize);
        this.repaint();
    }

    public void paint(Graphics g) {
        g.setColor(Color.red);
        Physics e = new Physics();

        ValueHolder bruh = e.allXY(10, 0, 9.8, 3);
        for (int i = 0; i < bruh.xs.size(); i++) {
            g.fillRect(bruh.xs.get(i).intValue(), bruh.y.get(i).intValue(), 10, 10);
        }

        Square s = new Square(new Point(10, 10), new Point(20, 20));
        s.render(g);
    }
}
