package Lib;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class RollingBall extends JPanel implements ActionListener{
    public int r1 = 0 , x = 100;
    
    public RollingBall(){
        Timer timer = new Timer(100, this);
        timer.start();
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawOval(x,90,80,80);
        g.setColor(Color.BLACK);
        g.fillArc(x, 90, 80, 80, r1, 180);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        x -= 2;
        r1 += 2;
        if (x == -80) {
            x = getWidth();
        }
        if (r1 == 360) {
            r1 = 0;
        }
        repaint();

    }
}
