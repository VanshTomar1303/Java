import javax.swing.*;


public class Graphic extends JFrame {
    
    GraphicPanel panel;
    Graphic(){
        panel=new GraphicPanel();
        this.add(panel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
  
}
