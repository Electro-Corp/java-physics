import assets.*;
import javafx.scene.paint.Color;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Engine extends JPanel {
    double xSize, ySize;
    
    public Engine() {
        init();
    }   

    private void init() {
        // initializes a JFrame with a height of 400px and a width of 400px with the name Physics 
        // Frame can be resized
        CFrame frame = new CFrame(400, 400, "Physics");
        CPanel panel = new CPanel(400,400);
    }   

        @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);  
        g.drawRect(230,80,10,10);  
        g.setColor(Color.RED);  
        g.fillRect(230,80,10,10);  
      }
    
      public Dimension getPreferredSize() {
        return new Dimension(xSize, ySize); // appropriate constants
      }
}
