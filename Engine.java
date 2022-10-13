import assets.*;
import assets.Point;

import java.awt.event.*;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.EventListener;
import java.awt.Color;
import javax.swing.*;
import physics.RightVelocity;
import objects.*;

public class Engine extends JPanel implements ActionListener, KeyListener {
    int xSize, ySize, i;
    ArrayList<Square> squaresToRender = new ArrayList<>();
    ArrayList<Circle> circlesToRender = new ArrayList<>();

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
        frame.addKeyListener(this);
        frame.pack();
        frame.setBounds(0, 0, xSize, ySize);
        frame.setResizable(false);
        this.setBounds(0, 0, xSize, ySize);
        this.setVisible(false);
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.red);
        RightVelocity rV = new RightVelocity();

        ValueHolder squareCords = rV.allXY(10, 0, 9.8, 3);
        // renderSquares(g, squareCords);

        ValueHolder circleCords = rV.allXY(10, 0, 9.8, 3);
        renderCircles(g, circleCords);
    }

    public void renderCircles(Graphics g, ValueHolder circleCords) {
        circlesToRender = new ArrayList<Circle>();

        for (int j; squaresToRender.size() < i;) {
            circlesToRender.add(new Circle(new Point(circleCords.xs.get(i).intValue(),
                    circleCords.y.get(i).intValue()),
                    new Point(circleCords.xs.get(i).intValue() + 10, circleCords.y.get(i).intValue() + 10)));
        }

        for (int j = 0; j < circlesToRender.size(); j++) {
            circlesToRender.get(j).render(g);
        }
    }

    public void renderSquares(Graphics g, ValueHolder squareCords) {
        squaresToRender = new ArrayList<Square>();

        for (int j; squaresToRender.size() < i;) {
            squaresToRender.add(new Square(new Point(squareCords.xs.get(i).intValue(), squareCords.y.get(i).intValue()),
                    new Point(squareCords.xs.get(i).intValue() + 10, squareCords.y.get(i).intValue() + 10)));
        }

        for (int j = 0; j < squaresToRender.size(); j++) {
            squaresToRender.get(j).render(g);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }

    public void keyPressed(KeyEvent e) {
        int keycode = e.getKeyCode();
        if (keycode == KeyEvent.VK_LEFT) {
            if (i > 0)
                i--;
        } else if (keycode == KeyEvent.VK_RIGHT) {
            i++;
        }

        this.repaint();
        this.setVisible(true);
    }

    public void keyReleased(KeyEvent e) {

    }

    public void keyTyped(KeyEvent e) {

    }
}
