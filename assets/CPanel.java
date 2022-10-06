package assets;

import javax.swing.JPanel;

public class CPanel extends JPanel {
    int xSize, ySize;

    public CPanel(int xSize, int ySize) {
        this.setBounds(0, 0, xSize, ySize);
    }
}