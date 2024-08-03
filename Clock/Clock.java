import javax.swing.*;
import java.awt.*;
import java.text.*;
import java.util.*;

public class Clock extends JFrame {
    Calendar calendar;
    SimpleDateFormat timeFormat;
    SimpleDateFormat dayFormat;
    SimpleDateFormat dateFormat;
    JLabel timeLabel;
    JLabel dayLabel;
    JLabel dateLabel;
    String time;
    String day;
    String date;
    
    Clock(){

        timeFormat=new SimpleDateFormat("hh:mm:ss a");

        timeLabel=new JLabel();
        timeLabel.setBounds(10,10,270,100);
        timeLabel.setFont(new Font("MV Boli",Font.BOLD,37));
        timeLabel.setForeground(Color.GREEN);
        timeLabel.setBackground(Color.BLACK);
        timeLabel.setOpaque(true);

        dayFormat=new SimpleDateFormat("EEEE");

        dayLabel=new JLabel();
        dayLabel.setBounds(90,90,270,100);
        dayLabel.setFont(new Font("Arial",Font.BOLD,35));
        dayLabel.setOpaque(true);

        dateFormat=new SimpleDateFormat("MMMMM dd, yyyy");

        dateLabel=new JLabel();
        dateLabel.setBounds(25,160,270,100);
        dateLabel.setFont(new Font("Arial",Font.BOLD,30));
        dateLabel.setOpaque(true);


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(timeLabel);
        this.add(dayLabel);
        this.add(dateLabel);
        this.setTitle("CLOCK");
        this.setSize(300,300);
        this.setLayout(null);
        this.setVisible(true);

        setTime();
    }

    private void setTime() {
       while(true){
            time=timeFormat.format(Calendar.getInstance().getTime());
            timeLabel.setText(time);

            day=dayFormat.format(Calendar.getInstance().getTime());
            dayLabel.setText(day);

            date=dateFormat.format(Calendar.getInstance().getTime());
            dateLabel.setText(date);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
       }
    }
}
