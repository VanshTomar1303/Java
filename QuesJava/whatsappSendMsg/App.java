package whatsappSendMsg;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try{
            Scanner scan=new Scanner(System.in);
            System.out.println("Enter the text:");
            String msg=scan.nextLine();
            System.out.println("How many time you want to send this msg:");
            int size=scan.nextInt();

            StringSelection str=new StringSelection(msg);
            Clipboard clip= Toolkit.getDefaultToolkit().getSystemClipboard();
            clip.setContents(str,null);

            Thread.sleep(2000);

            Robot robot = new Robot();
            for(int i=0;i<=size;i++){
               robot.keyPress(KeyEvent.VK_CONTROL);
               robot.keyPress(KeyEvent.VK_V);

                robot.keyRelease(KeyEvent.VK_CONTROL);
                robot.keyRelease(KeyEvent.VK_V);

                robot.keyPress(KeyEvent.VK_ENTER);
                robot.keyRelease(KeyEvent.VK_ENTER);

                Thread.sleep(1000);
            }
            scan.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
