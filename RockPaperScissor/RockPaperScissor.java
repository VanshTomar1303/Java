import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class RockPaperScissor extends JFrame implements ActionListener{

    JLabel label;
    JButton rock;
    JButton scissor;
    JButton paper;
    Random random=new Random();
    String []comp={"ROCK","PAPER","SCISSOR"};
    JLabel win;
    

    RockPaperScissor(){
        //title
        label=new JLabel("ROCK PAPER SCISSOR");
        label.setBounds(50,10,400,60);
        label.setFont(new Font("Verdana",Font.BOLD,30));
        label.setForeground(Color.WHITE);
       
        //buttons
        rock=new JButton("ROCK");
        rock.setBounds(30,150,100,50);
        rock.setFocusable(false);
        rock.setFont(new Font("Verdana",Font.BOLD,15));
        rock.addActionListener(this);

        scissor=new JButton("SCISSOR");
        scissor.setBounds(190,150,100,50);
        scissor.setFocusable(false);
        scissor.setFont(new Font("Verdana",Font.BOLD,13));
        scissor.addActionListener(this);

        paper=new JButton("PAPER");
        paper.setBounds(350,150,100,50);
        paper.setFocusable(false);
        paper.setFont(new Font("Verdana",Font.BOLD,15));
        paper.addActionListener(this);

        //scoreboard
        win=new JLabel();
        win.setBounds(130,250,400,50);
        win.setFont(new Font("Verdana",Font.BOLD,35));
        win.setForeground(Color.WHITE);

        this.add(label);
        this.add(rock);
        this.add(scissor);
        this.add(paper);
        this.add(win);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("ROCK-PAPER-SCISSOR");
        this.getContentPane().setBackground(Color.BLACK);
        this.setSize(500,500);
        this.setLayout(null);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int index=random.nextInt(3);
        String compMove=comp[index];
        if(e.getSource()==rock){
            if(compMove.equals("PAPER")){
                win.setText("YOU LOSE!");
            }
            else if(compMove.equals("SCISSOR")){
                win.setText("YOU WIN!");
            }
            else{
                win.setText("DRAW");
            }
        }
        if(e.getSource()==paper){
            if(compMove.equals("SCISSOR")){
                win.setText("YOU LOSE!");
            }
            else if(compMove.equals("ROCK")){
                win.setText("YOU WIN!");
            }
            else{
                win.setText("DRAW");
            }
        }
        if(e.getSource()==scissor){
            if(compMove.equals("ROCK")){
                win.setText("YOU LOSE!");
            }
            else if(compMove.equals("PAPER")){
                win.setText("YOU WIN!");
            }
            else{
                win.setText("YOU WIN!");
            }
        }
    }
}