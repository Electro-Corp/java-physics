package assets;

import javax.swing.JPanel;

public class Panel extends JPanel {
    int xSize, ySize;

    public Panel(int xSize, int ySize) {
        this.setBounds(0, 0, xSize, ySize);
    }
}