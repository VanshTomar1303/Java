import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int n,c=1;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number:");
        n=scan.nextInt();
        int org=n;
        while (n!=0){
            c*=n;
            n--;
        }
        System.out.println("Factorial of "+org+" is "+c);
        scan.close();
    }
}
