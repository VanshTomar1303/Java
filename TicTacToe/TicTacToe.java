
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class TicTacToe implements ActionListener{

    JFrame frame=new JFrame("TIC-TAC-TOE");
    Random random=new Random();
    JPanel title=new JPanel();
    JPanel btn_Panel=new JPanel();
    JLabel txtField=new JLabel();
    JButton[] btn=new JButton[9];
    boolean player1_turn;

    TicTacToe(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,800);
        frame.getContentPane().setBackground(new Color(97,97,97));
        frame.setLayout(new BorderLayout());

        txtField.setBackground(new Color(40,40,40));
        txtField.setForeground(Color.GREEN);
        txtField.setFont(new Font("Verdana",Font.BOLD,75));
        txtField.setHorizontalAlignment(JLabel.CENTER);
        txtField.setText("TIC TAC TOE");
        txtField.setOpaque(true);

        title.setLayout(new BorderLayout());
        title.setBounds(0,0,800,100);
        title.add(txtField);

        btn_Panel.setLayout(new GridLayout(3,3));
        //btn_Panel.setBackground(Color.BLUE);

        for(int i=0;i<9;i++){
            btn[i]=new JButton();
            btn_Panel.add(btn[i]);
            btn[i].setFont(new Font("Verdana",Font.BOLD,135));
            btn[i].setFocusable(false);
            btn[i].addActionListener(this);
        }

        frame.add(btn_Panel);
        frame.add(title,BorderLayout.NORTH);
        frame.setVisible(true);

        firstTurn();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for(int i=0;i<9;i++){
            if(e.getSource()==btn[i]){
                if(player1_turn){
                    if(btn[i].getText()==""){
                        btn[i].setForeground(Color.BLUE);
                        btn[i].setText("X");
                        player1_turn=false;
                        txtField.setText("O-Turn");
                        check();
                    }
                }
                else{
                    if(btn[i].getText()==""){
                        btn[i].setForeground(Color.RED);
                        btn[i].setText("O");
                        player1_turn=true;
                        txtField.setText("X-Turn");
                        check();
                    } 
                }
            }
        }
    }
    public void firstTurn(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if(random.nextInt(2)==0){
            player1_turn=true;
            txtField.setText("X-Turn");
        }
        else{
            player1_turn=false;
            txtField.setText("O-Turn");
        }
    }
    public void check(){
        //XWin
        if(
            (btn[0].getText()=="X") &&
            (btn[1].getText()=="X") &&
            (btn[2].getText()=="X")
        ){
            xWins(0, 1, 2);
        }
        if(
            (btn[3].getText()=="X") &&
            (btn[4].getText()=="X") &&
            (btn[5].getText()=="X")
        ){
            xWins(3, 4, 5);
        }
        if(
            (btn[6].getText()=="X") &&
            (btn[7].getText()=="X") &&
            (btn[8].getText()=="X")
        ){
            xWins(6, 7, 8);
        }
        if(
            (btn[0].getText()=="X") &&
            (btn[3].getText()=="X") &&
            (btn[6].getText()=="X")
        ){
            xWins(0, 3, 6);
        }
        if(
            (btn[1].getText()=="X") &&
            (btn[4].getText()=="X") &&
            (btn[7].getText()=="X")
        ){
            xWins(1, 4, 7);
        }
        if(
            (btn[2].getText()=="X") &&
            (btn[5].getText()=="X") &&
            (btn[8].getText()=="X")
        ){
            xWins(2, 5, 8);
        }
        if(
            (btn[0].getText()=="X") &&
            (btn[4].getText()=="X") &&
            (btn[8].getText()=="X")
        ){
            xWins(0, 4, 8);
        }
        if(
            (btn[2].getText()=="X") &&
            (btn[4].getText()=="X") &&
            (btn[6].getText()=="X")
        ){
            xWins(2, 4, 6);
        }
        //Owin
        if(
            (btn[0].getText()=="O") &&
            (btn[1].getText()=="O") &&
            (btn[2].getText()=="O")
        ){
            oWins(0, 1, 2);
        }
        if(
            (btn[3].getText()=="O") &&
            (btn[4].getText()=="O") &&
            (btn[5].getText()=="O")
        ){
            oWins(3, 4, 5);
        }
        if(
            (btn[6].getText()=="O") &&
            (btn[7].getText()=="O") &&
            (btn[8].getText()=="O")
        ){
            oWins(6, 7, 8);
        }
        if(
            (btn[0].getText()=="O") &&
            (btn[3].getText()=="O") &&
            (btn[6].getText()=="O")
        ){
            oWins(0, 3, 6);
        }
        if(
            (btn[1].getText()=="O") &&
            (btn[4].getText()=="O") &&
            (btn[7].getText()=="O")
        ){
            oWins(1, 4, 7);
        }
        if(
            (btn[2].getText()=="O") &&
            (btn[5].getText()=="O") &&
            (btn[8].getText()=="O")
        ){
            oWins(2, 5, 8);
        }
        
        if(
            (btn[0].getText()=="O") &&
            (btn[4].getText()=="O") &&
            (btn[8].getText()=="O")
        ){
            oWins(0, 4, 8);
        }
        if(
            (btn[2].getText()=="O") &&
            (btn[4].getText()=="O") &&
            (btn[6].getText()=="O")
        ){
            oWins(2, 4, 6);
        }
          
      
             if( (btn[0].getText()!="")&&
                 (btn[1].getText()!="")&&
                 (btn[2].getText()!="")&&
                 (btn[3].getText()!="")&&
                 (btn[4].getText()!="")&&
                 (btn[5].getText()!="")&&
                 (btn[6].getText()!="")&&
                 (btn[7].getText()!="")&&
                 (btn[8].getText()!="")){
                
           draw(0,1,2,3,4,5,6,7,8);
        }
            
        
    }
    public void draw(int a,int b,int c,int d,int e,int f,int g,int h,int i){
        for(int m=0;m<9;m++){
            btn[m].setEnabled(false);
        }
        txtField.setText("DRAW");
    }
    public void xWins(int a,int b,int c){
        btn[a].setBackground(Color.GREEN);
        btn[b].setBackground(Color.GREEN);
        btn[c].setBackground(Color.GREEN);
        for(int i=0;i<9;i++){
            btn[i].setEnabled(false);
        }
        txtField.setText("X wins");
    }
    public void oWins(int a,int b,int c){
        btn[a].setBackground(Color.GREEN);
        btn[b].setBackground(Color.GREEN);
        btn[c].setBackground(Color.GREEN);
        for(int i=0;i<9;i++){
            btn[i].setEnabled(false);
        }
        txtField.setText("O wins");
    }
    
    
}