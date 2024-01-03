import javax.swing.*;
import java.awt.*;

public class LoopLab extends JPanel {
    String type;
    int n;

    public LoopLab() {
        type = JOptionPane.showInputDialog("你希望使用加法表還是乘法表？？（請輸入 A 或 M）");
        n = Integer.parseInt(JOptionPane.showInputDialog("希望表格大小為（? x ?）??"));
    }
    @Override
    public void paintComponent(Graphics g) {
        var w = getWidth();
        var h = getHeight();
        int cellWidth = w/n;
        int cellHeight = h/n;
        int x=0;
        int y=0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i==1||j==1) {
                    g.setColor(Color.yellow);
                    g.fillRect(x,y,cellWidth,cellHeight);
                }
                g.setColor(Color.blue);
                if (i==1) {
                    g.drawString(""+j, x+10 , y+18);
                } else if(j==1) {
                    g.drawString(i+"", x+10 , y+18);
                } else {
                    int v;
                    if (type.toLowerCase().equals('a')) {
                        v = i+j;
                    } else {
                        v = i*j;
                    }
                    g.drawString(v+"", x+10 , y+18);
                }

                x += cellWidth;
                g.drawRect(x, y, cellWidth ,cellHeight);
            }
            x=0;
            y += cellHeight;



        }

    }
    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(300, 300);
        window.setContentPane(new LoopLab());
        window.setVisible(true);
    }

}
