import assets.*;
import java.awt.*;
import javax.swing.*;

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
        CPanel panel = new CPanel(xSize, ySize);

        frame.add(panel);
        frame.pack();
        frame.setBounds(0, 0, xSize, ySize);
        panel.setBounds(0, 0, xSize, ySize);

        panel.repaint();
    }

    
    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.fillRect(0,0, 100, 100);
    }

    public Dimension getSize() {
        return new Dimension(xSize, ySize); // appropriate constants
    }
}
