
import javax.swing.JFrame;

public class Animation2D extends JFrame {
    Mypanel panel;

    Animation2D(){
        panel=new Mypanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel);
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);
    }
}
