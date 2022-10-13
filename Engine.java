import assets.*;
import assets.Point;

import java.awt.event.*;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.EventListener;
import java.awt.Color;
import javax.swing.*;
import physics.Physics;
import objects.Square;

public class Engine extends JPanel implements ActionListener, KeyListener {
    int xSize, ySize, i;
    ArrayList<Square> squaresToRender = new ArrayList<>();

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
        Physics e = new Physics();
        ValueHolder bruh = e.allXY(10, 0, 9.8, 3);
        squaresToRender = new ArrayList<Square>();
        for (int j; squaresToRender.size() < i;) {
            squaresToRender.add(new Square(new Point(bruh.xs.get(i).intValue(), bruh.y.get(i).intValue()),
                    new Point(bruh.xs.get(i).intValue() + 10, bruh.y.get(i).intValue() + 10)));
        }

        for (int j = 0; j < squaresToRender.size(); j++) {
            squaresToRender.get(j).render(g);
        }

        System.out.println(squaresToRender);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }

    public void keyPressed(KeyEvent e) {
        int keycode = e.getKeyCode();
        System.out.println(keycode);
        if (keycode == KeyEvent.VK_LEFT) {
            if (i > 0)
                i--;
            System.out.println("i: " + i);
            System.out.println("Size Before: " + squaresToRender.size());
            squaresToRender.remove(squaresToRender.size() - 1);
            System.out.println("Size After: " + squaresToRender.size());
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
