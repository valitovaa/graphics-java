import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int w = 900;
        int h = 800;
        JFrame f = new JFrame();
        DrawingCanvas dc = new DrawingCanvas(w,h);
        f.setSize(w,h);
        f.setTitle("Snowman");
        f.add(dc);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(new Window());
        f.setVisible(true);



    }

    static class Window extends JPanel {
        Window() {
            setSize(300, 250);
            ImageIcon icon = new ImageIcon("pic.png");


            setVisible(true);
        }
    }
}