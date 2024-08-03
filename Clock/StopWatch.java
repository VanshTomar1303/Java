import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class StopWatch implements ActionListener{
    JFrame frame = new JFrame();
	JButton startButton = new JButton("START");
	JButton resetButton = new JButton("RESET");
	JLabel timeLabel = new JLabel();
    int elapsedTime=0;
    int sec=0;
    int min=0;
    int hrs=0;
    boolean started=false;
    String sec_String=String.format("%02d",sec);
    String min_String=String.format("%02d",min);
    String hrs_String=String.format("%02d",hrs);

    Timer timer = new Timer(1000, new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
           elapsedTime+=1000;
           hrs=(elapsedTime/3600000);
           min=(elapsedTime/60000)%60;
           sec=(elapsedTime/1000)%60;
           sec_String=String.format("%02d",sec);
           min_String=String.format("%02d",min);
           hrs_String=String.format("%02d",hrs);
           timeLabel.setText(hrs_String+":"+min_String+":"+sec_String);

        }
        
    });

    StopWatch(){

        timeLabel.setText(hrs_String+":"+min_String+":"+sec_String);
        timeLabel.setBounds(70,100,350,100);
        timeLabel.setFont(new Font("Verdana",Font.BOLD,50));
        timeLabel.setBorder(BorderFactory.createBevelBorder(1));
        timeLabel.setOpaque(true);
        timeLabel.setHorizontalAlignment(JTextField.CENTER);

        startButton.setBounds(70,200,175,100);
        startButton.addActionListener(this);
        resetButton.setBounds(245,200,175,100);
        resetButton.addActionListener(this);

        frame.add(timeLabel);
        frame.add(startButton);
        frame.add(resetButton);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==startButton){
       
        if(started==false){
            started=true;
            startButton.setText("STOP");
            start();
        }
        else{
            started=false;
            startButton.setText("START");
            stop();
        }
       }
       if(e.getSource()==resetButton){
            started=false;
            startButton.setText("START");
            reset();
       }
    }

    void start(){
        timer.start();
    }
    void stop(){
        timer.stop();
    }
    void reset(){
        timer.stop();
        elapsedTime=0;
        sec=0;
        min=0;
        hrs=0;
        sec_String=String.format("%02d",sec);
        min_String=String.format("%02d",min);
        hrs_String=String.format("%02d",hrs);
        timeLabel.setText(hrs_String+":"+min_String+":"+sec_String);
    }
    
}
