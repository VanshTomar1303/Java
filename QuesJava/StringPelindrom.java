/**
 * StringPelindrom
 */
import java.util.*;

public class StringPelindrom {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a string:");
        String str=scan.nextLine();
        char ch;
        String temp="";

        for(int i=0;i<str.length();i++){
            ch=str.charAt(i);
            temp = ch + temp;
        }
        if(temp.equals(str)){
            System.out.println(str+" is palindrom.");
        }
        else{
            System.out.println(str+" is not palindrom");
        }
        scan.close();
    }
}