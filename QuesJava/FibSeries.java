import java.util.Scanner;

public class FibSeries {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=scan.nextInt();
        int a=0,b=1,c=0;
        System.out.println("-------------------------------------");
        for(int i=1;i<=n;i++){
            c=a+b;
            a=b;
            b=c;
            System.out.println(c);
        }
        scan.close();
    }
}