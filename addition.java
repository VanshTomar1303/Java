import java.util.Scanner;

public class addition {
    public static void main(String[] args) {
         Scanner a = new Scanner(System.in);
         System.out.println("Enter number 1:");
         int b=a.nextInt();
         System.out.println("Enter number 2:");
          int c=a.nextInt();  
          int sum = b+c;
          System.out.println("The sum is :"); 
          System.out.println(sum);
          a.close();
    }
}