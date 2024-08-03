import java.awt.*;
//import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;

import java.awt.event.*;
import javax.swing.*;

public class Mypanel extends JPanel implements ActionListener {
    final int PANEL_WIDTH = 500;
    final int PANEL_HEIGHT = 500;
    Image enemy;
    Image backgroundSpace;
    Timer timer;
    int xVelocity=1;
    int yVelocity=1;
    int x=0;
    int y=0;

    Mypanel(){
        this.setPreferredSize(new Dimension(PANEL_WIDTH,PANEL_HEIGHT));
        this.setBackground(Color.BLACK);
        enemy=new ImageIcon("enemy1.png").getImage();
        backgroundSpace=new ImageIcon("space.png ").getImage();
        timer=new Timer(10,this);
        timer.start();
    }
    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2D=(Graphics2D) g;
        g2D.drawImage(backgroundSpace,0,0,null);
        g2D.drawImage(enemy,x,y,null);
       
    }
    @Override
    public void actionPerformed(ActionEvent e) {
    //    if(x>=PANEL_WIDTH-enemy.getWidth(null)||x<0){
    //     xVelocity=xVelocity* -1;
    //    }
    //     x=x+xVelocity;
    if(y>=PANEL_WIDTH-enemy.getWidth(null)||y<0){
        yVelocity=yVelocity* -1;
       }
        y=y+yVelocity;


       repaint();
    }
}
