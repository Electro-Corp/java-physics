package objects;

import java.awt.Color;
import java.awt.Graphics;
import assets.*;

public class Square {
    private Point p1, p2;

    public Square(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;

    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public int width() {
        if (p2.x() - p1.x() > 0)
            return (p2.x() - p1.x());
        else
            return (p1.x() - p2.x());
    }

    public int height() {
        if (p2.y() - p1.y() > 0)
            return (p2.y() - p1.y());
        else
            return (p1.y() - p2.y());
    }

    public void render(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillRect(p1.x(), p1.y(), width(), height());
    }
}
