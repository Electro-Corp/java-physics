package assets;

import javax.swing.JFrame;

public class CFrame extends JFrame {
    public CFrame(int frameVert, int frameHor, String frameName) {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle(frameName);
        this.setSize(frameHor, frameVert);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setLayout(null);
    }
}
