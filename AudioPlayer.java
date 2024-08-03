

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class AudioPlayer {
    public static void main(String[] args) throws UnsupportedAudioFileException,IOException,LineUnavailableException {
        Scanner scan = new Scanner(System.in);
        File file=new File("Husn.wav");
        AudioInputStream audio =AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audio);

        String response="";

        while(!response.equals("Q")){
            System.out.println("P=play,S=stop,R=reset,Q=quit");
            System.out.println("Enter your choice:");
            response=scan.next();
            response=response.toUpperCase();

            switch(response){
                case ("P"):clip.start();
                break;
                case ("S"):clip.stop();
                break;
                case ("R"):clip.setMicrosecondPosition(0);
                break;
                case ("Q"):clip.close();
                scan.close();
                break;
                default:
                System.out.println("Not Valid Response");
            }
            System.out.println("Byee!");
           
        }
    }
}
