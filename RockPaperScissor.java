import java.util.Random;
import java.util.Scanner;
public class RockPaperScissor {
    public static void main(String[] args) {
       Random r= new Random();
       Scanner s=new Scanner(System.in);
       int computerMove;
       byte playerMove;
       byte w=0,l=0,d=0;
       String name;
       System.out.println("Enter your name:");
       name=s.nextLine();

       for(int i=1;i<=3;i++){
       //player move
       System.out.println(name+" Enter your choice:");
       System.out.println("Press 1 ROCK:");
       System.out.println("Press 2 PAPER :");
       System.out.println("Press 3 SCISSOR :");
        playerMove=s.nextByte();
    //choice of player
       switch(playerMove){
        case 1:
        System.out.println("ROCK");
        break;
         case 2:
        System.out.println("PAPER");
        break;
         case 3:
        System.out.println("SCISSOR");
        break;
        default:
        System.out.println("INVALID CHOICE.........");
       }
       //computer move
       computerMove=r.nextInt(3+1);
       switch(computerMove){
        case 1:
        System.out.println("ROCK");
        break;
         case 2:
        System.out.println("PAPER");
        break;
         case 3:
        System.out.println("SCISSOR");
        break;
        default:
        System.out.println("INVALID CHOICE.........");
       }
       //winner and draw check
       if(playerMove==computerMove){
        System.out.println("DRAW");
        d++;
       }
       else if(playerMove==1&&computerMove==3||playerMove==2&&computerMove==1||playerMove==3&&computerMove==2){
        System.out.println(name+" win");
        w++;
       }
       else{
        System.out.println("Computer Win");
        l++;
       }
       System.out.println();
    }
        System.out.println(name + " wins "+ w);
        System.out.println( " Computer wins "+ l);
        System.out.println( "Draw wins "+ d);
       s.close();
    }
}
