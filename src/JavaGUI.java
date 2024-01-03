import javax.swing.*;
import java.awt.*;

public class JavaGUI extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
        g.drawString("Hello world!!", 10 , 20);
        ImageIcon img = new ImageIcon("Hamburger-612x612.jpg");
        img.paintIcon(null, g, 0, 0);
    }
    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(300, 300);
        window.setContentPane(new JavaGUI());
        window.setVisible(true);
    }
}
