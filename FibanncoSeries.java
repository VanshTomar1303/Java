import java.util.Scanner;

public class FibanncoSeries {
    public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
      int num;
      int a=0,b=1,c;
      System.out.println("Enter a Number:");
      num=scan.nextInt(); 
      System.out.println("Fibannico Series"); 
      for(int i=0;i<=num;i++){
            c=a+b;
            a=b;
            b=c;
            System.out.println(c);
      }
      scan.close();
    }
}