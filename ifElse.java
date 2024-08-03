import java.util.Scanner;

public class ifElse{
    public static void main(String[] args) {
        // int a=9,b=9,c=9;
        // if(a>b&&a>c){
        //     System.out.println(a  + " is greater then " +  b+" "+c);
        // }
        // else if(b>a&&b>c){
        //     System.out.println(b + " is greater then " + a+" "+c);
        // }
        //  else if(c>a&&c>a){
        //     System.out.println(c + " is greater then " + a+" "+b);
        // }
        // else{
        //     System.out.println(a+" "+b+" "+c+" are equal");
        // }
        Scanner s=new Scanner(System.in);
        System.out.println("enter your choice");
         byte a =s.nextByte();
        switch(a){
            case 1:
            System.out.println("hello");
            break;
            case 2:
            System.out.println("hi");
            break;
            default:
            System.out.println("bye");
        }
        s.close();
    }
}